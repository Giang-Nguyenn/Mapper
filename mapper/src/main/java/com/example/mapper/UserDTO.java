package com.example.mapper;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDTO {
    private Long id;
    private String userName;
    private String fullName;

    public UserDTO(User user){
        this.id=user.getId();
        this.userName=user.getUserName();
        this.fullName=user.getFullName();

    }

}
