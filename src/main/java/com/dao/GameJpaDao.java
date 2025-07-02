package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.table.Game;

public interface GameJpaDao extends JpaRepository<Game, Long> {

	List<Game> findByGameId(Integer gameId);

	@Query(value = "SELECT * FROM monsterstrike.game WHERE game_id = :gameId", nativeQuery = true)
	List<Game> findByGameId2(Integer gameId);
}
