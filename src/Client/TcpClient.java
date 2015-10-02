/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author mfrye
 */
import Packethandling.Packet;
import java.io.*; 
import java.net.*; 
public class TcpClient
{  
    public static void main(String argv[]) throws Exception  
    {   
        String sentence;   
        String modifiedSentence;    
        System.out.println("Connetcting");  
        Socket clientSocket = new Socket("LOCALHOST", 80);  
        
        
        System.out.println("Connected");  
        new TcpClient(clientSocket);
        clientSocket.close();  
    } 
    
    Socket socket;
    BufferedReader inFromServer;
    DataOutputStream outToServer;
    
    public TcpClient(Socket socket)  throws Exception   
    {
        this.socket = socket;
        inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));             
        outToServer = new DataOutputStream(socket.getOutputStream());  
        outToServer.writeChars("1|0.01b;");
        receiver();
        
            //System.out.println("Sending to Client");  
            //outToClient.writeChars("Fu Fu Fa Fo" + '\n');  
            //System.out.println("Waiting for Response");  
            //clientSentence = inFromClient.readLine();             
            //System.out.println("Received: " + clientSentence);             
            //capitalizedSentence = clientSentence.toUpperCase() + '\n';             
            //outToClient.writeBytes(capitalizedSentence);          
    }
    
     private void receiver()
     {

        try 
        {  
             while (true)
             {
                int zeichen;
                String command = "";
                String Opcode = "";
                boolean CommandFinished = false;
                while(!CommandFinished)
                {
                      zeichen = inFromServer.read();
                      if((char)zeichen == ';')
                      {
                          CommandFinished = true;
                          Packet packet = new Packet(Opcode, command, outToServer);
                          packet.handle();
                          break;
                      }
                      if((char)zeichen == '|')
                      {
                          Opcode = command;
                          command = "";
                      }else command += (char)zeichen;
                      
                }
                //System.out.println("Command: " + command); 
             }
        }
        catch (IOException ex)
        {

        }
     }
}
