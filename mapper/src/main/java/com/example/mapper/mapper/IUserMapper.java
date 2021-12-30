package com.example.mapper.mapper;

import com.example.mapper.UserDTOm;
import com.example.mapper.UserMapper;
import com.example.mapper.dto.UserDTO;
import com.example.mapper.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {IPostMapper.class})
public interface IUserMapper {
    IUserMapper INSTANCE= Mappers.getMapper(IUserMapper.class);
    @Mapping(source = "email",target = "emailNew",qualifiedByName = "customer_email")
    UserDTO userToDTO(User user);

    @Named("customer_email")
    default String custormerEmail(String email) {
        return email+"@gmail.com";
    }
}
