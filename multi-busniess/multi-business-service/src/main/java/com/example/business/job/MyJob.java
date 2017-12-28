package com.example.business.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

/**
 * Created by huzhen on 2017/12/28.
 */
@Component("myJob")
public class MyJob {

    public void execute() throws JobExecutionException {
        System.out.println("job 执行中");
    }

}
