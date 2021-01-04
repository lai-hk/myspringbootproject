package com.springboot.ci.myspringbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/helloworld")
    public  String helloworld(){
        System.out.println("helloworld");
        return  "helloworld11334445566";
    }


}

