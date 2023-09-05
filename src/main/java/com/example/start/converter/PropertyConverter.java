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

    public PropertyDTO convertEntityToDTO(PropertyEntity pe) {
        PropertyDTO pd = new PropertyDTO();
        pd.setTitle(pe.getTitle());
        pd.setAddress(pe.getAddress());
        pd.setDescription(pe.getDescription());
        pd.setOwnerEmail(pe.getOwnerEmail());
        pd.setPrice(pe.getPrice());
        pd.setOwnerName(pe.getOwnerName());
        return pd;
    }
}
