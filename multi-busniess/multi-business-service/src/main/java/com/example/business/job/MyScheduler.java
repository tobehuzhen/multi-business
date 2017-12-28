package com.example.business.job;

import org.springframework.stereotype.Component;

/**
 * Created by huzhen on 2017/12/28.
 */
@Component("myScheduler")
public class MyScheduler {

    public void doJob(){
        System.out.println("task is running");
    }
}
