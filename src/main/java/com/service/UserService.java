package com.service;

import com.dto.UserLoginRequest;
import com.dto.UserRequest;
import com.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer createUser(UserRequest userRequest);

    User login(UserLoginRequest userLoginRequest);
}
