package com.users.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserQueryParams {

    private String search;
    private String orderBy;
    private String sort;
    private Integer limit;
    private Integer offset;
}
