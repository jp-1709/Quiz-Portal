import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
@SuppressWarnings("serial")

public class instructionStudent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instructionStudent frame = new instructionStudent();
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
	public String rollNo;
	public instructionStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1185, 703);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(20, 10, 71, 76);
		lblNewLabel.setIcon(new ImageIcon("E:\\DKTE_SY\\10207-man-student-light-skin-tone-icon.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("INSTRUCTIONS");
		lblNewLabel_1.setBounds(128, 22, 518, 48);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 80, 1171, 7);
		contentPane.add(separator);
		
		JTextArea txtrinstructionsToBe = new JTextArea();
		txtrinstructionsToBe.setBounds(20, 131, 1067, 391);
		txtrinstructionsToBe.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		txtrinstructionsToBe.setText("#Instructions to be followed during exam\r\n\r\n1)The student should not use his\\her textbook,notes or no any external resource.\r\n\r\n2)Student must complete all the questions that are alloted within given time.\r\n\r\n3)Student must not stop in the middle of the session.\r\n\r\n4)No any malacious activity will be tolerated.\r\n\r\n    \r\n     ALL THE BEST!!!");
		contentPane.add(txtrinstructionsToBe);
		txtrinstructionsToBe.setEditable(false);
		
	
		JButton btnNewButton = new JButton("Start Exam");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new quizExam(rollNo).setVisible(true);
			}
			
			
		});
		btnNewButton.setBounds(413, 574, 189, 48);
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 30));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JAYPRAKASH\\Pictures\\Screenshots\\Screenshot_20230113_192541.png"));
		lblNewLabel_2.setBounds(0, 33, 1181, 633);
		contentPane.add(lblNewLabel_2);
	}
	public instructionStudent(String rollNO1) {
		JOptionPane.showMessageDialog(null, rollNO1);
		rollNo=rollNO1;
	}
	}

