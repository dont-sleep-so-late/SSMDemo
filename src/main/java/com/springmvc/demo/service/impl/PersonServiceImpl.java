package com.springmvc.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springmvc.demo.entity.Person;
import com.springmvc.demo.mapper.PersonMapper;
import com.springmvc.demo.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ouwen
 * @since 2023-11-03
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    @Resource
    PersonMapper personMapper;

    @Override
    public Integer addPerson(Person person){
        return personMapper.insert(person);
    }
    @Override
    public Integer updatePerson(Person person){
        return personMapper.updateById(person);
    }
    @Override
    public Integer deletePerson(Person person){
        return personMapper.deleteById(person);
    }

    @Override
    public List<Person> findAll() {
        return personMapper.selectList(null);
    }

}
