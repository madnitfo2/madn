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
        
        ServerSocket welcomeSocket = new ServerSocket(80); 
        System.out.println("Starte Listener");  
        while(true)          
        {             
            System.out.println("Warten auf Client");  
            Socket connectionSocket = welcomeSocket.accept();   
            TcpClient client = new TcpClient(connectionSocket);
            System.out.println("Client Connected");  
            
        }       
    } 
}
