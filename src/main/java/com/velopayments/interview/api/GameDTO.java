package com.velopayments.interview.api;

public class GameDTO {
    
    private String id;
    private String url;
    
    // TODO: Add a representation of the game "state" (board) to return to the caller

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
