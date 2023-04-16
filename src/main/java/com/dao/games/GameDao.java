package com.dao.games;

import com.dto.games.GameQueryParams;
import com.dto.games.GameRequest;
import com.model.games.Game;
import com.model.games.ViewGame;

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