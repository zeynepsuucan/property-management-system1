package com.example.start.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PropertyDTO {
    private Long id;
    private Long UserId;
    private String title;
    private String description;
    private String ownerName;
    private String ownerEmail;
    private Double price;
    private String address;

}
