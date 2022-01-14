package com.monster.controller;

import com.monster.model.MonsterService;
import com.monster.model.MonsterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonsterController {
    @Autowired
    MonsterService monsterService;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/allMosters")
    public List<MonsterVO> getAllMonsters() {
        List<MonsterVO> list = MonsterService.findByAll();
        return list;
    }
}
