package com.games.controller;

import com.games.model.Game;
import com.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/games/{gameId}")
    public ResponseEntity<Game> getGame(@PathVariable Integer gameId) {
        Game game = gameService.getGameById(gameId);

        if (game != null) {
            return ResponseEntity.status(HttpStatus.OK).body(game);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
