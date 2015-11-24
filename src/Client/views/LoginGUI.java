package Client.views;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import Server.login.controller.loginController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class LoginGUI extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField txtEnterYourName;
    JButton btnNewButton = new JButton("GO!");
    loginController controller = new loginController();

    public LoginGUI() {
            setResizable(false);
            setTitle("Login");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 379, 160);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JPanel panel = new JPanel();
            panel.setBounds(0, 0, 375, 134);
            panel.setBackground(new Color(46, 139, 87));
            contentPane.add(panel);
            panel.setLayout(null);

            txtEnterYourName = new JTextField();
            txtEnterYourName.setText("Enter Your Name");
            txtEnterYourName.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
            txtEnterYourName.setBounds(25, 32, 322, 32);
            panel.add(txtEnterYourName);
            txtEnterYourName.setColumns(10);

            btnNewButton.setBounds(138, 81, 89, 33);
            panel.add(btnNewButton);
            ButtonEvents();
    }
        
    public void ButtonEvents() {
        btnNewButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        controller.createNewPlayer(txtEnterYourName.getText());
        this.dispose();
    } 
        
}
