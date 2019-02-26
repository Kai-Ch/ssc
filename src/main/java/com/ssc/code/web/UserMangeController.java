/**
 * @Auther: KaiCh
 * @Date: 2018/12/17 11:04
 * @Description:
 */
package com.ssc.code.web;

import com.alibaba.fastjson.JSON;
import com.ssc.code.entity.ReturnResult;
import com.ssc.code.entity.User;
import com.ssc.code.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserMangeController {

    private Logger logger = LoggerFactory.getLogger(UserMangeController.class);

    @Autowired
    private IUserService iUserService;

    @PostMapping
    @ResponseBody
    public ReturnResult<User> add(@RequestBody User user){
        logger.info("user ----- add");
        ReturnResult<User> returnResult = iUserService.add(user);
        return returnResult;
    }

    @RequestMapping("/register")
    public String toSing(){
        logger.info("register");
        return "register";
    }

    @PostMapping("/login")
    @ResponseBody
    public ReturnResult<User> login(@RequestBody User user){

        return null;
    }

    @PostMapping("/checkUser")
    @ResponseBody
    public ReturnResult<User> check(@RequestBody User user){
        logger.info("checkUser params :{}", JSON.toJSONString(user));
        ReturnResult<User> returnResult = new ReturnResult<User>();
        return iUserService.check(user, returnResult);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User getById(@PathVariable String id){
        logger.info("get ------ user ---- id ");
        User user = iUserService.getById(id);
        logger.info("user : {}");
        return user;
    }
}
