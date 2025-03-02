import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class loginAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginAdmin frame = new loginAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1275, 757);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(40, 29, 1097, 659);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(467, 121, 143, 28);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(467, 169, 143, 28);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(467, 247, 123, 28);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(467, 299, 143, 28);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsername.getText().equals("jp123") && passwordField.getText().equals("admin"))
				{
					setVisible(false);
					new adminHome().setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Incorrect username or password!!","show",JOptionPane.INFORMATION_MESSAGE);
					
				}
				
			}
		});
		btnNewButton.setBounds(380, 403, 123, 28);
		btnNewButton.setIcon(new ImageIcon("E:\\DKTE_SY\\User-Interface-Login-icon.png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 setVisible(false);
				  new Index().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(558, 403, 114, 28);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JAYPRAKASH\\Pictures\\Screenshots\\Screenshot_20230113_144318.png"));
		lblNewLabel_2.setBounds(46, 19, 1123, 630);
		panel.add(lblNewLabel_2);
	}
}
