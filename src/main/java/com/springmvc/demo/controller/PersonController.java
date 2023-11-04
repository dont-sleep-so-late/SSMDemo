package com.springmvc.demo.controller;

import com.springmvc.demo.commen.vo.Result;
import com.springmvc.demo.entity.Person;
import com.springmvc.demo.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author owc
 * @since 2023-11-03
 */
@RestController
@RequestMapping("/demo/person")
public class PersonController {
    @Autowired
    IPersonService personService;

    @RequestMapping("/findAll")
    public Result<List<Person>> findAll(){
        //调用service的方法
        List<Person> list = personService.findAll();
        return Result.success(list,"查询成功");

    }

    @PostMapping("/addPerson")
    public Result<Object> addPerson(@RequestBody Person person){
        try {
            personService.addPerson(person);
            return Result.success("添加成功");
        }catch (Exception exception){
            return Result.fail(201,"添加人异常");
        }
    }

    @PostMapping("/updatePerson")
    public Result<Object> updatePerson(@RequestBody Person person){
        try {
            personService.updatePerson(person);
            List<Person> list = personService.findAll();
            return Result.success(list,"修改成功");
        }catch (Exception exception){
            return Result.fail(201,"添加用户异常");
        }
    }

    @PostMapping("/deletePerson")
    public Result<Object> delelePerson(@RequestBody Person person){
        try {
            personService.deletePerson(person);
            List<Person> list = personService.findAll();
            return Result.success(list,"删除成功");
        }catch (Exception exception){
            return Result.fail(201,"添加用户异常");
        }
    }

}
