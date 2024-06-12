package com.sample.mongo.service.impl;

import com.sample.mongo.document.User;
import com.sample.mongo.model.UserRequest;
import com.sample.mongo.model.UserResponse;
import com.sample.mongo.repository.UserRepository;
import com.sample.mongo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse retrieveFolio(UserRequest userRequest) {
        log.info("request: " + userRequest.getFolio());
        User user = userRepository.findNameByUser(userRequest.getFolio());
        log.info("user: " + user);
        UserResponse userResponse = new UserResponse(user.getFolio(),user.getUser());
        return userResponse;
    }
}
