/**
 * @Auther: KaiCh
 * @Date: 2018/12/17 14:31
 * @Description:
 */
package com.ssc.code.mapper;

import com.ssc.code.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    int add(User user);

    User getById(String id);

    @Select("SELECT EXISTS (SELECT 1 FROM USER WHERE unm=#{userName} AND pwd = #{passWord})")
    boolean checkExist(User user);

    User selectUser(User user);
}
