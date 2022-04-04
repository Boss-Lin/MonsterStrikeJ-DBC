package com.manager.rowmapper;

import com.manager.constant.ManagerCategory;
import com.manager.model.Manager;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerRowmapper implements RowMapper<Manager> {
    @Override
    public Manager mapRow(ResultSet resultSet, int i) throws SQLException {
        Manager manager = new Manager();

        manager.setManagerId(resultSet.getInt("MG_id"));
        manager.setManagerEmail(resultSet.getString("MG_email"));
        manager.setManagerPassword(resultSet.getString("MG_password"));
        manager.setManagerName(resultSet.getString("MG_name"));

        String categoryStr = resultSet.getString("PM_name");
        ManagerCategory category = ManagerCategory.valueOf(categoryStr);
        manager.setManagerTitle(category);

        manager.setLineId(resultSet.getString("Line_id"));
        manager.setLineUrl(resultSet.getString("Line_url"));
        manager.setCreateBY(resultSet.getString("create_by"));
        manager.setCreateTime(resultSet.getTimestamp("create_time"));
        manager.setUpdateTime(resultSet.getTimestamp("update_time"));

        return manager;
    }
}
