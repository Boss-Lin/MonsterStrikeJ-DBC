package com.games.service;

import com.games.constant.GameCategory;
import com.games.dto.GameRequest;
import com.games.model.Game;

import java.util.List;

public interface GameService {

    List<Game> getGames(GameCategory gameLavel, String search);

    Game getGameById(Integer ID);

    Integer createGame(GameRequest gameRequest);

    void updateGame(Integer gameId, GameRequest gameRequest);

    void deleteGameById(Integer gameId);
}
