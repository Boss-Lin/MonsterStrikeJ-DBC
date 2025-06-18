package com.dao;

import com.dto.GameQueryParams;
import com.dto.GameRequest;
import com.model.Game;
import com.model.ViewGame;

import java.util.List;

public interface GameDao {

//    List<Game> getGames(GameQueryParams gameQueryParams);

    Integer countGames(GameQueryParams gameQueryParams);

    List<ViewGame> getViewGames(GameQueryParams gameQueryParams);

    ViewGame getViewGameById(Integer gameId);

    Game getGameById(Integer gameId);

    Integer createGame(GameRequest gameRequest);

    void updateGame(Integer gameId, GameRequest gameRequest);

    void deleteGameById(Integer gameId);
}