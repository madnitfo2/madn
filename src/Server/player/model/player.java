/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.player.model;

/**
 *
 * @author Lokaler Benutzer
 */
public class player {
    //Name, SpieleID, SpielerID
    
    String name;
    int playerID;
    int gameID;
    int nextPlayerID;

    public player() {
        
    }
    
    public player(String name, int playerID) {
        this.name = name;
        this.playerID = playerID;
        nextPlayerID += 1;
    }
    
    public int getNextPlayerID() {
        return nextPlayerID;
    }

    public void setNextPlayerID(int nextPlayerID) {
        this.nextPlayerID = nextPlayerID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }     
}
