package com.springmvc.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author owc
 * @since 2023-11-03
 */
@Data
@TableName("o_user")
public class User implements Serializable {
    @TableId(value = "userId", type = IdType.AUTO)
    private Integer userId;
    private String username;
    private String password;
    @TableField(fill = FieldFill.INSERT ,value = "create_time")
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE ,value = "update_time")
    private LocalDateTime updateTime;
}
