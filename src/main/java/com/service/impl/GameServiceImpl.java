package com.service.impl;

import com.dao.GameJdbcDao;
import com.dto.GameQueryParams;
import com.dto.GameRequest;
import com.model.Game;
import com.model.ViewGame;
import com.service.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameServiceImpl implements GameService {

    @Autowired
    private GameJdbcDao gameDao;

//    @Override
//    public List<Game> getGames(GameQueryParams gameQueryParams) {
//        return gameDao.getGames(gameQueryParams);
//    }


    @Override
    public Integer countGames(GameQueryParams gameQueryParams) {
        return gameDao.countGames(gameQueryParams);
    }

    @Override
    public List<ViewGame> getViewGames(GameQueryParams gameQueryParams) {
        return gameDao.getViewGames(gameQueryParams);
    }

    @Override
    public ViewGame getViewGameById(Integer gameId) {
        return gameDao.getViewGameById(gameId);
    }

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

    @Override
    public void deleteGameById(Integer gameId) {
        gameDao.deleteGameById(gameId);
    }
}