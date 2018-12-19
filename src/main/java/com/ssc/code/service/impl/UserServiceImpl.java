/**
 * @Auther: KaiCh
 * @Date: 2018/12/17 14:29
 * @Description:
 */
package com.ssc.code.service.impl;

import com.ssc.code.common.Constant;
import com.ssc.code.entity.ReturnResult;
import com.ssc.code.entity.User;
import com.ssc.code.mapper.UserMapper;
import com.ssc.code.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public ReturnResult<User> add(User user) {
        ReturnResult<User> returnResult = new ReturnResult<User>();
        int num = userMapper.add(user);
        if(0 == num){
            returnResult.setTag(Constant.FAILURE);
        }else {
            returnResult.setTag(Constant.SUCCESS);
        }
        return returnResult;
    }

    @Override
    public User getById(String id) {
        return userMapper.getById(id);
    }
}
