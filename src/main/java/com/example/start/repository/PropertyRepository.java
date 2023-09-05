package com.example.start.repository;

import com.example.start.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;

public interface PropertyRepository extends CrudRepository<PropertyEntity,Long> {


    //Object findAllByUserEntityId(Long userId);x
}
