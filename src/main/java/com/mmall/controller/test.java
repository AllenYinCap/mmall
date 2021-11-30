package com.mmall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
public class test {
    @RequestMapping("/hello")
    public String test(){
        return "helloworld";
    }
}
