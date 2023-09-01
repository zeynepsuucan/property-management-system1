package com.example.start.converter;

import com.example.start.entity.PropertyEntity;
import com.example.start.model.PropertyDTO;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {

    public PropertyEntity convertDTOtoEntity(PropertyDTO propertyDTO){

        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setAddress(propertyDTO.getAddress());
        pe.setDescription(propertyDTO.getDescription());
        pe.setOwnerEmail(propertyDTO.getOwnerEmail());
        pe.setPrice(propertyDTO.getPrice());
        pe.setOwnerName(propertyDTO.getOwnerName());
        return pe;

    }

    public PropertyDTO convertEntitytoDTO(PropertyEntity propertyEntity){

        PropertyDTO pd = new PropertyDTO();
        pd.setTitle(propertyEntity.getTitle());
        pd.setAddress(propertyEntity.getAddress());
        pd.setDescription(propertyEntity.getDescription());
        pd.setOwnerEmail(propertyEntity.getOwnerEmail());
        pd.setPrice(propertyEntity.getPrice());
        pd.setOwnerName(propertyEntity.getOwnerName());
        return pd;

    }
}
