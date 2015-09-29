/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.login.view;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Lokaler Benutzer
 */
class login extends Canvas{
    
    private Frame login;
    private TextField loginField;
    private Button loginButton = new Button("Einloggen");
    
    login(){
        login = new Frame("Login");
        loginField = new TextField();
        login.add(loginField);
        login.add(loginButton);
    }
    
    public static class CloseListener extends WindowAdapter
	{	public void windowClosing(WindowEvent e)
		{	e.getWindow().setVisible(false);
			System.exit(0);
		}
	}
}
