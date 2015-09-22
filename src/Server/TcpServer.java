/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author mfrye
 */
import java.io.*; 
import java.net.*; 
public class TcpServer 
{    
    /**
     *
     * @param argv
     * @throws Exception
     */
    public static void main(String argv[]) throws Exception       
    {          
        String clientSentence;          
        String capitalizedSentence;          
        ServerSocket welcomeSocket = new ServerSocket(80); 
        System.out.println("Starte Listener");  
        while(true)          
        {             
            System.out.println("Warten auf Client");  
            Socket connectionSocket = welcomeSocket.accept();   
            System.out.println("Client Connected");  
            BufferedReader inFromClient =                
                    new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));             
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());  
            System.out.println("Sending to Client");  
            outToClient.writeChars("Fu Fu Fa Fo" + '\n');  
            System.out.println("Waiting for Response");  
            clientSentence = inFromClient.readLine();             
            System.out.println("Received: " + clientSentence);             
            capitalizedSentence = clientSentence.toUpperCase() + '\n';             
            outToClient.writeBytes(capitalizedSentence);          
        }       
    } 
}
