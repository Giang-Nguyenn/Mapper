package com.example.mapper.controller;

import com.example.mapper.UserMapper;
import com.example.mapper.dto.UserDTO;
import com.example.mapper.mapper.IUserMapper;
import com.example.mapper.model.Post;
import com.example.mapper.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mapper")
public class UserController1 {
    @GetMapping("/user/{id}")
    public UserDTO AllUser(){
        User user=new User();
        Post post1=new Post("content");
        Post post2=new Post("content");
        List<Post> posts=new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        user.setUserName("username");
        user.setPassWord("passworld");
        user.setEmail("email");
        user.setAge(1);
        user.setPost(posts);
        UserDTO userDTO= IUserMapper.INSTANCE.userToDTO(user);
        return userDTO;
    }

}
