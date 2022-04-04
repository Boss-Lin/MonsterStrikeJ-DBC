package com.manager.controller;

import com.manager.model.Manager;
import com.manager.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping("/managers/{managerId}")
    public ResponseEntity<Manager> getGameById(@PathVariable Integer managerId) {
        Manager manager = managerService.getManagerById(managerId);

        if (manager != null) {
            return ResponseEntity.status(HttpStatus.OK).body(manager);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
