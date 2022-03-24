package com.games.rowmapper;

import com.games.model.Game;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GameRowmapper implements RowMapper<Game> {
    
    @Override
    public Game mapRow(ResultSet resultSet, int i) throws SQLException {
        Game game = new Game();

        game.setGameId(resultSet.getInt("game_id"));
        game.setGameName(resultSet.getString("game_name"));
        game.setGameLavel(resultSet.getString("game_lavel"));
        game.setCreateBY(resultSet.getString("create_by"));
        game.setCreateTime(resultSet.getTimestamp("create_time"));
        game.setUpdateBY(resultSet.getString("update_by"));
        game.setUpdateTime(resultSet.getTimestamp("update_time"));

        return game;
    }
}