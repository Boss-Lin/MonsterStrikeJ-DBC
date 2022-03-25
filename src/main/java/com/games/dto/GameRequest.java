package com.games.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class GameRequest {

    @NotNull
    private String gameName;

    @NotNull
    private String gameLavel;

    @NotNull
    private String createBY;

    @NotNull
    private String updateBY;

}
