package com.velopayments.interview.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Game {

    /**
     * Primary key
     */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    
    // TODO: Add attributes to store a game state
    //   e.g.
    //    - whos turns is it
    //    - current board contents i.e. cells
    
}
