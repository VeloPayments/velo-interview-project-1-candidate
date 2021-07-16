package com.velopayments.interview.integration;

import com.velopayments.interview.controller.GamesController;
import com.velopayments.interview.repository.GameRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
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

    @LocalServerPort
    private int port; // The random port that our backend is listening on

    // Note: Wiremock could be used if any external services were being communicated with - there are none for now

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void fullEndToEndTest_happyPath() throws Exception {

        // Check games list is initially empty

        // Create game

        // Check game is there - and maybe check game is setup correctly?

        // Make a move

        // Check game state after first move


    }
    
}
