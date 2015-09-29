/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.main.model;

/**
 *
 * @author Lokaler Benutzer
 */
public class game {
    public void loginPlayer(String name){
    //init player with name, go to lobby
    }
    public void getLoginScreen(){
    //zeige login-bildschirm, soblad verbindung aufgebaut wurde.
    }
    public void calcNextPositions(Player name){
    //berechnung der nächsten möhglichen Positionen für alle Figuren des Spielers
    }
    public int dice(){
        //würfeln ausführen
        int dice = (int)Math.random()*6;    
        return dice;
    }
    public void nextPlayer(Player aktuellerSpieler){
        // nächste Spieler der Reihe ermitteln.
    }
    public void getTimer(){
    }
    public void alertTimesUp(){
        //this.nextPlayer();
    }
    public void resetTimer(){
    }
    public void setFinalPositionforFigure(Player name, Figure number){
    }
    public void setFinalPosForPlayer(Player name){
    }
    public void initGame(Player[] playerArray){
    }
}
