package com.controller.users;

import com.dto.users.UserLoginRequest;
import com.dto.users.UserRequest;
import com.model.users.User;
import com.service.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
public class UserController {
/**
 * @RequestBody 表示要去接住前端傳過來的json參數
 * @Valid 表示驗證 Post請求的request body參數
 */
    @Autowired
    private UserService userService;

//    新建帳號
    @PostMapping("/users/createUser")
    public ResponseEntity<User> createUser(@RequestBody @Valid UserRequest userRequest) {
        Integer userId = userService.createUser(userRequest);

        //查看"新增帳號"的資訊
        User user = userService.getUserById(userId);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

//    登入
    @PostMapping("/users/login")
    public ResponseEntity<User> login(@RequestBody @Valid UserLoginRequest userLoginRequest) {
        User user = userService.login(userLoginRequest);

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
