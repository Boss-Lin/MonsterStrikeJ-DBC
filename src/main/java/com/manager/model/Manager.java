package com.manager.model;

import com.manager.constant.ManagerCategory;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Manager {
    private Integer managerId;
    private String managerEmail;
    private String managerPassword;
    private String managerName;
    private ManagerCategory managerTitle;
    private String lineId;
    private String lineUrl;
    private String createBY;
    private Timestamp createTime;
    private Timestamp updateTime;
}
