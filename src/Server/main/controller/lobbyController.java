/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.main.controller;
import Client.views.LobbyGUI;
/**
 *
 * @author Lokaler Benutzer
 */
public class lobbyController {
    String currName;
    LobbyGUI lobby = new LobbyGUI(false,currName);
    
    
    public void getPlayerName() {
        currName = lobby.currPlayerName;
    }
    
    
}
