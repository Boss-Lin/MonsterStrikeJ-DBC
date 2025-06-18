package com.rowmapper;

import com.constant.GameCategory;
import com.model.ViewGame;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewGameRowmapper implements RowMapper<ViewGame> {

    @Override
    public ViewGame mapRow(ResultSet resultSet, int i) throws SQLException {
        ViewGame viewGame = new ViewGame();

        viewGame.setGameId(resultSet.getInt("game_id"));
        viewGame.setGameName(resultSet.getString("game_name"));

        String categoryStr = resultSet.getString("game_lavel");
        GameCategory category = GameCategory.valueOf(categoryStr);
        viewGame.setGameLavel(category);

//        viewGame.setGameLavel(GameCategory.valueOf(resultSet.getString("game_lavel")));

        viewGame.setCreateName(resultSet.getString("create_name"));
        viewGame.setCreateTime(resultSet.getTimestamp("create_time"));
        viewGame.setUpdateName(resultSet.getString("update_name"));
        viewGame.setUpdateTime(resultSet.getTimestamp("update_time"));

        return viewGame;
    }
}
