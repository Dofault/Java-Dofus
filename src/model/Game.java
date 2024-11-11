package src.model;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
    
    public int indexRound;

    private ArrayList<Player> players;
    
    public Game() {
        players = new ArrayList<Player>();
    }

    public boolean addPlayer(Player p) {
        if(players.size() < 4 && players.add(p)) {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean start() {
        if(players.size() >= 2) {
            indexRound = 0;

            return true;
        }
        return false;
    }

    public boolean attackPlayer(Player p1, Case targetCase) {
        for (Player p2 : players) {
            
            if(p1.getPosition().equals(p2.getPosition())) {
                p1.attackPlayer(p2);
                return true;
            };
        }
        return false; 
    }



    public Player getNextPlayer() {
        if(indexRound > players.size() ) {
            indexRound = 0;
        }
        return players.get(indexRound++);
    }
}
