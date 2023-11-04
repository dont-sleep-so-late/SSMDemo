package com.springmvc.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("o_person")
public class Person implements Serializable {
    @TableId(value="Id", type = IdType.AUTO)
    private Integer Id;
    private String name;
    private String nickname;
    private Integer age;
    @TableField(fill = FieldFill.INSERT ,value = "create_time")
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE ,value = "update_time")
    private LocalDateTime updateTime;
}

