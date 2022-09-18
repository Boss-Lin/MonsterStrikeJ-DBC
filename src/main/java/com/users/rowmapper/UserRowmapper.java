package com.users.rowmapper;

import com.users.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowmapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();

        user.setUserId(resultSet.getInt("U_id"));
        user.setUserEmail(resultSet.getString("U_email"));
        user.setUserPwd(resultSet.getString("U_password"));
        user.setUserName(resultSet.getString("U_name"));
        user.setLineId(resultSet.getString("Line_id"));
        user.setLineUrl(resultSet.getString("Line_url"));

        return user;
    }
}
