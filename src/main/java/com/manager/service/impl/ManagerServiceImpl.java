package com.manager.service.impl;

import com.manager.dao.ManagerDao;
import com.manager.model.Manager;
import com.manager.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerDao managerDao;

    @Override
    public Manager getManagerById(Integer managerId) {
        return managerDao.getManagerById(managerId);
    }
}
