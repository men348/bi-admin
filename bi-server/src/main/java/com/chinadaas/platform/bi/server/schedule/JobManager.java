package com.chinadaas.platform.bi.server.schedule;

import com.chinadaas.platform.bi.model.enums.JobTypeEnum;
import com.chinadaas.platform.bi.server.entity.Job;
import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.quartz.impl.triggers.SimpleTriggerImpl;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xie on 16/8/2.
 */
public class JobManager {
    private static SchedulerFactory factory = new StdSchedulerFactory();

    public static void addOnceJob(Job job, JobExecutor executor) {
        String name = job.getId();
        String time = job.getExecTime();
        try {
            Scheduler scheduler = factory.getScheduler();
            JobDetailImpl jobDetail = new JobDetailImpl();
            jobDetail.setJobClass(executor.getClass());
            JobDataMap dataMap = new JobDataMap();
            dataMap.put("job", job);
            jobDetail.setJobDataMap(dataMap);
            jobDetail.setName(name);
            jobDetail.setGroup(JobTypeEnum.ONCE.toString());

            SimpleTriggerImpl trigger = new SimpleTriggerImpl();
            trigger.setName(name);
            trigger.setGroup(JobTypeEnum.ONCE.toString());
            Date startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(time);
            trigger.setStartTime(startDate);
            trigger.setRepeatCount(0);

            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addJob(Job job, JobExecutor executor) {
        String name = job.getId();
        JobTypeEnum type = job.getType();
        String time = job.getExecTime();
        try {
            Scheduler scheduler = factory.getScheduler();
            JobDetailImpl jobDetail = new JobDetailImpl();
            jobDetail.setJobClass(executor.getClass());
            JobDataMap dataMap = new JobDataMap();
            dataMap.put("job", job);
            jobDetail.setJobDataMap(dataMap);
            jobDetail.setName(name);
            jobDetail.setGroup(type.toString());

            CronTriggerImpl trigger = new CronTriggerImpl();
            trigger.setName(name);
            trigger.setGroup(type.toString());
            String exception = null;
            if(type == JobTypeEnum.DAY) {
                String[] hm = time.split(":");
                //cron表达式
//                exception = "0 " + hm[1] + " " + hm[0] + " * * ?";
                exception = "0 0/1 * * * ?";

            } else if (type == JobTypeEnum.WEEK){
                String[] dhm = time.split(",");
                String[] hm = dhm[1].split(":");
                exception = "0 " + hm[1] + " " + hm[0] + " ? * " + dhm[0];
            } else if (type == JobTypeEnum.MONTH) {
                String[] dhm = time.split(",");
                String[] hm = dhm[1].split(":");
                exception = "0 " + hm[1] + " " + hm[0] + " " + dhm[0] + " * ?";
            }
            trigger.setCronExpression(exception);

            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void removeJob(String name, JobTypeEnum type) {
        try {
            Scheduler scheduler = factory.getScheduler();
            TriggerKey triggerKey = new TriggerKey(name, type.toString());
            scheduler.pauseTrigger(triggerKey);
            scheduler.unscheduleJob(triggerKey);
            JobKey jobKey = new JobKey(name, type.toString());
            scheduler.deleteJob(jobKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
