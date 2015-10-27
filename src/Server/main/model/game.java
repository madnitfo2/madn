/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.main.model;
import Server.player.model.player;
import madn.model.Figur;
//https://github.com/sdoerner/MenschAergerDichNicht
/**
 *
 * @author Lokaler Benutzer
 */
public class game {
    
    int gameID;

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }  
    
    public void loginPlayer(String name){
    //init player with name, go to lobby    
        player newPlayer = new player(name);
        newPlayer.setGameID(this.gameID);
        
    }
    
    public void getLoginScreen(){
    //zeige login-bildschirm, soblad verbindung aufgebaut wurde.
    }
    
    public void calcNextPositions(player name){
    //berechnung der nächsten möhglichen Positionen für alle Figuren des Spielers
    }
    
    public int dice(){
        //würfeln ausführen
        int dice = (int)Math.random()*6;    
        return dice;
    }
    
    public void nextPlayer(player aktuellerSpieler){
        // nächste Spieler der Reihe ermitteln.
    }
    
    public void getTimer(){
        
    }
    
    public void alertTimesUp(){
        player aktPlayer = new player(); 
        this.nextPlayer(aktPlayer);
    }
    
    public void resetTimer(){
        
    }
    
    public void setFinalPositionforFigure(player name, Figur number){
        
    }
    
    public void setFinalPosForPlayer(player name){
        
    }
    
    public void initGame(player[] playerArray){
        
    }
}
