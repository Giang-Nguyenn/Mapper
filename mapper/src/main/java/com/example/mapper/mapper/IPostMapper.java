package com.example.mapper.mapper;

import com.example.mapper.dto.PostDTO;
import com.example.mapper.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IPostMapper {
    IPostMapper INSTANCE =Mappers.getMapper(IPostMapper.class);
    PostDTO postToDTO(Post post);
}
