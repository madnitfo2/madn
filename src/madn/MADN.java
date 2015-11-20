/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madn;

import Client.TcpClient;
import Packethandling.Packet;
import Server.TcpServer;
/**
 *
 * @author mfrye
 */
public class MADN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
       //TcpServer.main(args);
       TcpClient.main(args);
      //Packet p = new Packet("2","",null);
      //p.writestring("Parameter 1 ?!?!");
      //p.writestring("Parameter 2 ?!?!");
      //String test = p.readstring();
      //test = p.readstring();
      //test = p.readstring();
        //
    }
    
}
