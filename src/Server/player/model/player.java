/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.player.model;
import madn.model.Figur;
import Server.main.model.game;

/**
 *
 * @author Lokaler Benutzer
 */
public class player {
    //Name, SpieleID, SpielerID
    
    game currGame;
    String name;
    int playerID;
    int gameID;
    int nextPlayerID;
    int[] myFigures;
    int[] StartingPosition;
    String Color;

    public player() {
        
    }
    
    public player(String name) {
        this.name = name;
        this.playerID = playerID;
        if (nextPlayerID == 3) {
            nextPlayerID = 0;
            gameID += 1;
        } else {
            nextPlayerID += 1;
        }
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
    public int[] getPlayerColor(int playerID){
        switch (playerID) {
            case 0:  this.Color = "Rot";
                     this.StartingPosition = new int[]{1, 2, 3, 4};
                     break;
            case 1:  this.Color = "Grün";
                     this.StartingPosition = new int[]{5, 6, 7, 8};
                     break;
            case 2:  this.Color = "Blau";
                     this.StartingPosition = new int[]{9, 10, 11, 12};
                     break;
            case 3:  this.Color = "Gelb";
                     this.StartingPosition = new int[]{13, 14, 15, 16};
                     break;
        }
        return this.StartingPosition;
    }
    
    public void initFigures(int playerID){
        int[] positionArray = this.getPlayerColor(playerID);
        this.myFigures = positionArray;
    }
    
    public int[] getFigureArray(int playerID){
        return myFigures;
    }
    public void changeFigureArray(int figure, int newPosition){
        this.myFigures[figure] = newPosition;
    }
}
