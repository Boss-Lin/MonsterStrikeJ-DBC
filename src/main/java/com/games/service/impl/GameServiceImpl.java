package com.games.service.impl;

import com.games.dao.GameDao;
import com.games.dto.GameRequest;
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

    @Override
    public Integer createGame(GameRequest gameRequest) {
        return gameDao.createGame(gameRequest);
    }

    @Override
    public void updateGame(Integer gameId, GameRequest gameRequest) {
        gameDao.updateGame(gameId, gameRequest);
    }
}