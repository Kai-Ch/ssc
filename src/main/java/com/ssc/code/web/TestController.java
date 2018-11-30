package com.ssc.code.web;

import com.ssc.code.entity.ReturnResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/t")
public class TestController {

    @RequestMapping("/test")
    public ReturnResult test(){
        ReturnResult returnResult = new ReturnResult();
        returnResult.setMsg("33333");
        return returnResult;
    }
}
