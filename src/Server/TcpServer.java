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

import java.net.*; 

public class TcpServer implements Runnable {

    public  TcpServer()
    {
        Thread t;
        t = new Thread (this, "ServerThread");
        t.start ();
    }
    @Override
     public void run()
     {
            main();
     }
    public static void main()     
    {          
         try {
        ServerSocket welcomeSocket = new ServerSocket(80); 
        System.out.println("Starte Listener");  
        while(true)          
        {             
            System.out.println("Warten auf Client");  
           
            Socket connectionSocket = welcomeSocket.accept();   
            TcpClient client = new TcpClient(connectionSocket);
            System.out.println("Client Connected");  
           
        }     
         } catch (Exception ex) {
           
        }
    } 
}
