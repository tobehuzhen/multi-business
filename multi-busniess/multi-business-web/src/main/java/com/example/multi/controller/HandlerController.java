package com.example.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by huzhen on 2017/12/28.
 */
@Controller
@RequestMapping(value = "/handler")
public class HandlerController {

    @ResponseBody
    @RequestMapping(value = "/here")
    public String doHandler(){
        return "helloSmkhz";
    }
}
