package com.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.time.Instant;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);
    @Mapping(source = "fullName",target = "fullNamee",qualifiedByName = "cfullname")
    UserDTOm toDTOm(User user);

    @Named("cfullname")
    default String cfullname(String fullname) {
        return "fullname:"+fullname;
    }



}
