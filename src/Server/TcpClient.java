/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Packethandling.Packet;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mfrye
 */
public class TcpClient {
    Socket socket;
    BufferedReader inFromClient;
    DataOutputStream outToClient;
    
    public TcpClient(Socket socket)  throws Exception   
    {
        this.socket = socket;
        inFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));             
        outToClient = new DataOutputStream(socket.getOutputStream());  
        
            //System.out.println("Sending to Client");  
            //outToClient.writeChars("Fu Fu Fa Fo" + '\n');  
            //System.out.println("Waiting for Response");  
            //clientSentence = inFromClient.readLine();             
            //System.out.println("Received: " + clientSentence);             
            //capitalizedSentence = clientSentence.toUpperCase() + '\n';             
            //outToClient.writeBytes(capitalizedSentence);          
    }
    
     public void receiver()
     {

        try 
        {  
             while (true)
             {
                int zeichen;
                String command = "";
                String Opcode = null;
                boolean CommandFinished = false;
                while(!CommandFinished)
                {
                      zeichen = inFromClient.read();
                      if((char)zeichen == ';')
                      {
                          CommandFinished = true;
                          Packet packet = new Packet(Opcode, command);
                          packet.handle();
                          break;
                      }
                      if((char)zeichen == '|')
                      {
                          Opcode = command;
                          command = "";
                      }else command += (char)zeichen;
                      
                }
                System.out.println("Command: " + command); 
             }
        }
        catch (IOException ex)
        {

        }
     }
}
