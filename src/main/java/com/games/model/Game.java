package com.games.model;

import com.games.constant.GameCategory;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Game {
    private Integer gameId;
    private String gameName;
    private GameCategory gameLavel;
    private String createBY;
    private Timestamp createTime;
    private String updateBY;
    private Timestamp updateTime;
}
