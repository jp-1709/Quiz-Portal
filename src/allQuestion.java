import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.proteanit.sql.DbUtils;
import java .sql.*;
import Project.ConnectionProvider;
import javax.swing.JOptionPane;
@SuppressWarnings("serial")
public class allQuestion extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					allQuestion frame = new allQuestion();
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
	public allQuestion() {
		setLocation(new Point(150, 183));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 627);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 20, 62, 64);
		lblNewLabel.setIcon(new ImageIcon("E:\\DKTE_SY\\Food-List-Ingredients-icon (1).png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("All Questions");
		lblNewLabel_1.setBounds(82, 32, 306, 52);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(961, 27, 126, 37);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminHome.open=0;
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("E:\\DKTE_SY\\arrow-next-3-icon.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 86, 1132, 7);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(617, 312, -513, -150);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"00", "mkm", "m", "p", "k", "f", "p"},
				{"2", "What is used at end of statement in c?", "coma", "semicolon", "colon", "Fullstop", "semicolon"},
			},
			new String[] {
				"id", "name", "opt1", "opt2", "opt3", "opt4", "answer"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(98);
		table.setBounds(0, 89, 1132, 501);
		contentPane.add(table);
		
		try
		{
			Connection con=ConnectionProvider.getcon();
			Statement st=con.createStatement();
			//PreparedStatement ps=con.prepareStatement();
			ResultSet rs=st.executeQuery("select *from question");
		   table.setModel(DbUtils.resultSetToTableModel(rs));
		   
		   JLabel lblNewLabel_2 = new JLabel("");
		   lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JAYPRAKASH\\Pictures\\Screenshots\\Screenshot_20230113_192541.png"));
		   lblNewLabel_2.setBounds(0, 0, 1132, 590);
		   contentPane.add(lblNewLabel_2);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
		}
	}
}
