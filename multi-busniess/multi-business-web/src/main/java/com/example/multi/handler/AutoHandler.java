package com.example.multi.handler;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

/**
 * Created by huzhen on 2018/1/5.
 */
@Component(value="autoHandler")
public class AutoHandler implements JavaDelegate{

    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("自动处理");
    }
}
