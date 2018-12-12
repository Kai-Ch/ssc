/**
 * @Auther: KaiCh
 * @Date: 2018/12/12 11:16
 * @Description:
 */
package com.ssc.code.service.impl;

import com.ssc.code.entity.Test;
import com.ssc.code.mapper.TestMapper;
import com.ssc.code.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public Test test() {
        return testMapper.test();
    }
}
