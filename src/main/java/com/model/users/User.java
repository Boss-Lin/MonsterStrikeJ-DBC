package com.model.users;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class User {
    /**
     * @JsonIgnore 當sprin boot 在轉換User object為json格式時，會忽略userPwd，不會回傳前端，達到隱藏密碼的效果
     */
    private Integer userId;
    private String userEmail;

    @JsonIgnore
    private String userPwd;

    private String userName;
    private String lineId;
    private String lineUrl;
    private Timestamp createTime;
    private Timestamp updateTime;
}
