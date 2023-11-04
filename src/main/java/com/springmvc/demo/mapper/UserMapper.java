package com.springmvc.demo.mapper;

import com.springmvc.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author owc
 * @since 2023-11-03
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    List<User> findAll();

    Integer addUser(User user);

    Integer updateUser(User user);

    Integer deleteUser(User user);

    Integer deleteByUsername(User user);
}
