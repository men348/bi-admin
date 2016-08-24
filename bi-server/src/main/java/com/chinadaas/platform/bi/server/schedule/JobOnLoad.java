package com.chinadaas.platform.bi.server.schedule;

import com.chinadaas.platform.bi.model.enums.JobStatusEnum;
import com.chinadaas.platform.bi.model.enums.JobTypeEnum;
import com.chinadaas.platform.bi.server.entity.Job;
import com.chinadaas.platform.bi.server.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by xie on 16/8/2.
 */

@Component
public class JobOnLoad {

    @Autowired
    private JobService service;

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        List<Job> jobs = service.queryJobs();
        if(jobs != null) {
            for (Job job : jobs) {
                JobExecutor executor = new JobExecutor();
                JobStatusEnum status = job.getStatus();
                JobTypeEnum type = job.getType();
                if (type == JobTypeEnum.ONCE && status == JobStatusEnum.WAIT) {
                    JobManager.addOnceJob(job, executor);
                } else if(type != JobTypeEnum.ONCE && status == JobStatusEnum.NORMAL){
                    JobManager.addJob(job, executor);
                }
            }
        }
    }

}
