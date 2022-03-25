package com.games.dao;

import com.games.dto.GameRequest;
import com.games.model.Game;

public interface GameDao {

    Game getGameById(Integer gameId);

    Integer createGame(GameRequest gameRequest);

    void updateGame(Integer gameId, GameRequest gameRequest);

    void deleteGameById(Integer gameId);
}