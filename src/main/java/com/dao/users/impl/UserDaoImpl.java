package com.dao.users.impl;

import com.dao.users.UserDao;
import com.dto.users.UserRequest;
import com.model.users.User;
import com.rowmapper.users.UserRowmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public User getUserById(Integer userId) {
        String sql = "SELECT U_id, U_email, U_password, U_name, P_name, State, Line_id, Line_url, create_time, update_time " +
                "FROM monsterstrike.view_user WHERE U_id = :userId";
        
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);

        List<User> userList = namedParameterJdbcTemplate.query(sql, map, new UserRowmapper());
        
        if (userList.size() > 0) {
            return userList.get(0);
        } else{
            return null;
        }
    }

    @Override
    public User getUserByEmail(String userEmail) {
        String sql = "SELECT U_id, U_email, U_password, U_name, State, Line_id, Line_url, create_time, update_time " +
                "FROM monsterstrike.user WHERE U_email = :userEmail";

        Map<String, Object> map = new HashMap<>();
        map.put("userEmail", userEmail);

        List<User> userList = namedParameterJdbcTemplate.query(sql, map, new UserRowmapper());

        if (userList.size() > 0) {
            return userList.get(0);
        } else{
            return null;
        }
    }

    @Override
    public Integer createUser(UserRequest userRequest) {
        String sql = "INSERT INTO monsterstrike.user (U_email, U_password, U_name, Line_id, Line_url) VALUES (:userEmail, :userPwd, :userName, :lineId, :lineUrl)";

        Map<String, Object> map = new HashMap<>();
        map.put("userEmail", userRequest.getUserEmail());
        map.put("userPwd", userRequest.getUserPwd());
        map.put("userName", userRequest.getUserName());
        map.put("lineId",userRequest.getLineId());
        map.put("lineUrl",userRequest.getLineUrl());

        System.out.println(userRequest.getUserEmail());

//        Date now = new Date();
//        map.put("createTime",userRequest.getLineUrl());
//        map.put("updateTime",userRequest.getLineUrl());

        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);

        int userId = keyHolder.getKey().intValue();

        return userId;
    }
}
