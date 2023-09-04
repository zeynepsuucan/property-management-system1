package com.example.start.service.impl;

import com.example.start.entity.UserEntity;
import com.example.start.model.UserDTO;
import com.example.start.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public UserDTO register(UserDTO userDTO){
        userRepository.save(null);

        return null;
    }
    public UserDTO login(String email, String password){
        return null;
    }
}
