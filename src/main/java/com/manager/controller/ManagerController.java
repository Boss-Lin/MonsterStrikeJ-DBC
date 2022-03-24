package com.manager.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ManagerController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
