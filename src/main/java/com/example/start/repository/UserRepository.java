package com.example.start.repository;

import com.example.start.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRepository,Long> {
}
