package com.manager.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class ManagerVO implements java.io.Serializable {
    private String MG_no;
    private String MG_email;
    private String MG_password;
    private String MG_name;
    private String MG_title;
    private String PM_name;
    private String Line_id;
    private String Line_url;
    private Timestamp MG_createtime;
    private Timestamp MG_updatetime;
    
}