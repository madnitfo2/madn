/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madn;

import Client.TcpClient;
import Client.views.LobbyGUI;
import Client.views.LoginGUI;
import Client.views.SpielfeldGUI;
import Server.TcpServer;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.Font;

import javax.swing.JList;
import javax.swing.AbstractListModel;

import java.awt.List;
import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Button;

import javax.swing.JFormattedTextField;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import java.awt.Checkbox;
import javax.swing.Icon;
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
      
        //TcpClient.main(args);
        
        
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					LobbyGUI MLobbyApp= new LobbyGUI();
					MLobbyApp.frmLobby.setVisible(true);
					
					LoginGUI LoginFrame = new LoginGUI();
					LoginFrame.setVisible(true);
					
					SpielfeldGUI frame = new SpielfeldGUI();
					frame.setVisible(true);
					
									
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

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
