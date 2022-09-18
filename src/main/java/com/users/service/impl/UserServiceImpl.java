package com.users.service.impl;

import com.users.dao.UserDao;
import com.users.dto.UserQueryParams;
import com.users.dto.UserRequest;
import com.users.model.User;
import com.users.model.ViewUser;
import com.users.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer createUser(UserRequest userRequest) {

        // 檢查有沒有相通資料
        User user  = userDao.getUserByEmail(userRequest.getUserEmail());
        // 註冊過email
        if(user != null) {
            log.warn("該email {} 已經被註冊", userRequest.getUserEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        // 創建帳號
        return userDao.createUser(userRequest);
    }

}
