package Packethandling;

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
        Packet p2 = new Packet(Opcode+"",Content,sender);
        try {
            System.out.println("Packet: " + Opcode + " ::: " + Content);
            switch(Opcode){
                case 1:
                    String ClientVersion = p2.readstring();
                    System.out.println("Client mit der Version : '" + ClientVersion + "' Sagt hallo.");
                    Packet p = new Packet("2","0.01b%%",sender);
                    p.sendPacket();
                    //sender.writeChars("2|0.01b;");
                    break;
                case 2:
                    String ServerVersion = p2.readstring();
                    System.out.println("Server mit der Version : '" + ServerVersion + "' Sagt hallo.");
                    break;
                default:
                    System.out.println("Feher " + Opcode);
            }
        } catch (Exception ex) {
            Logger.getLogger(Packet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
