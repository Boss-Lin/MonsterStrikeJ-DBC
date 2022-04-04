package com.manager.dao.impl;

import com.manager.dao.ManagerDao;
import com.manager.model.Manager;
import com.manager.rowmapper.ManagerRowmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ManagerDaoImpl implements ManagerDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Manager getManagerById(Integer managerId) {
        String sql ="SELECT MG_id, MG_email, MG_password, MG_name, PM_name, Line_id, Line_url, create_by, create_time, update_time FROM view_manager WHERE MG_id = :managerId";

        Map<String, Object> map = new HashMap<>();
        map.put("managerId", managerId);

        List<Manager> managerList = namedParameterJdbcTemplate.query(sql, map, new ManagerRowmapper());

        if (managerList.size() > 0){
            return managerList.get(0);
        } else {
            return null;
        }
    }

}
