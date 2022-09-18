package com.users.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class ViewUser {

    private Integer userId;
    private String userEmail;
    private String userPwd;
    private String userName;
    private String lineId;
    private String lineUrl;
    private Timestamp createTime;
    private Timestamp updateTime;
}
