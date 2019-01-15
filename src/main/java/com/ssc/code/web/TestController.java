package com.ssc.code.web;

import com.ssc.code.entity.ReturnResult;
import com.ssc.code.entity.Test;
import com.ssc.code.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/t")
public class TestController {

    @Autowired
    private ITestService iTestService;

    private Logger log = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/test")
    @ResponseBody
    public ReturnResult test() {
        log.info("test------");
        Test test = iTestService.test();
        ReturnResult returnResult = new ReturnResult();
        returnResult.setMsg("33333");
        returnResult.setData(test);
        return returnResult;
    }

    @RequestMapping("/welcome")
    public String welcome() {
        System.out.println("2222");
        return "welcome";
    }

}
