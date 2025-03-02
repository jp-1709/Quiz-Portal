import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;

public class quizExam extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quizExam frame = new quizExam();
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
public quizExam(String rollNo) {
		
	}
	public quizExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1291, 793);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\DKTE_SY\\10207-man-student-light-skin-tone-icon.png"));
		lblNewLabel.setBounds(10, 10, 69, 72);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 48));
		lblNewLabel_1.setBounds(142, 21, 280, 56);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_2.setBounds(506, 21, 63, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_3.setBounds(579, 21, 103, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Toatal Time:");
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_4.setBounds(931, 21, 134, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("10 min");
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_5.setBounds(1075, 22, 84, 22);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Time taken:");
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_6.setBounds(931, 55, 134, 27);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("0");
		lblNewLabel_7.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_7.setBounds(1085, 60, 32, 22);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("0");
		lblNewLabel_8.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_8.setBounds(1107, 65, 45, 17);
		contentPane.add(lblNewLabel_8);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 92, 1218, 2);
		contentPane.add(separator);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(0, 0, 1277, 93);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 105, 401, 410);
		contentPane.add(panel);
		
		
		 }
}
