package com.sample.mongo.service;

import com.sample.mongo.model.UserRequest;
import com.sample.mongo.model.UserResponse;

public interface UserService {
    UserResponse retrieveFolio(UserRequest userRequest);
}
