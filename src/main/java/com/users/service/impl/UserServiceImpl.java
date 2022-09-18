package com.users.service.impl;

import com.users.dao.UserDao;
import com.users.dto.UserLoginRequest;
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

    @Override
    public User login(UserLoginRequest userLoginRequest) {
        //去資料庫查看有沒有輸入的email
        User user = userDao.getUserByEmail(userLoginRequest.getUserEmail());

        //如果輸入的email沒有在資料的話
        if(user == null) {
            log.warn("該 email {} 尚未註冊", userLoginRequest.getUserEmail());

            //強制停止前端的請求，並回傳400給前端，表示前端的請求參數是有問題的
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //如果輸入的密碼跟資料庫相同
        if(user.getUserPwd().equals(userLoginRequest.getUserPwd())) {
            return user;
        } else {
            log.warn("email {} 的密碼不正確", userLoginRequest.getUserEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}
