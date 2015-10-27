/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.views;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lokaler Benutzer
 */
public class LobbyGUI extends Frame {
   
   private Frame lobby;
   private TextField chatInput;
   private Checkbox readyCheckp1;
   private Checkbox readyCheckp2;
   private Checkbox readyCheckp3;
   private Checkbox readyCheckp4;
   
   private Button readyButton;
   private Label player1Label;
   private Label player2Label;
   private Label player3Label;
   private Label player4Label;
   private Panel chatBox;
   
   
   
   LobbyGUI(){
       super("Lobby");
               
       initForm();        
   }
   
   private void initForm(){}
   
    
    public static class CloseListener extends WindowAdapter
	{	public void windowClosing(WindowEvent e)
		{	e.getWindow().setVisible(false);
			System.exit(0);
		}
	}
}
