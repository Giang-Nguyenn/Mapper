package com.example.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/user")
    public List<UserDTO> getAll(){
        List<User> users=userService.findAll();
        List<UserDTO> l=new ArrayList<>();
        for(User user:users){
            l.add(new UserDTO(user));
        }
        return l;
    }
    @GetMapping("/user/{id}")
    public UserDTOm getUser(@PathVariable Long id){
        UserDTOm userDTO=UserMapper.INSTANCE.toDTOm(userService.getUserById(id));
        return userDTO;
    }
}
