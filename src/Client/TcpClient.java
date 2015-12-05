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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TcpClient  implements Runnable
{  
    private     Thread t;
    public TcpClient()  throws Exception {

        
        t = new Thread (this, "clientThread");
        t.start ();
    while(outToServer == null)
        {
        Thread.sleep(10);
        }
    }
    

    @Override
     public void run() 
     {
            main();
     }
   
    public static void main()
    {   
        String sentence;   
        String modifiedSentence;    
        TcpClient client = null;
        System.out.println("Connetcting");
        try
        {
        Socket clientSocket = new Socket("LOCALHOST", 80);  
        
        
        System.out.println("Connected");  
       
        client = new TcpClient(clientSocket);
        clientSocket.close();  
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString()); 
           
            try
            {
            client.close();
            }
            catch(Exception ex2)
            {}
            System.exit(0);
        }
    } 
    
    Socket socket;
    public BufferedReader inFromServer;
    public static DataOutputStream outToServer;
    
    public TcpClient(Socket socket)  throws Exception   
    {
        this.socket = socket;
        inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));             
        outToServer = new DataOutputStream(socket.getOutputStream());  
        outToServer.writeChars("1001|0.01b%%;");
        receiver();
        
            //System.out.println("Sending to Client");  
            //outToClient.writeChars("Fu Fu Fa Fo" + '\n');  
            //System.out.println("Waiting for Response");  
            //clientSentence = inFromClient.readLine();             
            //System.out.println("Received: " + clientSentence);             
            //capitalizedSentence = clientSentence.toUpperCase() + '\n';             
            //outToClient.writeBytes(capitalizedSentence);          
    }
    private boolean closeThread = false;
    public void close()
    {
        closeThread = true;
        
    }
     private void receiver()
     {

        try 
        {  
             while (!closeThread)
             {
                int zeichen;
                String command = "";
                String Opcode = "";
                boolean CommandFinished = false;
                while(!CommandFinished || closeThread)
                {
                      zeichen = inFromServer.read();
                      if(zeichen == 0) zeichen = inFromServer.read();
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
