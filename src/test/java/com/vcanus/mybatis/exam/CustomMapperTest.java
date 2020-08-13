package com.vcanus.mybatis.exam;

import com.vcanus.mybatis.exam.mapper.CustomMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
public class CustomMapperTest {

    @Resource
    private CustomMapper mapper;

    @Test
    public void select1() {
        System.out.println(mapper.select1());
        Assert.assertTrue(mapper.select1() == 1);
    }

}
