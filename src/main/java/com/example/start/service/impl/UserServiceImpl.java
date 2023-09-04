package com.example.start.service.impl;

import com.example.start.converter.UserConverter;
import com.example.start.entity.UserEntity;
import com.example.start.exception.BusinessException;
import com.example.start.exception.ErrorModel;
import com.example.start.model.UserDTO;
import com.example.start.repository.UserRepository;
import com.example.start.service.UserService;
import org.hibernate.usertype.BaseUserTypeSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConverter userConverter;
    @Override
    public UserDTO register(UserDTO userDTO){
        Optional<UserEntity> opUserEntity = userRepository.findByOwnerEmail(userDTO.getOwnerEmail());
        if(opUserEntity.isPresent()) {
            List<ErrorModel> errorModelList = new ArrayList<>();
            ErrorModel errorModel = new ErrorModel();
            errorModel.setCode("EMAIL_ALREADY_EXISTS");
            errorModel.setMessage("The email with which you are trying to register already exists.");
            errorModelList.add(errorModel);
            throw new BusinessException(errorModelList);
        }

        UserEntity userEntity = userConverter.convertDTOtoEntity(userDTO);
        userEntity = userRepository.save(userEntity);
        userDTO = userConverter.convertEntitytoDTO(userEntity);
        return userDTO;
    }
    public UserDTO login(String email, String password) {
        UserDTO userDTO = null;
        Optional<UserEntity> optionalUserEntity = userRepository.findByOwnerEmailAndPassword(email, password);
        if (optionalUserEntity.isPresent()) {
            userDTO = userConverter.convertEntitytoDTO(optionalUserEntity.get());
        }
        else {
            List<ErrorModel> errorModelList = new ArrayList<>();
            ErrorModel errorModel = new ErrorModel();
            errorModel.setCode("INVALID LOGIN");
            errorModel.setMessage("Incorrect email or password");
            errorModelList.add(errorModel);
            throw new BusinessException(errorModelList);
        }
        return userDTO;
    }
}
