/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.player.view;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 *
 * @author Lokaler Benutzer
 */
class lobby extends Canvas{
    
    
    lobby(){
 
    }
    
    public static class CloseListener extends WindowAdapter
	{	public void windowClosing(WindowEvent e)
		{	e.getWindow().setVisible(false);
			System.exit(0);
		}
	}
}
