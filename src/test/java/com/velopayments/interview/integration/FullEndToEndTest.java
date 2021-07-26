package com.velopayments.interview.integration;

import com.velopayments.interview.api.GameDTO;
import com.velopayments.interview.controller.GamesController;
import com.velopayments.interview.repository.GameRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

/**
 * Full end to end test
 *
 * Stands up the full backend
 *
 * Makes http calls to it, simulating a real person with curl or similar http tool
 * Checks the results are correct
 *
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class FullEndToEndTest {

    @Autowired
    private GamesController controller;
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private GameRepository gameRepository;

    // Note: Wiremock could be used if any external services were being communicated with - there are none for now


    @Test
    public void fullEndToEndTest_happyPath() throws Exception {

        // Create game
        ResponseEntity<GameDTO> createResponse = restTemplate.postForEntity("/games", null, GameDTO.class);


        // Check game is there - and maybe check game is setup correctly?
        assert createResponse.getStatusCode() == HttpStatus.CREATED;

        // Make a move

        // Check game state after first move


    }

}
