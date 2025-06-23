package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.table.Game;

public interface GameJpaDao extends JpaRepository<Game, Long> {

	List<Game> findByGameId(Integer gameId);
}
