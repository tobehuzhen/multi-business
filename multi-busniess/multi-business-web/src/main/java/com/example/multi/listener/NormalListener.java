package com.example.multi.listener;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

/**
 * Created by huzhen on 2018/1/4.
 */
@Component(value="normalListener")
public class NormalListener implements ExecutionListener{
    public void notify(DelegateExecution execution) throws Exception {
        System.out.println("normalListener is running");
        execution.setVariable("normaler","hnormal");
    }
}
