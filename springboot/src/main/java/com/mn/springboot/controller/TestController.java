package com.mn.springboot.controller;

import com.mn.springboot.utils.es.ESUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private ESUtil esUtil;


    @RequestMapping("/test1")
    public Object test1() {
        return null;
    }
}
