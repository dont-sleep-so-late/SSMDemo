package com.springmvc.demo.service.impl;

import com.springmvc.demo.entity.User;
import com.springmvc.demo.mapper.UserMapper;
import com.springmvc.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author owc
 * @since 2023-11-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    UserMapper userMapper;

    @Override
    public Integer addUser(User user){
        return userMapper.insert(user);
    }
    @Override
    public Integer updateUser(User user){
        return userMapper.updateById(user);
    }
    @Override
    public Integer deleteUserByName(User user){
        return userMapper.deleteByUsername(user);
    }

    @Override
    public Integer deleteUserById(User user) {
        return userMapper.deleteById(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectList(null);
    }
}
