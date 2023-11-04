package com.springmvc.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springmvc.demo.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;
public interface IPersonService extends IService<Person> {
    List<Person> findAll();

    Integer addPerson(Person person);

    Integer updatePerson(Person person);

    Integer deletePerson(Person person);

}
