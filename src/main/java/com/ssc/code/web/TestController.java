package com.ssc.code.web;

import com.ssc.code.entity.ReturnResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/t")
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public ReturnResult test(){
        ReturnResult returnResult = new ReturnResult();
        returnResult.setMsg("33333");
        return returnResult;
    }

    @RequestMapping("/welcome")
    public String welcome(){
        System.out.println("2222");
        return "welcome";
    }
}
