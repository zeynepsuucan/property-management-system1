package com.example.start.repository;

import com.example.start.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity,Long> {
    Optional<UserEntity> findByOwnerEmailAndPassword(String email, String Password);
    Optional<UserEntity> findByOwnerEmail(String email);

}
