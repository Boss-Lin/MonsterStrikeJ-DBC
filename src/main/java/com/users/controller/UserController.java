package com.users.controller;

import com.games.util.Page;
import com.users.constant.UserCategory;
import com.users.dto.UserQueryParams;
import com.users.dto.UserRequest;
import com.users.model.User;
import com.users.model.ViewUser;
import com.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
@RestController
public class UserController {

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

}
