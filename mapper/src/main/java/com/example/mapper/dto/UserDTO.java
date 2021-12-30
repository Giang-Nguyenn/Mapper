package com.example.mapper.dto;

import com.example.mapper.model.Post;
import lombok.Data;

import java.util.List;
@Data
public class UserDTO {
    private String userName;
    private String passWord;
    private String emailNew;
    private Integer age;
    private List<PostDTO> post;
}
