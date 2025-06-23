package com.model.table;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.constant.GameCategory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "game")
public class Game {

	@Id
	@Column(name = "game_id")
	private Integer gameId;

	@Column(name = "game_name")
	private String gameName;

	@Enumerated(EnumType.STRING)
	@Column(name = "game_level")
	private GameCategory gameLavel;

	@Column(name = "create_by")
	private Integer createBY;

	@Column(name = "create_time")
	private Timestamp createTime;

	@Column(name = "update_by")
	private Integer updateBY;

	@Column(name = "update_time")
	private Timestamp updateTime;

//    private String createName;
//    private String updateName;
}
