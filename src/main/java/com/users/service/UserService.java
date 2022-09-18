package com.users.service;

import com.users.dto.UserQueryParams;
import com.users.dto.UserRequest;
import com.users.model.User;
import com.users.model.ViewUser;

import java.util.List;

public interface UserService {

    User getUserById(Integer userId);
    Integer createUser(UserRequest userRequest);
}
