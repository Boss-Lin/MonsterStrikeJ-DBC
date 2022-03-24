package com.games.service.impl;

import com.games.dao.GameDao;
import com.games.model.Game;
import com.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameServiceImpl implements GameService {

    @Autowired
    private GameDao gameDao;

    @Override
    public Game getGameById(Integer gameId) {
        return gameDao.getGameById(gameId);
    }
}
