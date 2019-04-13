package com.funtl.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name: TestController
 * @Author: wangshimin
 * @Date: 2019-04-13  21:14
 * @Description:
 */
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("hi")
    public String hi(String message){
        return "hello "+message+"my is admin ! i am from "+port;
    }
}
