package com.service.users;

import com.dto.users.UserLoginRequest;
import com.dto.users.UserRequest;
import com.model.users.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer createUser(UserRequest userRequest);

    User login(UserLoginRequest userLoginRequest);
}
