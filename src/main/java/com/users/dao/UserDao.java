package com.users.dao;

import com.users.dto.UserRequest;
import com.users.model.User;


public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String userEmail);

    Integer createUser(UserRequest userRequest);

}
