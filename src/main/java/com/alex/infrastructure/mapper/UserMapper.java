package com.alex.infrastructure.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.alex.api.reponse.UserResponse;
import com.alex.api.request.UserRequest;
import com.alex.domain.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", ignore = true)
    @Mapping(target = "password_hash", ignore = true)
    @Mapping(target = "created_at", ignore = true)
    @Mapping(target = "accounts", ignore = true)
    @Mapping(target = "categories", ignore = true)
    User toEntity(UserRequest userRequest);

    UserResponse toResponse(User user);
    
    void updateEntity(UserRequest userRequest, @MappingTarget User user);
}
