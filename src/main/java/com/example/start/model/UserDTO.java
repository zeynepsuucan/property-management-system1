package com.example.start.model;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private String ownerName;
    private String ownerEmail;
    private String password;
    private String phone;
}
