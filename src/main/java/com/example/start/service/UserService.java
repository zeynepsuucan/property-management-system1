package com.example.start.service;

import com.example.start.model.UserDTO;
import org.apache.catalina.User;

public interface UserService {

    public UserDTO register(UserDTO userDTO);
    public UserDTO login(String email, String password);
}
