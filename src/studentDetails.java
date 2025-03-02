import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.*;
import Project.ConnectionProvider;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
@SuppressWarnings("serial")

public class studentDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentDetails frame = new studentDetails();
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
	public studentDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1352, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 10, 83, 71);
		lblNewLabel.setIcon(new ImageIcon("E:\\DKTE_SY\\10207-man-student-light-skin-tone-icon.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FILL UP THE FORM");
		lblNewLabel_1.setBounds(103, 24, 618, 49);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 42));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date :");
		lblNewLabel_2.setBounds(844, 24, 89, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("17/09/2002");
		lblNewLabel_3.setBounds(929, 23, 236, 29);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Index().setVisible(true);
			}
		});
		btnNewButton.setBounds(1189, 24, 117, 29);
		btnNewButton.setIcon(new ImageIcon("E:\\DKTE_SY\\arrow-next-3-icon.png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 91, 1338, 7);
		contentPane.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("Roll no :");
		lblNewLabel_4.setBounds(59, 119, 89, 19);
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		textField.setBounds(214, 118, 117, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Name :");
		lblNewLabel_5.setBounds(59, 161, 83, 19);
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		textField_1.setBounds(214, 160, 409, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Father's name :");
		lblNewLabel_6.setBounds(59, 206, 131, 19);
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		textField_2.setBounds(214, 201, 409, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Mother's name :");
		lblNewLabel_7.setBounds(59, 260, 138, 19);
		lblNewLabel_7.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		contentPane.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		textField_3.setBounds(214, 256, 409, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Gender :");
		lblNewLabel_8.setBounds(59, 308, 117, 19);
		lblNewLabel_8.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		contentPane.add(lblNewLabel_8);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		comboBox.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		comboBox.setBounds(214, 305, 117, 25);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_9 = new JLabel("Contact no. :");
		lblNewLabel_9.setBounds(59, 355, 128, 19);
		lblNewLabel_9.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		contentPane.add(lblNewLabel_9);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		textField_4.setBounds(214, 351, 409, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Email id :");
		lblNewLabel_10.setBounds(59, 403, 117, 19);
		lblNewLabel_10.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		contentPane.add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		textField_5.setBounds(214, 399, 409, 25);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Address :");
		lblNewLabel_11.setBounds(63, 446, 85, 19);
		lblNewLabel_11.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		contentPane.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		textField_6.setBounds(214, 448, 409, 25);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("SAVE & NEXT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rollNo=textField.getText();
				String name=textField_1.getText();
				String fatherName=textField_2.getText();
				String motherName=textField_3.getText();
				String gender=(String)comboBox.getSelectedItem();
				String contactNo=textField_4.getText();
				String email=textField_5.getText();
				String address=textField_6.getText();
				
				try {
					Connection con=ConnectionProvider.getcon();
					PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?)");
					ps.setString(1, rollNo);                                                                //this parameter indicates that at which index and to which value
					ps.setString(2, name);
					ps.setString(3,fatherName);
					ps.setString(4, motherName);
					ps.setString(5, gender);
					ps.setString(6,contactNo);
					ps.setString(7, email);
					ps.setString(8, address);
				    ps.executeUpdate();                                             //this means data will get stored in database
				    setVisible(false);
				    new instructionStudent(rollNo).setVisible(true);
				}
				catch(Exception a) {
					JOptionPane.showMessageDialog(null, a);
					
				}
				
			}
		});
		btnNewButton_1.setBounds(430, 533, 503, 58);
		btnNewButton_1.setIcon(new ImageIcon("E:\\DKTE_SY\\Save-icon.png"));
		btnNewButton_1.setFont(new Font("Wide Latin", Font.BOLD, 30));
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\JAYPRAKASH\\Pictures\\Screenshots\\Screenshot_20230113_192541.png"));
		lblNewLabel_12.setBounds(0, 0, 1218, 585);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("E:\\DKTE_SY\\Screenshot_20230113_192541.png"));
		lblNewLabel_13.setBounds(0, 583, 1218, 141);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\JAYPRAKASH\\Pictures\\Screenshots\\Screenshot_20230113_192541.png"));
		lblNewLabel_14.setBounds(1215, 24, 123, 825);
		contentPane.add(lblNewLabel_14);
		
		SimpleDateFormat dFormat= new SimpleDateFormat();
		Date date=new Date();
		lblNewLabel_3.setText(dFormat.format(date));
		
		
		
	}
}
