// Write your code here
package com.example.player;

import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player createPlayer(Player playerObj);

    Player getPlayerById(int id);

    Player updatePlayer(Player player, int id);

    void deletePlayer(int id);
}