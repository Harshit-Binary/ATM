package mainatm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;

public class BUCKS_BANK_ATM {

	
	  JFrame frmWelcomeToAutomated;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BUCKS_BANK_ATM window = new BUCKS_BANK_ATM();
					window.frmWelcomeToAutomated.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BUCKS_BANK_ATM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToAutomated = new JFrame();
		frmWelcomeToAutomated.setTitle("Welcome To Automated Teller Machine");
		frmWelcomeToAutomated.setType(Type.UTILITY);
		frmWelcomeToAutomated.setBounds(100, 100, 780, 448);
		frmWelcomeToAutomated.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmWelcomeToAutomated.getContentPane().setLayout(null);
		
		JButton btnManager = new JButton("Manager");
		btnManager.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//frmWelcomeToAutomated.dispose();
				frmWelcomeToAutomated.setVisible(false);
				Managerlogin frame = new Managerlogin();
				frame.setVisible(true);
				
				
			}
		});
		btnManager.setBounds(311, 205, 152, 23);
		frmWelcomeToAutomated.getContentPane().add(btnManager);
		
		JButton btnUser = new JButton("User");
		btnUser.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				
				Userlogin ul=new Userlogin();
				ul.setVisible(true);
				
			}
		});
		btnUser.setBounds(311, 254, 152, 23);
		frmWelcomeToAutomated.getContentPane().add(btnUser);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		btnClose.setBounds(311, 309, 152, 23);
		frmWelcomeToAutomated.getContentPane().add(btnClose);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 763, 114);
		frmWelcomeToAutomated.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(121, 29, 0, 0);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(264, 35, 470, 49);
		panel.add(label_2);
		label_2.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(601, 22, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		label.setBounds(10, 11, 190, 103);
		panel.add(label);
		
		JLabel lblWelcomeToAutomated = new JLabel("Please Authenticate yourself as...");
		lblWelcomeToAutomated.setForeground(Color.WHITE);
		lblWelcomeToAutomated.setBounds(268, 154, 267, 22);
		frmWelcomeToAutomated.getContentPane().add(lblWelcomeToAutomated);
		lblWelcomeToAutomated.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 19));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\hh.jpg"));
		lblNewLabel_1.setBounds(241, 120, 316, 264);
		frmWelcomeToAutomated.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\yy.jpg"));
		lblNewLabel_2.setBounds(0, 107, 763, 301);
		frmWelcomeToAutomated.getContentPane().add(lblNewLabel_2);
	}
}
