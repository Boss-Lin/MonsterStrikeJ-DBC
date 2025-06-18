package com.rowmapper;

import org.springframework.jdbc.core.RowMapper;

import com.model.ViewUser;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewUserRowmapper implements RowMapper<ViewUser> {

    @Override
    public ViewUser mapRow(ResultSet resultSet, int i) throws SQLException {
        ViewUser viewUser = new ViewUser();

        viewUser.setUserId(resultSet.getInt("U_id"));
        viewUser.setUserEmail(resultSet.getString("U_email"));
        viewUser.setUserPwd(resultSet.getString("U_password"));
        viewUser.setUserName(resultSet.getString("U_name"));
        viewUser.setLineId(resultSet.getString("Line_id"));
        viewUser.setLineUrl(resultSet.getString("Line_url"));

        return viewUser;
    }
}
