// Write your code here.
package com.example.player;

import java.util.*;

public class Player {
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int id, String name, int jerseyNum, String role) {
        this.playerId = id;
        this.playerName = name;
        this.jerseyNumber = jerseyNum;
        this.role = role;
    }

    public void setPlayerId(int id) {

        this.playerId = id;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public void setPlayerName(String name) {
        this.playerName = name;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setJerseyNumber(int jerseyNum) {
        this.jerseyNumber = jerseyNum;
    }

    public int getJerseyNumber() {
        return this.jerseyNumber;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}