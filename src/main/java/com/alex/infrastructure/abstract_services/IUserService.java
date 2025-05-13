package com.alex.infrastructure.abstract_services;

import java.util.UUID;

import com.alex.api.reponse.UserResponse;
import com.alex.api.request.UserRequest;

public interface IUserService extends CrudServide<UserRequest, UserResponse, UUID> {
    // Additional user-specific methods can be defined here if needed
    
}
