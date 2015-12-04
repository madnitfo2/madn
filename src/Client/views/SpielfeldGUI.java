package Client.views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import Server.main.model.game;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.Icon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SpielfeldGUI extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JTextField textFieldIngameGrpChat;
        ImageIcon lbldice;
        game currGame = new game();
        int diceResult = 0;
        String result = "";
        JPanel panel_2;
	/**
	 * Create the frame.
	 */
	public SpielfeldGUI() {
                int playerId = 0;
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1270, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(46, 139, 87));
		panel.setBounds(0, 0, 920, 750);
		contentPane.add(panel);
		panel.setLayout(null);

		ImageIcon icobfeld = new ImageIcon("images/Spielfeld/_blau_feld.png");
		ImageIcon icorfeld = new ImageIcon("images/Spielfeld/_rot_feld.png");
		ImageIcon icogrfeld = new ImageIcon("images/Spielfeld/_gruen_feld.png");
		ImageIcon icogefeld = new ImageIcon("images/Spielfeld/_gelb_feld.png");
		//Figuren blau
		ImageIcon icobfigurl51 = new ImageIcon("images/figuren/blau/Figur_Blau_l51.png");
		ImageIcon icobfigurl41 = new ImageIcon("images/figuren/blau/Figur_Blau_l41.png");
		ImageIcon icobfigur = new ImageIcon("images/figuren/blau/Figur_Blau_n.png");
                //Figuren rot
                ImageIcon icorfigurl51 = new ImageIcon("images/figuren/rot/Figur_Rot_l51.png");
		ImageIcon icorfigurl41 = new ImageIcon("images/figuren/rot/Figur_Rot_l41.png");
		ImageIcon icorfigur = new ImageIcon("images/figuren/rot/Figur_Rot_n.png");
                //Figuren Gruen
                ImageIcon icogrfigurl51 = new ImageIcon("images/figuren/gruen/Figur_Gruen_l51.png");
		ImageIcon icogrfigurl41 = new ImageIcon("images/figuren/gruen/Figur_Gruen_l41.png");
		ImageIcon icogrfigur = new ImageIcon("images/figuren/gruen/Figur_Gruen_n.png");
                //Figuren Gelb
                ImageIcon icogefigurl51 = new ImageIcon("images/figuren/gelb/Figur_Gelb_l51.png");
		ImageIcon icogefigurl41 = new ImageIcon("images/figuren/gelb/Figur_Gelb_l41.png");
		ImageIcon icogefigur = new ImageIcon("images/figuren/gelb/Figur_Gelb_n.png");
			
		
		
		JTextPane textPaneLog = new JTextPane();
		textPaneLog.setBounds(10, 607, 900, 132);
		panel.add(textPaneLog);
                
                JLabel lblSpielfeld;
                
                //Figuren, ohne Positionen
                    //Farbe blau
                JLabel lbl_fb1 = new JLabel(icobfigurl51);
                lbl_fb1.setText("");
                JLabel lbl_fb2 = new JLabel(icobfigurl41);
                lbl_fb2.setText("");
                JLabel lbl_fb3 = new JLabel(icobfigurl51);
                lbl_fb3.setText("");
                JLabel lbl_fb4 = new JLabel(icobfigurl41);
                lbl_fb4.setText("");
                    //Farbe rot
                JLabel lbl_fr1 = new JLabel(icorfigurl51);
                lbl_fr1.setText("");
                JLabel lbl_fr2 = new JLabel(icorfigurl41);
                lbl_fr2.setText("");
                JLabel lbl_fr3 = new JLabel(icorfigurl51);
                lbl_fr3.setText("");
                JLabel lbl_fr4 = new JLabel(icorfigurl41);
                lbl_fr4.setText("");
                    //Farbe grün
                JLabel lbl_fgr1 = new JLabel(icogrfigurl51);
                lbl_fgr1.setText("");
                JLabel lbl_fgr2 = new JLabel(icogrfigurl41);
                lbl_fgr2.setText("");
                JLabel lbl_fgr3 = new JLabel(icogrfigurl51);
                lbl_fgr3.setText("");
                JLabel lbl_fgr4 = new JLabel(icogrfigurl41);
                lbl_fgr4.setText("");
                    //Farbe gelb
                JLabel lbl_fge1 = new JLabel(icogefigurl51);
                lbl_fge1.setText("");
                JLabel lbl_fge2 = new JLabel(icogefigurl41);
                lbl_fge2.setText("");
                JLabel lbl_fge3 = new JLabel(icogefigurl51);
                lbl_fge3.setText("");
                JLabel lbl_fge4 = new JLabel(icogefigurl41);
                lbl_fge4.setText("");
                
                
                
		switch (playerId) {
                    //Figuren-Image Sources noch ändern für alle Farben ausser blau
                    case 0:     
                                //Figuren-Positionen
                                    //Blau
                                lbl_fb1.setBounds(100, 444, 65, 64);
                                lbl_fb2.setBounds(166, 444, 65, 64);
                                lbl_fb3.setBounds(107, 396, 65, 64);
                                lbl_fb4.setBounds(172, 397, 65, 64);
                                    //rot
                                lbl_fr1.setBounds(160, 80, 65, 64);
                                lbl_fr2.setBounds(216, 80, 65, 64);
                                lbl_fr3.setBounds(165, 49, 65, 64);
                                lbl_fr4.setBounds(219, 49, 65, 64);
                                    //grün
                                lbl_fgr1.setBounds(644, 78, 65, 64);
                                lbl_fgr2.setBounds(698, 78, 65, 64);
                                lbl_fgr3.setBounds(639, 49, 65, 64);
                                lbl_fgr4.setBounds(690, 49, 65, 64);
                                    //gelb
                                lbl_fge1.setBounds(691, 444, 65, 64);
                                lbl_fge2.setBounds(757, 444, 65, 64);
                                lbl_fge3.setBounds(685, 396, 65, 64);
                                lbl_fge4.setBounds(750, 397, 65, 64);
                             break;
                    case 1:     
                                //Figuren-Positionen
                                    //rot
                                lbl_fr1.setBounds(100, 444, 65, 64);
                                lbl_fr2.setBounds(166, 444, 65, 64);
                                lbl_fr3.setBounds(107, 396, 65, 64);
                                lbl_fr4.setBounds(172, 397, 65, 64);
                                    //grün
                                lbl_fgr1.setBounds(160, 80, 65, 64);
                                lbl_fgr2.setBounds(216, 80, 65, 64);
                                lbl_fgr3.setBounds(165, 49, 65, 64);
                                lbl_fgr4.setBounds(219, 49, 65, 64);
                                    //gelb
                                lbl_fge1.setBounds(644, 78, 65, 64);
                                lbl_fge2.setBounds(698, 78, 65, 64);
                                lbl_fge3.setBounds(639, 49, 65, 64);
                                lbl_fge4.setBounds(690, 49, 65, 64);
                                    //blau
                                lbl_fb1.setBounds(691, 444, 65, 64);
                                lbl_fb2.setBounds(757, 444, 65, 64);
                                lbl_fb3.setBounds(685, 396, 65, 64);
                                lbl_fb4.setBounds(750, 397, 65, 64);
                             break;
                    case 2:     
                                 //Figuren-Positionen
                                    //grün
                                lbl_fgr1.setBounds(100, 444, 65, 64);
                                lbl_fgr2.setBounds(166, 444, 65, 64);
                                lbl_fgr3.setBounds(107, 396, 65, 64);
                                lbl_fgr4.setBounds(172, 397, 65, 64);
                                    //gelb
                                lbl_fge1.setBounds(160, 80, 65, 64);
                                lbl_fge2.setBounds(216, 80, 65, 64);
                                lbl_fge3.setBounds(165, 49, 65, 64);
                                lbl_fge4.setBounds(219, 49, 65, 64);
                                    //blau
                                lbl_fb1.setBounds(644, 78, 65, 64);
                                lbl_fb2.setBounds(698, 78, 65, 64);
                                lbl_fb3.setBounds(639, 49, 65, 64);
                                lbl_fb4.setBounds(690, 49, 65, 64);
                                    //rot
                                lbl_fr1.setBounds(691, 444, 65, 64);
                                lbl_fr2.setBounds(757, 444, 65, 64);
                                lbl_fr3.setBounds(685, 396, 65, 64);
                                lbl_fr4.setBounds(750, 397, 65, 64);
                             break;
                    case 3:     
                                 //Figuren-positionen
                                 //gelb
                                lbl_fge1.setBounds(100, 444, 65, 64);
                                lbl_fge2.setBounds(166, 444, 65, 64);
                                lbl_fge3.setBounds(107, 396, 65, 64);
                                lbl_fge4.setBounds(172, 397, 65, 64);
                                //blau
                                lbl_fb1.setBounds(160, 80, 65, 64);
                                lbl_fb2.setBounds(216, 80, 65, 64);
                                lbl_fb3.setBounds(165, 49, 65, 64);
                                lbl_fb4.setBounds(219, 49, 65, 64);
                                //rot
                                lbl_fr1.setBounds(644, 78, 65, 64);
                                lbl_fr2.setBounds(698, 78, 65, 64);
                                lbl_fr3.setBounds(639, 49, 65, 64);
                                lbl_fr4.setBounds(690, 49, 65, 64);
                                //grün
                                lbl_fgr1.setBounds(691, 444, 65, 64);
                                lbl_fgr2.setBounds(757, 444, 65, 64);
                                lbl_fgr3.setBounds(685, 396, 65, 64);
                                lbl_fgr4.setBounds(750, 397, 65, 64);
                             break;
                }
                
                //Figuren zum Panel hinzufügen
                //blau
                panel.add(lbl_fb1);
                panel.add(lbl_fb2);
                panel.add(lbl_fb3);
                panel.add(lbl_fb4);
                //rot
                panel.add(lbl_fr1);
                panel.add(lbl_fr2);
                panel.add(lbl_fr3);
                panel.add(lbl_fr4);
                //grün
                panel.add(lbl_fgr1);
                panel.add(lbl_fgr2);
                panel.add(lbl_fgr3);
                panel.add(lbl_fgr4);
                //gelb
                panel.add(lbl_fge1);
                panel.add(lbl_fge2);
                panel.add(lbl_fge3);
                panel.add(lbl_fge4);
                
                
                switch (playerId) {
                    //Figuren-Image Sources noch ändern für alle Farben ausser blau
                    case 0:    
                                //Spielfeld
                                lblSpielfeld = new JLabel(icobfeld);
                                lblSpielfeld.setBounds(10, 11, 900, 585);
                                panel.add(lblSpielfeld);
                             break;
                    case 1:     
                                //Spielfeld
                                lblSpielfeld = new JLabel(icorfeld);
                                lblSpielfeld.setBounds(10, 11, 900, 585);
                                panel.add(lblSpielfeld);
                             break;
                    case 2:     
                                //Spielfeld
                                lblSpielfeld = new JLabel(icogrfeld);
                                lblSpielfeld.setBounds(10, 11, 900, 585);
                                panel.add(lblSpielfeld);
                             break;
                    case 3:     
                                //Spielfeld
                                lblSpielfeld = new JLabel(icogefeld);
                                lblSpielfeld.setBounds(10, 11, 900, 585);
                                panel.add(lblSpielfeld);
                             break;
                }


		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 139, 87));
		panel_1.setBounds(920, 0, 346, 750);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 11, 336, 728);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panelLeaderBoard = new JPanel();
		panelLeaderBoard.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), " Leaderboard", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelLeaderBoard.setBounds(10, 11, 316, 279);
		panel_2.add(panelLeaderBoard);
		panelLeaderBoard.setLayout(null);
		
		
		ImageIcon lblgold = new ImageIcon("images/gold.png");
		ImageIcon lblsilber = new ImageIcon("images/silber.png");
		ImageIcon lblbronze = new ImageIcon("images/bronze.png");
		
		JLabel lblGoldIco = new JLabel(lblgold);
		lblGoldIco.setText("");
		lblGoldIco.setBounds(255, 36, 44, 43);
		panelLeaderBoard.add(lblGoldIco);
		
		JLabel lblSilberico = new JLabel(lblsilber);
		lblSilberico.setText("");
		lblSilberico.setBounds(255, 76, 44, 43);
		panelLeaderBoard.add(lblSilberico);
		
		JLabel lblbronzeico = new JLabel(lblbronze);
		lblbronzeico.setText("");
		lblbronzeico.setBounds(255, 116, 44, 43);
		panelLeaderBoard.add(lblbronzeico);
		
		JLabel lblPlatz1 = new JLabel("Player1");
		lblPlatz1.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		lblPlatz1.setForeground(new Color(0, 102, 255));
		lblPlatz1.setBounds(20, 49, 46, 14);
		panelLeaderBoard.add(lblPlatz1);
		
		JLabel lblPlatz2 = new JLabel("Player2");
		lblPlatz2.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		lblPlatz2.setForeground(new Color(255, 69, 0));
		lblPlatz2.setBounds(20, 89, 46, 14);
		panelLeaderBoard.add(lblPlatz2);
		
		JLabel lblPlatz3 = new JLabel("Player3");
		lblPlatz3.setForeground(new Color(0, 153, 51));
		lblPlatz3.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		lblPlatz3.setBounds(20, 129, 46, 14);
		panelLeaderBoard.add(lblPlatz3);
		
		JLabel lblPlatz4 = new JLabel("Player4");
		lblPlatz4.setForeground(new Color(255, 215, 0));
		lblPlatz4.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		lblPlatz4.setBounds(20, 170, 46, 14);
		panelLeaderBoard.add(lblPlatz4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(76, 30, 1, 170);
		panelLeaderBoard.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(10, 211, 296, 1);
		panelLeaderBoard.add(panel_4);
		
		JLabel lblNewLabel = new JLabel("Turn:");
		lblNewLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		lblNewLabel.setBounds(12, 220, 46, 14);
		panelLeaderBoard.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(52, 220, 61, 14);
		panelLeaderBoard.add(lblNewLabel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
		textPane.setBounds(10, 395, 316, 279);
		panel_2.add(textPane);
		
		textFieldIngameGrpChat = new JTextField();
		textFieldIngameGrpChat.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
		textFieldIngameGrpChat.setBounds(10, 685, 231, 32);
		panel_2.add(textFieldIngameGrpChat);
		textFieldIngameGrpChat.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setBounds(245, 685, 81, 32);
		panel_2.add(btnNewButton);
				
		lbldice = new ImageIcon("images/Dice.jpg");
		JLabel lblDice = new JLabel(lbldice);
		lblDice.setBounds(10, 304, 80, 80);
		panel_2.add(lblDice);
                
                
                
                lblDice.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        // you can open a new frame here as
                        // i have assumed you have declared "frame" as instance variable
                        System.out.println("Würfeln");
                        
                        diceResult = currGame.dice();
                        result = String.valueOf(diceResult);

                        JLabel lblResult = new JLabel(result);
                        lblResult.setBounds(20, 324, 80, 80);
                        panel_2.add(lblResult);
                    }
                });
                
	}

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
