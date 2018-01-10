package com.example.multi.controller;

import com.example.multi.config.HzProcessEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by huzhen on 2017/12/28.
 */
@Controller
@RequestMapping(value = "/handler")
public class HandlerController {
    @Value("#{settings[rootAppPath]}")
    private String rootUrl;

    @Value("${jdbcurl}")
    private String utilProperty;

    /*@Autowired
    private HzProcessEngine processEngine;*/

    @RequestMapping(value = "/here")
    public String doHandler(Model model){
        System.out.println(rootUrl+";"+utilProperty);
        model.addAttribute("tag","helloworld");
        return "index";
    }

    /*@RequestMapping(value="/process")
    public String doProcess(){
        processEngine.getRuntimeService().startProcessInstanceByKey("ACTIVITI_DEMO_PROCESS");
        *//*if(1==1){
            while(true){

            }
        }*//*
        return "process";
    }*/
}
