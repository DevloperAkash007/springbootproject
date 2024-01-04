/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import java.util.*;
import com.example.player.PlayerService;

import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {
    PlayerService playService = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playService.getPlayers();
    }

    @PostMapping("/players")
    public Player createPost(@RequestBody Player playerobj) {
        return playService.createPlayer(playerobj);

    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int id) {
        return playService.getPlayerById(id);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int id, @RequestBody Player player) {
        return playService.updatePlayer(player, id);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int id) {
        playService.deletePlayer(id);
    }
}