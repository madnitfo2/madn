package Packethandling;

import Client.views.LobbyGUI;
import Server.login.controller.loginController;
import Server.main.controller.lobbyController;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mfrye
 */
public class Packet {
    private int Opcode = 0;
    private String Content = null;
    private DataOutputStream sender = null;
    private int pointer = -1;
    
    public Packet(String Opcode, String Content, DataOutputStream sender)
    {
        
        int op = Integer.parseInt(Opcode.trim().toString());
        this.Opcode = op;
        this.Content = Content;
        this.sender = sender;
    }
    public int getOpcode()
    {
        return Opcode;
    }
        public String getContent()
    {
        return Content;
    }
    public String readstring()
    {
        pointer += 1;
        try
        {
            String[] split = Content.split("%%");
            if(split.length <1)
            {
                return Content;
            }
            String Para = split[pointer].replace("%%", "");
            return Para;
        }
        catch(Exception ex)
        {
            return null;
        }
    }
    public void writestring(String param)
    {
        Content = Content + param + "%%"; 
    }
    public void sendPacket()
    {
        try {
            sender.writeChars(Opcode + "|"+ Content + ";");
        } catch (IOException ex) {
            Logger.getLogger(Packet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void handle()
    {
        Packet Packet = new Packet(Opcode+"",Content,sender);
        try {
            System.out.println("Packet: " + Opcode + " ::: " + Content);
            switch(Opcode){
                case 1001: //Client sendet Version
                    String ClientVersion = Packet.readstring();
                    System.out.println("Client mit der Version : '" + ClientVersion + "' Sagt hallo.");
                    Packet p = new Packet("1101","True%%",sender);
                    p.sendPacket();
                    //sender.writeChars("2|0.01b;");
                    break;
                case 1101: //Server sendet Versionscheck
                    String ServerVersion = Packet.readstring();
                    System.out.println("Darf der Client sich einloggen? : '" + ServerVersion);
                   
                    break;
                case 1002: //Client sendet Playername
                    String PlayerName = Packet.readstring();
                    System.out.println("Spieler:"+PlayerName+" will sich einloggen.");
                    //Sende erlaubnis
                    Packet p1 = new Packet(1102+"","True%%"+PlayerName+"%%",Packet.sender);
                    p1.sendPacket();
                    lobbyController.AddPlayer(PlayerName);
                    break;
                case 1102: //Server sendet Okay
                    String allowedToJoin = Packet.readstring();
                    String name  = Packet.readstring();
                    if("True".equals(allowedToJoin))
                    {
                        //LobbyGUI MLobbyApp= new LobbyGUI(true,name);
                        //MLobbyApp.setCurrPlayerName(name);
                        //MLobbyApp.frmLobby.setVisible(true);
                        lobbyController.CreateLobby(name);
                    }
                break;
                default:
                    System.out.println("Feher " + Opcode);
            }
        } catch (Exception ex) {
            Logger.getLogger(Packet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
