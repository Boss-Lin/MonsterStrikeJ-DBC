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
	void testGameJpa() {
		List<Game> gameTest = gameJpaDao.findByGameId(1);
		System.out.println("gameTest成功" + gameTest);
	}
	
	@Test
	void testGameJpa2() {
		List<Game> gameTest = gameJpaDao.findByGameId2(1);
		System.out.println("testGameJpa2成功" + gameTest);
	}

}
