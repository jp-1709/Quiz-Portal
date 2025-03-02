import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class Index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\JAYPRAKASH\\Pictures\\Screenshots\\Screenshot_20230113_131356.png"));
		setBounds(100, 100, 1286, 757);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel Background;
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(30, 31, 1211, 679);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new studentDetails().setVisible(true);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("E:\\DKTE_SY\\Student-3-icon (2).png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(641, 39, 152, 57);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Admin");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new loginAdmin().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("E:\\DKTE_SY\\10225-woman-teacher-light-skin-tone-icon.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_1.setBounds(846, 39, 139, 57);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a= JOptionPane.showConfirmDialog(null,"Do you want to EXIT","select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					System.exit(0);
				}
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("E:\\DKTE_SY\\Actions-application-exit-icon.png"));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2.setBounds(1038, 39, 139, 57);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JAYPRAKASH\\Pictures\\Screenshots\\bg.png"));
		lblNewLabel.setBounds(29, 125, 1142, 526);
		panel.add(lblNewLabel);
		
	}

}
