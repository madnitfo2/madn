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
import java.io.*; 
import java.net.*; 
public class TcpClient
{  
    public static void main(String argv[]) throws Exception  
    {   
        String sentence;   
        String modifiedSentence;   
        BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));   
        System.out.println("Connetcting");  
        Socket clientSocket = new Socket("10.0.10.7", 80);  
                System.out.println("Connected");  
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());   
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));   
                System.out.println("Reading");  
        sentence = inFromServer.readLine();   
        System.out.println("Recieved: " + sentence); 
        System.out.println("Sending: " + sentence);  
        outToServer.writeBytes(sentence + '\n'); 
        System.out.println("Sended: " + sentence);  
        modifiedSentence = inFromServer.readLine();   
        
        System.out.println("FROM SERVER: " + modifiedSentence);   
        clientSocket.close();  
    } 
}
