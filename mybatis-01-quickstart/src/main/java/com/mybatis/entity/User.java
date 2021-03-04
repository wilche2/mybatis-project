package com.mybatis.entity;

import lombok.Data;

/**
 * @author caoweiquan
 * @date 2021/3/4
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
