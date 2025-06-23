package com.monster;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.GameJpaDao;
import com.model.table.Game;

@SpringBootTest
class MonsterstrikeApplicationTests {

	@Autowired
	private GameJpaDao gameJpaDao;

	@Test
	void contextLoads() {
		List<Game> gameTest = gameJpaDao.findByGameId(1);
		System.out.println("成功" + gameTest);
	}

}
