package com.velopayments.interview.controller;

import com.velopayments.interview.api.GameDTO;
import com.velopayments.interview.api.MakeMoveRequestDTO;
import com.velopayments.interview.domain.Game;
import com.velopayments.interview.service.GameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/games")
public class GamesController {
	private static final Logger LOG = LoggerFactory.getLogger(GamesController.class);

	@Autowired
	GameService gameService;

	/**
	 * createGame
	 *
	 * A user can POST to this endpoint to create a new game, and we will return the unique id of that game.
	 * They can then make moves using that game id.
	 */
	@RequestMapping(method = POST)
	public ResponseEntity<?> createGame() {
		LOG.debug("createGame");

		Game game = gameService.createGame();
		UUID gameId = game.getId();

		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(gameId).toUri();
		GameDTO response = new GameDTO();
		response.setId(gameId);

		return ResponseEntity.created(location).body(response);
	}

	/**
	 * makeMove
	 *
	 * A user can make a move for a particular game.
	 * This should validate the move and change the current game state.
	 * It should return the new game state to the caller
	 */
	@RequestMapping(method = POST, path = "/{gameId}/moves")
	public ResponseEntity<?> makeMove(@PathVariable("gameId") UUID gameId, @RequestBody MakeMoveRequestDTO makeMoveRequestDTO) {

		// TODO: Validate move

		// TODO: Make move - call gameService

		// Create response
		GameDTO gameDTO = new GameDTO();

		// TODO: set properties of gameDTO

		return ResponseEntity.ok(gameDTO);
	}

}
