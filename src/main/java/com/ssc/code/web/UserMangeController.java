/**
 * @Auther: KaiCh
 * @Date: 2018/12/17 11:04
 * @Description:
 */
package com.ssc.code.web;

import com.ssc.code.entity.ReturnResult;
import com.ssc.code.entity.User;
import com.ssc.code.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Controller
@RequestMapping("/user")
public class UserMangeController {

    private Logger logeer = LoggerFactory.getLogger(UserMangeController.class);

    @Autowired
    private IUserService iUserService;

    @PostMapping
    @ResponseBody
    public ReturnResult<User> add(@RequestBody User user){
        logeer.info("user ----- add");
        ReturnResult<User> returnResult = iUserService.add(user);
        return returnResult;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User getById(@PathVariable String id){
        logeer.info("get ------ user ---- id ");
        User user = iUserService.getById(id);
        logeer.info("user : {}");
        return user;
    }
}
