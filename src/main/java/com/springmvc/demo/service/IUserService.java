package com.springmvc.demo.service;

import com.springmvc.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author owc
 * @since 2023-11-03
 */

public interface IUserService extends IService<User> {

    List<User> findAll();

    Integer addUser(User user);

    Integer updateUser(User user);

    Integer deleteUserByName(User user);

    Integer deleteUserById(User user);


}
