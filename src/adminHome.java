import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
@SuppressWarnings("serial")
public class adminHome extends JFrame {

	private JPanel contentPane;
	public static int open=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminHome frame = new adminHome();
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
	public adminHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 706);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setName("");
		setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("Add Question");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(open==0)
				{
					new addNewQuestion().setVisible(true);
					open=1;
					
				}
				else
				{
					JFrame jf= new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"One page is already open");
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("E:\\DKTE_SY\\Programming-Add-Property-icon.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show Questions");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(open==0)
				{
					new allQuestion().setVisible(true);
					open=1;
					
				}
				else
				{
					JFrame jf= new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"One page is already open");
				}
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("E:\\DKTE_SY\\Food-List-Ingredients-icon.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete Question");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					if(open==0)
					{
						new deleteQuestion().setVisible(true);
						open=1;
						
					}
					else
					{
						JFrame jf= new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"One page is already open");
					}
					
				}
				
			
		});
		btnNewButton_2.setIcon(new ImageIcon("E:\\DKTE_SY\\File-Delete-icon.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		menuBar.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("Student Result");
		btnNewButton_5.setIcon(new ImageIcon("E:\\DKTE_SY\\Search-Results-icon.png"));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		menuBar.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("LogOut");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame jf=new JFrame();
				jf.setAlwaysOnTop(true);
				int a=JOptionPane.showConfirmDialog(jf,"Do you really want to Logout!!","select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					System.exit(0);
					
				}
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("E:\\DKTE_SY\\Apps-session-logout-icon.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		menuBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.setIcon(new ImageIcon("E:\\DKTE_SY\\Button-Close-icon.png"));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		menuBar.add(btnNewButton_4);
		contentPane = new JPanel();
		contentPane.setName("xyz");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JAYPRAKASH\\Pictures\\Screenshots\\bg.png"));
		lblNewLabel.setBounds(0, -31, 936, 665);
		contentPane.add(lblNewLabel);
	}
}
