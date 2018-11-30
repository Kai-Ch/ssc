package com.ssc.code.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println(111);
        return "11111";
    }
}
