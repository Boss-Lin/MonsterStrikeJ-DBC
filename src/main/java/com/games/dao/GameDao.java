package com.games.dao;

import com.games.constant.GameCategory;
import com.games.dto.GameRequest;
import com.games.model.Game;

import java.util.List;

public interface GameDao {

    List<Game> getGames(GameCategory gameLavel, String search);

    Game getGameById(Integer gameId);

    Integer createGame(GameRequest gameRequest);

    void updateGame(Integer gameId, GameRequest gameRequest);

    void deleteGameById(Integer gameId);
}