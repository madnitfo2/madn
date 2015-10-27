/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.player.controller;
import Server.player.model.player;
import Server.main.model.game;
import madn.model.Figur;

/**
 *
 * @author Lokaler Benutzer
 */
public class playerController {
    //Spieler dem Spiel hinzufügen, Figuren bewegen
    game aktGame;
    player Players[] = new player[4];
    int currPlayer;
    //Spieler dem Spiel hinzufügen
    public void setPlayerToGame(player player) {
       if(currPlayer == 3) {
           currPlayer = 0;
           aktGame.initGame(Players);
       }
       Players[currPlayer].setGameID(player.getGameID());
       Players[currPlayer].setPlayerID(player.getPlayerID());
       Players[currPlayer].setName(player.getName());
       currPlayer += 1;
    }
      
    //Figur des Spielers anhand der Spieler- und dessen FigurenID bewegen
    public void setFigureOfPlayer(player name, Figur figureID) {
        
    }
}
