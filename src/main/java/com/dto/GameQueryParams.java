package com.dto;

import com.constant.GameCategory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameQueryParams {

    private GameCategory gameLavel;
    private String search;
    private String orderBy;
    private String sort;
    private Integer limit;
    private Integer offset;
}
