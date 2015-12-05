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
public  class lobbyController {
    static String currName;
    static LobbyGUI lobby = null;
    
    static public void CreateLobby(String Playername)
    {
        lobby= new LobbyGUI(true,Playername);
        lobby.setCurrPlayerName(Playername);
        lobby.frmLobby.setVisible(true);
    }
    
    static public void AddPlayer(String Playername)
    {
        lobby.listPlayer.add(Playername);
    }
    static public void getPlayerName() {
        currName = lobby.currPlayerName;
    }
    
    
}
