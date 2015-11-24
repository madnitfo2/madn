/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.login.view;
import Server.login.controller.loginController;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

/**
 *
 * @author Lokaler Benutzer
 */
class login extends Canvas implements ActionListener{
    
    private Frame login;
    private TextField loginField;
    private Button loginButton = new Button("Einloggen");
    loginController controller = new loginController();
            
    login(){
        login = new Frame("Login");
        loginField = new TextField();
        login.add(loginField);
        login.add(loginButton);
        ButtonEvents();
    }
    
    public void ButtonEvents() {
        loginButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        controller.createNewPlayer(loginField.getText());
        login.dispose();
    } 
    
    public static class CloseListener extends WindowAdapter
	{	public void windowClosing(WindowEvent e)
		{	e.getWindow().setVisible(false);
			System.exit(0);
		}
	}
}
