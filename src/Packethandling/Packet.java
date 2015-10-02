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
        
    public void handle()
    {
        try {
            System.out.println("Packet: " + Opcode + " ::: " + Content);
            switch(Opcode){
                case 1:
                    System.out.println("Client mit der Version : '" + Content + "' Sagt hallo.");
                    sender.writeChars("2|0.01b;");
                    break;
                case 2:
                    System.out.println("Server mit der Version : '" + Content + "' Sagt hallo.");
                    break;
                default:
                    System.out.println("Feher " + Opcode);
            }
        } catch (IOException ex) {
            Logger.getLogger(Packet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
