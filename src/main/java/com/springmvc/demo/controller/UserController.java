package com.springmvc.demo.controller;

import com.springmvc.demo.commen.vo.Result;
import com.springmvc.demo.entity.Person;
import com.springmvc.demo.entity.User;
import com.springmvc.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

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
@RequestMapping("/demo/user")
public class UserController {
    @Autowired
    IUserService userService;

    @ResponseBody
    @RequestMapping("/findAll")
    public Result<List<User>> findAll(){
        //调用service的方法
        try {
            List<User> list = userService.findAll();
            return Result.success(list,"查询成功");
        }catch (Exception exception){
            return Result.fail(201,"查询异常");
        }
    }

    @PostMapping("/addUser")
    public Result<Object> addUser(@RequestBody User user){
        try {
            userService.addUser(user);
            return Result.success("添加成功");
        }catch (Exception exception){
            return Result.fail(201,"添加用户异常");
        }
    }

    @PostMapping("/updateUser")
    public Result<Object> updateUser(@RequestBody User user){
        try {
            userService.updateUser(user);
            List<User> list = userService.findAll();
            return Result.success(list,"修改成功");
        }catch (Exception exception){
            return Result.fail(201,"修改用户异常");
        }
    }

    @PostMapping("/deleteUserById")
    public Result<Object> deleteUserById(@RequestBody User user){
        try {
            userService.deleteUserById(user);
            List<User> list = userService.findAll();
            return Result.success(list,"删除成功");
        }catch (Exception exception){
            return Result.fail(201,"删除用户异常");
        }
    }

    @PostMapping("/deleteUserByUsername")
    public Result<Object> deleteUserByUsername(@RequestBody User user){
        try {
            userService.deleteUserByName(user);
            List<User> list = userService.findAll();
            return Result.success(list,"删除成功");
        }catch (Exception exception){
            return Result.fail(201,"删除用户异常");
        }
    }

}
