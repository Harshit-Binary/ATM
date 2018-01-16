
package mainatm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Managerwork extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Managerwork frame = new Managerwork();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void close()
	{
		WindowEvent winclose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
	}
	
	/**
	 * Create the frame.
	 */
	public Managerwork() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 784, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToAtm = new JLabel("\r\n");
		lblWelcomeToAtm.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		lblWelcomeToAtm.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		lblWelcomeToAtm.setBounds(263, 13, 465, 49);
		contentPane.add(lblWelcomeToAtm);
		
		JButton btnAddUser = new JButton("Add User");
		btnAddUser.setBackground(new Color(240, 255, 240));
		btnAddUser.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
				Adduser adduser=new Adduser();
				adduser.setVisible(true);
			}
		});
		btnAddUser.setBounds(353, 202, 141, 23);
		contentPane.add(btnAddUser);
		
		JButton btncashentry = new JButton("Cash Entry");
		btncashentry.setBackground(new Color(240, 255, 240));
		btncashentry.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btncashentry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				close();
				Cashentry cashentry = new Cashentry();
				cashentry.setVisible(true);
			}
		});
		btncashentry.setBounds(353, 244, 141, 23);
		contentPane.add(btncashentry);
		
		JButton btnViewDatabase = new JButton("View Database");
		btnViewDatabase.setBackground(new Color(240, 248, 255));
		btnViewDatabase.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnViewDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
				Viewdata frame = new Viewdata();
				frame.setVisible(true);
			}
		});
		btnViewDatabase.setBounds(353, 281, 141, 23);
		contentPane.add(btnViewDatabase);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(240, 255, 240));
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Managerwork mw=new Managerwork();
				//mw.setVisible(false);
			//	Managerlogin frame = new Managerlogin();
				//frame.setVisible(false);
				close();
				BUCKS_BANK_ATM window = new BUCKS_BANK_ATM();
				window.frmWelcomeToAutomated.setVisible(true);
				
			}
		});
		btnLogout.setBounds(353, 324, 141, 23);
		contentPane.add(btnLogout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 768, 123);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(358, 12, 0, 0);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(363, 12, 0, 0);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(368, 5, 46, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(419, 12, 0, 0);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(10, 0, 207, 123);
		panel.add(label_4);
		label_4.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		
		JLabel lblWhatYouWant = new JLabel("WHAT YOU WANT TO PERFORM?");
		lblWhatYouWant.setForeground(new Color(255, 255, 255));
		lblWhatYouWant.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 18));
		lblWhatYouWant.setBounds(263, 173, 290, 16);
		contentPane.add(lblWhatYouWant);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\hh.jpg"));
		lblNewLabel.setBounds(254, 146, 317, 248);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\yy.jpg"));
		lblNewLabel_1.setBounds(0, 110, 775, 308);
		contentPane.add(lblNewLabel_1);
	}
}
