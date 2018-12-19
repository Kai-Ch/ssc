/**
 * @Auther: KaiCh
 * @Date: 2018/12/17 14:29
 * @Description:
 */
package com.ssc.code.service;

import com.ssc.code.entity.ReturnResult;
import com.ssc.code.entity.User;

public interface IUserService {

    public ReturnResult<User> add(User user);

    public User getById(String id);
}
