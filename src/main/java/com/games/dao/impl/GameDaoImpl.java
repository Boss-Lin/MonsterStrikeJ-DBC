package com.games.dao.impl;

import com.games.dao.GameDao;
import com.games.model.Game;
import com.games.rowmapper.GameRowmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class GameDaoImpl implements GameDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Game getGameById(Integer gameId) {
        String sql = "select game_id, game_name, game_lavel, create_by, create_time, update_by, update_time from game where game_id = :gameId";

        Map<String, Object> map = new HashMap<>();
        map.put("gameId", gameId);

        List<Game> gameList = namedParameterJdbcTemplate.query(sql, map, new GameRowmapper());

        if (gameList.size() > 0) {
            return gameList.get(0);
        } else {
            return null;
        }
    }
}
