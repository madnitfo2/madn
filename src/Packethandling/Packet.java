package Packethandling;

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
    private String Opcode = null;
    private String Content = null;
    
    public Packet(String Opcode, String Content)
    {
        this.Opcode = Opcode;
        this.Content = Content;
    }
    public String getOpcode()
    {
        return Opcode;
    }
        public String getContent()
    {
        return Content;
    }
        
    public void handle()
    {
        System.out.println("Packet: " + Opcode + " ::: " + Content); 
    }
}
