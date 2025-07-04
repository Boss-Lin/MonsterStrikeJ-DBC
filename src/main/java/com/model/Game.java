package com.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

import com.constant.GameCategory;

@Getter
@Setter
public class Game {
    private Integer gameId;
    private String gameName;
    private GameCategory gameLavel;
    private Integer createBY;
    private Timestamp createTime;
    private Integer updateBY;
    private Timestamp updateTime;

//    private String createName;
//    private String updateName;
}
