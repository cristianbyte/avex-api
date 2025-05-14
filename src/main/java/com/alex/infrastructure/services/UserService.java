package com.alex.infrastructure.services;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alex.api.reponse.UserResponse;
import com.alex.api.request.UserRequest;
import com.alex.domain.repository.UserRepository;
import com.alex.infrastructure.abstract_services.IUserService;
import com.alex.infrastructure.mapper.UserMapper;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public UserResponse create(UserRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public UserResponse read(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public UserResponse update(UserRequest request, UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }


    
}
