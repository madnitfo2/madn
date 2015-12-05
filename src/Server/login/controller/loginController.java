/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.login.controller;

import Client.TcpClient;
import Client.views.LobbyGUI;
import Packethandling.Packet;
import Server.TcpServer;
import Server.main.controller.lobbyController;

/**
 *
 * @author Lokaler Benutzer
 */
public class loginController {
    //neuen Player erstellen, player zur Lobby weiterleiten
    public static void ConnectToServer(String name)
    {
    createNewPlayer(name);
    }
    public static void createNewPlayer(String name) {
        
        try
        {
            if("server".equals(name))
            {
                TcpServer tcpserver = new TcpServer();
                lobbyController.CreateLobby(name);
            }
            else
            {
                TcpClient tcpclient = new TcpClient();
                Packet p1 = new Packet(1002+"",name+"%%",tcpclient.outToServer);
                p1.sendPacket();
                        
            }
        }
        catch (Exception ex)
        {
           int i = 1; 
        }

    }
}
