package com.users.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UserRequest {
/**
 * @NotBlank 除了不能是null，也不可以是空白字串
 * @Email 檢查前端傳過來的值是不是email格式
*/

    @NotBlank
    @Email
    private String userEmail;

    @NotBlank
    private String userPwd;

    private String userName;
    private String lineId;
    private String lineUrl;
}
