package com.example.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserDTOm {
    private Long id;
    private String userName;
//    @JsonProperty("aaaa")
    private String fullNamee;
}
