/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.login.controller;

import Client.views.LobbyGUI;

/**
 *
 * @author Lokaler Benutzer
 */
public class loginController {
    //neuen Player erstellen, player zur Lobby weiterleiten
    public void createNewPlayer(String name) {
        LobbyGUI MLobbyApp= new LobbyGUI();
        MLobbyApp.frmLobby.setVisible(true);
    }
}
