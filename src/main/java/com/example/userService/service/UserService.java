package com.example.userService.service;

import com.example.userService.model.User;
import com.example.userService.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

     Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public void clearDb() {
//        userRepository.deleteAll();
    }

    public User addUser(final User user) {
        logger.info("adding user: " + user);
        return new User();
//        return userRepository.save(user);
    }

    public User getUserByName(final String name) {
        logger.info("getting user with name: " + name);
        User user = userRepository.findByName(name);
        logger.info("user successfully found: " + user);
        return user;
    }
}