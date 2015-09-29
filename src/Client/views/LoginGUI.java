/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.views;

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
class LoginGUI extends Frame{
    
    private Frame login;
    private TextField loginField;
    private Button loginButton = new Button("Einloggen");
    
    LoginGUI(){
        super("Login");
        
        initForm();
    }
    
    private void initForm(){
        loginField = new TextField();
        this.add(loginField);
        this.add(loginButton);
    }
    
    public String getPlayerName(){
        return this.loginField.getText();
    }
    
    public void setLoginListener(ActionListener l){
        this.loginButton.addActionListener(l);
    }
    
    public static class CloseListener extends WindowAdapter
	{	public void windowClosing(WindowEvent e)
		{	e.getWindow().setVisible(false);
			System.exit(0);
		}
	}
}
