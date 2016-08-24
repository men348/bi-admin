package com.chinadaas.platform.bi.server.service.impl;

import com.chinadaas.platform.bi.model.domain.JobFileQuery;
import com.chinadaas.platform.bi.model.domain.JobQuery;
import com.chinadaas.platform.bi.model.domain.PaginateHolder;
import com.chinadaas.platform.bi.model.enums.JobStatusEnum;
import com.chinadaas.platform.bi.model.enums.JobTypeEnum;
import com.chinadaas.platform.bi.server.adapter.NewEntResult;
import com.chinadaas.platform.bi.server.entity.Job;
import com.chinadaas.platform.bi.server.entity.JobFile;
import com.chinadaas.platform.bi.server.repository.GenericRepository;
import com.chinadaas.platform.bi.server.repository.JobRepository;
import com.chinadaas.platform.bi.server.service.JobService;
import com.chinadaas.platform.bi.server.schedule.JobExecutor;
import com.chinadaas.platform.bi.server.schedule.JobManager;
import com.chinadaas.platform.product.model.provider.Column;
import com.chinadaas.platform.product.model.provider.ColumnGroup;
import com.chinadaas.platform.product.resolver.MetadataResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

/**
 * Created by xie on 16/7/27.
 */
@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private GenericRepository repository;

    @Autowired
    private JobRepository jobRepository;

    private MetadataResolver resolver = new MetadataResolver();

    @Override
    @Transactional
    public Job addJob(Job job) {
        Job j = repository.save(job);
        String jobId = j.getId();
        JobTypeEnum type = j.getType();
        JobStatusEnum status = j.getStatus();
        String execTime = j.getExecTime();
        JobExecutor executor = new JobExecutor();
        if (type == JobTypeEnum.ONCE && status == JobStatusEnum.WAIT) { //一次性的等待任务
            JobManager.addOnceJob(job, executor);
        } else if (type != JobTypeEnum.ONCE && status == JobStatusEnum.NORMAL) { // 周期性的正常任务
            JobManager.addJob(job, executor);
        }

        return j;
    }

    @Override
    public PaginateHolder<Job> queryJobList(JobQuery query) {
        return jobRepository.queryJobList(query);
    }

    /**
     * 暂停任务
     */
    @Override
    @Transactional
    public Job pauseJob(String jobId) {
        Job job = repository.get(Job.class, jobId);
        JobStatusEnum status = job.getStatus();
        JobTypeEnum type = job.getType();
        if (type != JobTypeEnum.ONCE && status == JobStatusEnum.NORMAL) {
            job.setStatus(JobStatusEnum.STOP);
        }

        JobManager.removeJob(jobId, job.getType());
        return job;
    }

    /**
     * 恢复任务
     */
    @Override
    @Transactional
    public Job renewJob(String jobId) {
        Job job = repository.get(Job.class, jobId);
        JobTypeEnum type = job.getType();
        JobStatusEnum status = job.getStatus();
        if (type != JobTypeEnum.ONCE && status == JobStatusEnum.STOP) {
            job.setStatus(JobStatusEnum.NORMAL);
        }

        JobExecutor executor = new JobExecutor();
        JobManager.addJob(job, executor);
        return job;
    }

    @Override
    @Transactional
    public Job completeJob(String jobId) {
        Job job = repository.get(Job.class, jobId);
        JobTypeEnum type = job.getType();
        JobStatusEnum status = job.getStatus();
        if (status != JobStatusEnum.DELETED) {
            job.setStatus(JobStatusEnum.COMPLETE);
        }
        return job;
    }

    /**
     * 删除任务
     */
    @Override
    @Transactional
    public Job deleteJob(String jobId) {
        Job job = repository.get(Job.class, jobId);
        JobStatusEnum status = job.getStatus();
        job.setStatus(JobStatusEnum.DELETED);
        return null;
    }

    @Override
    @Transactional
    public JobFile addJobFile(JobFile jobFile) {
        return repository.save(jobFile);
    }

    @Override
    public PaginateHolder<JobFile> queryJobFileList(JobFileQuery query) {
        return jobRepository.queryJobFileList(query);
    }

    @Override
    public java.util.List<Job> queryJobs() {
        return jobRepository.queryJobs();
    }

    @Override
    public ColumnGroup getMetadata() {
        return resolver.resolve(NewEntResult.class);
    }

    @Override
    public ColumnGroup getMetadata(List<String> columnIds) {
        ColumnGroup topGroup = this.getMetadata();
        List<ColumnGroup> groups = topGroup.getSubGroups();
        // 目前企业信息查询的数据最多分两层
        for(Iterator<ColumnGroup> groupIterator = groups.iterator(); groupIterator.hasNext();) {
            ColumnGroup group = groupIterator.next();
            // 修剪掉分组
            if(!this.isNeedColumnGroup(columnIds,group)) {
                groupIterator.remove();
            }
            // 修剪掉列
            for(Iterator<Column> columnIterator = group.getColumns().iterator(); columnIterator.hasNext();) {
                Column column = columnIterator.next();
                if(!columnIds.contains(column.getId())) {
                    columnIterator.remove();
                }
            }
        }
        return topGroup;
    }

    private boolean isNeedColumnGroup(List<String> columnIds, ColumnGroup group) {
        for(String columnId : columnIds) {
            if(columnId.startsWith(group.getCode())) return true;
        }

        return false;
    }
}
