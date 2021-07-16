package com.velopayments.interview.controller;

import com.velopayments.interview.service.GameService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Test for Controller
 * Only the web layer is tested, the dependent service layer is mocked
 */
@WebMvcTest(controllers = GamesController.class)
public class GamesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    GameService gamesService;

    @Test
    public void createGame_success() {
        
        // TODO: Implement
        
    }


    @Test
    public void makeMove_success() {

        // TODO: Implement
        
    }

    // TODO: Implement any other test cases you may need to cover, or add a comment for each one if you run out of time

}
