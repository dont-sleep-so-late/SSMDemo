package com.springmvc.demo;

import com.springmvc.demo.entity.Person;
import com.springmvc.demo.mapper.PersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class testInsert {
    @Autowired
    private PersonMapper personMapper;

    @Test
    public void contextLoads() {
        System.out.println(("----- selectAll method test 测试查询所有用户方法 ------"));
        //selectList 的参数wrapper 是条件构造器，可以先写null
        List<Person> personList = personMapper.selectList(null);
        //forEach 的参数是 Consumer类型的 语法糖
        personList.forEach(System.out::println);
    }
}