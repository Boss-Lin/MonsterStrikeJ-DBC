package com.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

import com.constant.GameCategory;

@Getter
@Setter
public class ViewGame {

    private Integer gameId;
    private String gameName;
    private GameCategory gameLavel;
    private String createName;
    private Timestamp createTime;
    private String updateName;
    private Timestamp updateTime;
}
