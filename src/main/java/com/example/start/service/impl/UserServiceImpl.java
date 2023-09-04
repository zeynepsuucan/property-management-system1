package com.example.start.service.impl;

import com.example.start.converter.UserConverter;
import com.example.start.entity.UserEntity;
import com.example.start.model.UserDTO;
import com.example.start.repository.UserRepository;
import com.example.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConverter userConverter;
    @Override
    public UserDTO register(UserDTO userDTO){
        UserEntity userEntity = userConverter.convertDTOtoEntity(userDTO);
        userEntity = userRepository.save(userEntity);
        userDTO = userConverter.convertEntitytoDTO(userEntity);


        return userDTO;
    }
    public UserDTO login(String email, String password){
        return null;
    }
}
