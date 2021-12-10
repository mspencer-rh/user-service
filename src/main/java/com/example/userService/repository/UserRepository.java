package com.example.userService.repository;

import com.example.userService.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends MongoRepository<User, String> {

    User findByName(String name);
}
