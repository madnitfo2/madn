package Client.views;
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

public class LobbyGUI {

	public JFrame frmLobby;
        public String currPlayerName;

    public String getCurrPlayerName() {
        return currPlayerName;
    }

    public void setCurrPlayerName(String currPlayerName) {
        this.currPlayerName = currPlayerName;
    }
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
	}

	/**
	 * Create the application.
	 */
	public LobbyGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLobby = new JFrame();
		frmLobby.setTitle("Main - Lobby");
		frmLobby.getContentPane().setBackground(new Color(46, 139, 87));
		frmLobby.setResizable(false);
		frmLobby.setBounds(100, 100, 806, 627);
		frmLobby.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLobby.getContentPane().setLayout(null);
		
		
		
		// Components - PLayer List 
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 197, 577);
		frmLobby.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPlayerName = new JLabel("LUKAS");
		lblPlayerName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerName.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		lblPlayerName.setBounds(8, 17, 177, 14);
		panel.add(lblPlayerName);
		
		List listPlayer = new List();
		listPlayer.setBounds(0, 49, 197, 424);
		panel.add(listPlayer);
		listPlayer.setForeground(Color.BLACK);
		
		JButton btnAcceptInvite = new JButton("Accept invitation");
		btnAcceptInvite.setEnabled(false);
		btnAcceptInvite.setBounds(18, 515, 163, 23);
		panel.add(btnAcceptInvite);
		
		JButton btnDeclineInvitation = new JButton("Decline invitation");
		btnDeclineInvitation.setEnabled(false);
		btnDeclineInvitation.setBounds(18, 545, 163, 23);
		panel.add(btnDeclineInvitation);
		
		JButton btnInvite = new JButton("Invite");
		btnInvite.setEnabled(false);
		btnInvite.setBounds(18, 485, 163, 23);
		panel.add(btnInvite);
		
		
		
		// Components - Chat
		
		
		JTabbedPane tabbedPaneChat = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneChat.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabbedPaneChat.setBounds(217, 335, 573, 253);
		//tabbedPaneChat.setTitleAt(1,"Global Chat");
		frmLobby.getContentPane().add(tabbedPaneChat);
		
		JPanel panelGrpChat = new JPanel();
		tabbedPaneChat.addTab("New tab", null, panelGrpChat, null);
		panelGrpChat.setLayout(null);
				
		JScrollPane ScrollPaneGrpChat = new JScrollPane();
		ScrollPaneGrpChat.setBounds(0, 0, 568, 171);
		panelGrpChat.add(ScrollPaneGrpChat);
		ScrollPaneGrpChat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		JTextArea txtrAreaGlobalChat = new JTextArea();
		txtrAreaGlobalChat.setBackground(Color.WHITE);
		txtrAreaGlobalChat.setEditable(false);
		txtrAreaGlobalChat.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
		txtrAreaGlobalChat.setText("Lukas: MOIN !\r\n\r\nDennis: Hallo zusammen !\r\n\r\nMirco: Hey");
		ScrollPaneGrpChat.setViewportView(txtrAreaGlobalChat);
		
		JFormattedTextField formattedGlobalTextField = new JFormattedTextField();
		formattedGlobalTextField.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
		formattedGlobalTextField.setBounds(10, 183, 453, 32);
		panelGrpChat.add(formattedGlobalTextField);
		
		JButton btnGlobalSend = new JButton("Send");
		btnGlobalSend.setBounds(469, 183, 89, 32);
		panelGrpChat.add(btnGlobalSend);
		
		JPanel panel_4 = new JPanel();
		tabbedPaneChat.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 568, 171);
		panel_4.add(scrollPane);
		
		JTextArea textAreaLobbyChat = new JTextArea();
		textAreaLobbyChat.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
		textAreaLobbyChat.setEditable(false);
		textAreaLobbyChat.setBackground(Color.WHITE);
		scrollPane.setViewportView(textAreaLobbyChat);
		
		JFormattedTextField formattedLobbyTextField = new JFormattedTextField();
		formattedLobbyTextField.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
		formattedLobbyTextField.setBounds(10, 183, 453, 32);
		panel_4.add(formattedLobbyTextField);
		
		JButton btnLobbySend = new JButton("Send");
		btnLobbySend.setBounds(469, 183, 89, 32);
		panel_4.add(btnLobbySend);
		
		
		
		// Components - Lobby
		
		JPanel panelLobby = new JPanel();
		panelLobby.setBounds(217, 11, 573, 313);
		frmLobby.getContentPane().add(panelLobby);
		panelLobby.setLayout(null);
		
		panelLobby.setVisible(true);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(10, 11, 553, 237);
		panelLobby.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Deine Lobby ");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		lblNewLabel_1.setBounds(216, 13, 107, 21);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblP1 = new JLabel("Player1");
		lblP1.setForeground(new Color(51, 102, 255));
		lblP1.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		lblP1.setBounds(104, 98, 293, 14);
		panel_2.add(lblP1);
		
		JLabel lblPlayers = new JLabel("Players:");
		lblPlayers.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		lblPlayers.setBounds(104, 59, 74, 23);
		panel_2.add(lblPlayers);
		
		JLabel lblP2 = new JLabel("Player2");
		lblP2.setForeground(new Color(255, 69, 0));
		lblP2.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		lblP2.setBounds(104, 131, 293, 14);
		panel_2.add(lblP2);
		
		JLabel lblP3 = new JLabel("Player3");
		lblP3.setForeground(new Color(0, 153, 0));
		lblP3.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		lblP3.setBounds(104, 164, 293, 14);
		panel_2.add(lblP3);
		
		JLabel lblP4 = new JLabel("Player4");
		lblP4.setForeground(new Color(255, 215, 0));
		lblP4.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		lblP4.setBounds(104, 197, 293, 14);
		panel_2.add(lblP4);
		
		JButton btnKick1 = new JButton("Kick");
		btnKick1.setEnabled(false);
		btnKick1.setBounds(14, 127, 64, 23);
		panel_2.add(btnKick1);
		
		JButton btnKick2 = new JButton("Kick");
		btnKick2.setEnabled(false);
		btnKick2.setBounds(14, 160, 64, 23);
		panel_2.add(btnKick2);
		
		JButton btnKick3 = new JButton("Kick");
		btnKick3.setEnabled(false);
		btnKick3.setBounds(14, 193, 64, 23);
		panel_2.add(btnKick3);
		
		JLabel lblNewLabel_2 = new JLabel("ready?");
		lblNewLabel_2.setBounds(474, 64, 46, 14);
		panel_2.add(lblNewLabel_2);
				
		ImageIcon lblicon = new ImageIcon("images/Crown.png");
		JLabel lblLead = new JLabel(lblicon);		
		lblLead.setText("");
		lblLead.setBackground(Color.WHITE);
		lblLead.setBounds(24, 87, 40, 30);		
		panel_2.add(lblLead);
		
		ImageIcon lblredd = new ImageIcon("images/RedDot.png");
		ImageIcon lblgreenCM = new ImageIcon("images/GreenCheckMark.png");
		
		JLabel lblReadyp1 = new JLabel(lblgreenCM);
		lblReadyp1.setBounds(482, 95, 20, 20);
		panel_2.add(lblReadyp1);
		
		JLabel lblReadyp2 = new JLabel(lblredd);
		lblReadyp2.setBounds(482, 128, 20, 20);
		panel_2.add(lblReadyp2);
		
		JLabel lblReadyp3 = new JLabel(lblredd);
		lblReadyp3.setBounds(482, 161, 20, 20);
		panel_2.add(lblReadyp3);
		
		JLabel lblReadyp4 = new JLabel(lblredd);
		lblReadyp4.setBounds(482, 194, 20, 20);
		panel_2.add(lblReadyp4);
		
		ImageIcon lblPlayerico = new ImageIcon("images/Playerico.png");
		JLabel labelplayerico = new JLabel(lblPlayerico);
		labelplayerico.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		labelplayerico.setBounds(310, 9, 30, 30);
		panel_2.add(labelplayerico);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(10, 43, 533, 1);
		panel_2.add(panel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_5.setBounds(90, 54, 1, 170);
		panel_2.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_6.setBounds(10, 83, 533, 1);
		panel_2.add(panel_6);
						
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(10, 259, 420, 43);
		panelLobby.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnCloseLobby = new JButton("Close Lobby");
		btnCloseLobby.setEnabled(false);
		btnCloseLobby.setBounds(140, 11, 107, 23);
		panel_3.add(btnCloseLobby);
		
		JLabel lblNewLabelrdyCount = new JLabel("0");
		lblNewLabelrdyCount.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabelrdyCount.setBounds(271, 8, 22, 14);
		panel_3.add(lblNewLabelrdyCount);
		
		JLabel label = new JLabel("/");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(288, 8, 22, 14);
		panel_3.add(label);
		
		JLabel lblSpielernBereit = new JLabel("3 der anderen");
		lblSpielernBereit.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSpielernBereit.setBounds(303, 8, 107, 14);
		panel_3.add(lblSpielernBereit);
		
		JButton btnExitLobby = new JButton("Exit Lobby");
		btnExitLobby.setEnabled(false);
		btnExitLobby.setBounds(10, 11, 107, 23);
		panel_3.add(btnExitLobby);
		
		JLabel lblSpielerSindBereit = new JLabel("Spieler sind bereit");
		lblSpielerSindBereit.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSpielerSindBereit.setBounds(274, 21, 131, 14);
		panel_3.add(lblSpielerSindBereit);
		
		JButton btnStartGame = new JButton("START GAME");
		btnStartGame.setEnabled(false);
		btnStartGame.setBounds(440, 259, 123, 43);
		panelLobby.add(btnStartGame);
		
		JButton btnCreateLobby = new JButton("Create Lobby");
		btnCreateLobby.setBounds(442, 167, 120, 41);
		frmLobby.getContentPane().add(btnCreateLobby);
	}
}
