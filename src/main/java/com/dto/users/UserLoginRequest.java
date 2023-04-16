package com.dto.users;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UserLoginRequest {

    @NotBlank
    @Email
    private String userEmail;

    @NotBlank
    private String userPwd;
}
