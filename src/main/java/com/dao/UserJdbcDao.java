package com.dao;

import com.dto.UserRequest;
import com.model.User;


public interface UserJdbcDao {

    User getUserById(Integer userId);

    User getUserByEmail(String userEmail);

    Integer createUser(UserRequest userRequest);

}
