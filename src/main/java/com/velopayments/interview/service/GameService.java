package com.velopayments.interview.service;

import com.velopayments.interview.domain.Game;
import com.velopayments.interview.repository.GameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
public class GameService {
    private static final Logger LOG = LoggerFactory.getLogger(GameService.class);

    @Autowired
    GameRepository gameRepository;

    public Game createGame() {

        // TODO: Implement this
        //   This should use the gameRepository object for persistence

        return null;
    }

    public Game makeMove(UUID gameId) {

        // TODO: Implement this.
        //   Note: You will need to add one or more parameters to this method, with the details of the move
        //   This should use the gameRepository object for persistence
        //   It should return the new game state to the caller

        // TODO: Optional: Implement 'win' logic

        return null;
    }

}
