package com.games.dao.impl;

import com.games.dao.GameDao;
import com.games.dto.GameRequest;
import com.games.model.Game;
import com.games.rowmapper.GameRowmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.Date;
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

    @Override
    public Integer createGame(GameRequest gameRequest) {
        String sql = "INSERT INTO monsterstrike.game (game_name, game_lavel, create_by, update_by) VALUES (:gameName, :gameLavel, :createBY, :updateBY)";

        Map<String, Object> map = new HashMap<>();
        map.put("gameName", gameRequest.getGameName());
        map.put("gameLavel", gameRequest.getGameLavel());
        map.put("createBY", gameRequest.getCreateBY());
        map.put("updateBY", gameRequest.getUpdateBY());

        //記錄當下時間
//        Date now = new Date();
//        map.put("createTime", now);
//        map.put("updateTime", now);

        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);

        int gameId = keyHolder.getKey().intValue();

        return gameId;
    }
}

