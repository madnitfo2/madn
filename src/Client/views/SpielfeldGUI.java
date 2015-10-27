/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.views;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lokaler Benutzer
 */
public class SpielfeldGUI extends Frame {
    public static class CloseListener extends WindowAdapter
	{	public void windowClosing(WindowEvent e)
		{	e.getWindow().setVisible(false);
			System.exit(0);
		}
	}
}
