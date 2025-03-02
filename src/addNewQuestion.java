import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import Project.ConnectionProvider;
@SuppressWarnings("serial")

public class addNewQuestion extends JFrame {

	private JPanel contentPane;
	private JTextField txtMnnn;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addNewQuestion frame = new addNewQuestion();
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
	public addNewQuestion() {
		setLocation(new Point(150, 183));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1134, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(41, 30, 58, 62);
		lblNewLabel.setIcon(new ImageIcon("E:\\DKTE_SY\\Programming-Add-Property-icon (1).png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Add New Question");
		lblNewLabel_1.setBounds(120, 35, 285, 38);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 34));
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 95, 1120, 8);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Question no>");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		lblNewLabel_2.setBounds(94, 156, 131, 22);
		contentPane.add(lblNewLabel_2);
		
		final JLabel lblNewLabel_3 = new JLabel("00");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_3.setBounds(235, 155, 58, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Question");
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		lblNewLabel_4.setBounds(94, 201, 100, 22);
		contentPane.add(lblNewLabel_4);
		
		txtMnnn = new JTextField();
		txtMnnn.setFont(new Font("Tahoma", Font.ITALIC, 22));
		txtMnnn.setBounds(217, 195, 776, 29);
		contentPane.add(txtMnnn);
		txtMnnn.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Option 1:");
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_5.setBounds(94, 263, 89, 22);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.ITALIC, 22));
		textField_1.setBounds(217, 257, 776, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("OPtion 2:");
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_6.setBounds(94, 315, 94, 22);
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.ITALIC, 22));
		textField_2.setBounds(217, 309, 776, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Option 3:");
		lblNewLabel_7.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_7.setBounds(94, 368, 89, 22);
		contentPane.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.ITALIC, 22));
		textField_3.setBounds(217, 362, 776, 29);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Option 4:");
		lblNewLabel_8.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_8.setBounds(94, 420, 84, 22);
		contentPane.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.ITALIC, 22));
		textField_4.setBounds(217, 414, 776, 29);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Answer");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_9.setBounds(94, 499, 89, 22);
		contentPane.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.ITALIC, 22));
		textField_5.setBounds(217, 493, 776, 29);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=lblNewLabel_3.getText();
				String name=txtMnnn.getText();
				String opt1=textField_1.getText();
				String opt2=textField_2.getText();
				String opt3=textField_3.getText();
				String opt4=textField_4.getText();
				String answer=textField_5.getText();
				try
				{
					//prepared statement used to compile the query and execute it repeatedly.
					Connection con=ConnectionProvider.getcon();
					PreparedStatement ps=con.prepareStatement("insert into question values(?,?,?,?,?,?,?)");
					ps.setString(1,id);
					ps.setString(2,name);
					ps.setString(3,opt1);
					ps.setString(4,opt2);
					ps.setString(5,opt3);					
					ps.setString(6,opt4);
					ps.setString(7,answer);
					ps.executeUpdate();
					JFrame jf=new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"Successfully updated!!");
					setVisible(false);
					new addNewQuestion().setVisible(true);
				}
				catch(java.lang.Exception a){
					//throw(e);
					JFrame jf=new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,a);
					
				}
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("E:\\DKTE_SY\\Save-icon.png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(282, 555, 121, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMnnn.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_5.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(524, 556, 121, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\JAYPRAKASH\\Pictures\\Screenshots\\Screenshot_20230113_192541.png"));
		lblNewLabel_10.setBounds(0, 94, 1120, 559);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminHome.open=0;
				setVisible(false);
			}
			
		});
		btnNewButton_2.setIcon(new ImageIcon("E:\\DKTE_SY\\arrow-next-3-icon.png"));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_2.setBounds(931, 32, 179, 46);
		contentPane.add(btnNewButton_2);
		
		try
		{
			Connection con=ConnectionProvider.getcon();
			Statement st=con.createStatement();
			//PreparedStatement ps=con.prepareStatement();
			ResultSet rs=st.executeQuery("select count(id) from question");
						if(rs.next()) {
				int id=rs.getInt(1);
				id=id+1;
				String str= String.valueOf(id);
				lblNewLabel_3.setText(str);
			}
			else
			{
				lblNewLabel_3.setText("1");
			}
		}
		catch(Exception e)
		{
			JFrame jf=new JFrame();
			jf.setAlwaysOnTop(true);
			JOptionPane.showMessageDialog(jf, e);
		}
		
	}

}
