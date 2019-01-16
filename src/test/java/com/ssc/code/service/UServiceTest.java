/**
 * @Auther: KaiCh
 * @Date: 2019/1/16 10:46
 * @Description:
 */
package com.ssc.code.service;


import com.ssc.code.entity.ReturnResult;
import com.ssc.code.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" , "classpath:spring/applicationContext.xml"})
public class UServiceTest {

    private Logger logger = LoggerFactory.getLogger(UServiceTest.class);

    @Autowired
    private IUserService iUserService;

    @Test
    public void test1(){
        logger.info("check test----");
        User user = new User("admin", "admin");
        iUserService.check(user, new ReturnResult<User>());
    }
}
