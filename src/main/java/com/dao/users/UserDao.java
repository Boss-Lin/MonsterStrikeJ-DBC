package com.dao.users;

import com.dto.users.UserRequest;
import com.model.users.User;


public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String userEmail);

    Integer createUser(UserRequest userRequest);

}
