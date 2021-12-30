package com.example.mapper.model;

import lombok.Data;

import java.util.List;
@Data
public class User {
    private String userName;
    private String passWord;
    private String email;
    private Integer age;
    private List<Post> post;
}
