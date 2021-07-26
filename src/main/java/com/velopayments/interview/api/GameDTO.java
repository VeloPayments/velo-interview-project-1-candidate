package com.velopayments.interview.api;

import java.util.UUID;

public class GameDTO {

    private UUID id;

    // TODO: Add a representation of the game "state" (board) to return to the caller

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}
