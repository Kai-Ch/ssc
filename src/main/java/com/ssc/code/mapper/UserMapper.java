/**
 * @Auther: KaiCh
 * @Date: 2018/12/17 14:31
 * @Description:
 */
package com.ssc.code.mapper;

import com.ssc.code.entity.User;

public interface UserMapper {

    int add(User user);

    User getById(String id);
}
