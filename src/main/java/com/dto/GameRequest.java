package com.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

import com.constant.GameCategory;

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

    private Integer createBY;

    @NotNull
    private Integer updateBY;

}
