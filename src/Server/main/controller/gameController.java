/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.main.controller;
import Server.player.model.player;
import madn.model.Figur;
/**
 *
 * @author Lokaler Benutzer
 */
public class gameController {
    
    int dice;
    int[][] allPlayersPosition;
    
    public int[][] getAllPlayerPositions() {
        for(int i = 0; i <4; i++) {
            this.allPlayersPosition[i] = 
        }
    }
    
    public player getPlayerById(int playerID) {
        
    }
    
    public void checkAugenzahl (int augenzahl, player currPlayer) {
        if (augenzahl == 6){
            if (this.checkHome(currPlayer)) {
                activateFigurHome(currPlayer);
            }
            activateFigurField(currPlayer);
            
        }else {
            
        }
    }
    
    public boolean checkHome (player curPlayer) {
    //bei true sind noch figuren im Haus 
        //bei false ist das Haus leer
        return true;
    }
    
    public void activateFigurHome(player currPlayer){
        //
        for(int currFigur: currPlayer.getFigureArray(currPlayer.getPlayerID())){
            if (currFigur < 17){
                //suche startposition des Spielers und übergeben
            } 
        }
    }
    
    public void activateFigurField(player currPlayer){
        //
        for(int currFigur: currPlayer.getFigureArray(currPlayer.getPlayerID())){
            if (currFigur >= 17){
                //suche mögliche Positionen der Figuren
                int nextCalcPosition = currFigur + dice;
                if (this.isFieldEmpty(nextCalcPosition, currPlayer)) {
                    currPlayer.changeFigureArray(currFigur, nextCalcPosition);
                }
                
            }
        }
    }
    
    public boolean isFieldEmpty(int position, player currPlayer) {
        //Bei true ist das Feld leer bzw. von einer Figur des gegenspielers besetzt
        //Bei false ist es vom einer eignen Figur besetzt
        for(int currPosition: currPlayer.getFigureArray(currPlayer.getPlayerID())){
            if (currPosition == position) {
                return false;
            }
        }
        return true;
    }
}
