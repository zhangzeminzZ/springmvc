package com.zhangzemin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制类
@Controller
public class HelloController {
    @RequestMapping(value = "/hello")
    public String sayHello(){
        System.out.println("HelloController 的 sayHello 方法执行了。。。。");
        return "success";
    }

    @RequestMapping(value = "/caoledou")
    public String caoledou(){
        System.out.println("HelloController 的 caoledou 方法执行了。。。。");
        return "success";
    }

}
