import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import Project.ConnectionProvider;
@SuppressWarnings("serial")
public class deleteQuestion extends JFrame {

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
					deleteQuestion frame = new deleteQuestion();
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
	public deleteQuestion() {
		setLocation(new Point(150, 183));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1238, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(20, 20, 53, 70);
		lblNewLabel.setIcon(new ImageIcon("E:\\DKTE_SY\\trash-icon.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Delete Question");
		lblNewLabel_1.setBounds(83, 34, 276, 43);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 36));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminHome.open=0;
				setVisible(false);
			}
		});
		btnNewButton.setBounds(973, 35, 154, 43);
		btnNewButton.setIcon(new ImageIcon("E:\\DKTE_SY\\arrow-next-3-icon.png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 34));
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 87, 1224, 11);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Question NO.");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		lblNewLabel_2.setBounds(127, 134, 130, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Question");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		lblNewLabel_3.setBounds(127, 184, 114, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Option 1:");
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_4.setBounds(127, 236, 93, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Option 2:");
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_5.setBounds(127, 287, 93, 21);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.ITALIC, 22));
		textField.setBounds(276, 134, 174, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.ITALIC, 22));
		textField_1.setBounds(276, 184, 820, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.ITALIC, 22));
		textField_2.setBounds(276, 236, 820, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.ITALIC, 22));
		textField_3.setBounds(276, 283, 820, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Option 3:");
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_6.setBounds(127, 339, 93, 21);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.ITALIC, 22));
		textField_4.setBounds(276, 335, 820, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Option 4:");
		lblNewLabel_7.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_7.setBounds(127, 394, 93, 21);
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.ITALIC, 22));
		textField_5.setBounds(274, 390, 822, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField.getText();
				try
				{
					Connection con=ConnectionProvider.getcon();
					Statement st=con.createStatement();
					//PreparedStatement ps=con.prepareStatement();
					ResultSet rs=st.executeQuery(" select *from question where id='"+id+"'");
								if(rs.next()) {
									textField_1.setText(rs.getString(2));
									textField_2.setText(rs.getString(3));
									textField_3.setText(rs.getString(4));
									textField_4.setText(rs.getString(5));
									textField_5.setText(rs.getString(6));
									textField_6.setText(rs.getString(7));
									
									textField.setEditable(false);
						
					}
					else
					{
						JFrame jf=new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf, "Question id not found");
					}
				}
				catch(Exception c)
				{
					JFrame jf=new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, c);
				}
				
			}
			
		});
		btnNewButton_1.setIcon(new ImageIcon("E:\\DKTE_SY\\Search-icon.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_1.setBounds(534, 120, 174, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField.getText();
				try
				{
					Connection con=ConnectionProvider.getcon();
					PreparedStatement ps=con.prepareStatement("delete from question where id=?");
					ps.setString(1, id);
					ps.executeUpdate();		
					
					JFrame jf=new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "Successfully Deleted");
					setVisible(false);
					new deleteQuestion().setVisible(true);
				}
				catch(Exception b)
				{
					JFrame jf=new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, b);
				}
			}
		});
		btnNewButton_2.setBackground(new Color(255, 128, 192));
		btnNewButton_2.setIcon(new ImageIcon("E:\\DKTE_SY\\Button-Close-icon.png"));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_2.setBounds(371, 515, 130, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField.setEditable(true);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_3.setBounds(608, 511, 130, 43);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_9 = new JLabel("Answer=");
		lblNewLabel_9.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_9.setBounds(127, 456, 114, 21);
		contentPane.add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setBounds(276, 453, 820, 26);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\JAYPRAKASH\\Pictures\\Screenshots\\Screenshot_20230113_192541.png"));
		lblNewLabel_8.setBounds(0, 87, 1224, 542);
		contentPane.add(lblNewLabel_8);
	}
}
