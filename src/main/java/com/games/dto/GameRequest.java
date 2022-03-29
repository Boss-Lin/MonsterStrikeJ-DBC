package com.games.dto;

import com.games.constant.GameCategory;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * dto = Data Transfer Object
 * 專門負責接住前端所傳過來的jason參數
 **/

@Getter
@Setter
public class GameRequest {

    @NotNull
    private String gameName;

    @NotNull
    private GameCategory gameLavel;

    @NotNull
    private String createBY;

    @NotNull
    private String updateBY;

}
