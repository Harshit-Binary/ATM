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
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import java.awt.Window.Type;

public class Userwork extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userwork frame = new Userwork();
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
	public Userwork() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 734, 381);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToBucks = new JLabel("Welcome to Bucks Bank ATM ");
		lblWelcomeToBucks.setFont(new Font("Simplified Arabic", Font.BOLD, 17));
		lblWelcomeToBucks.setBounds(250, 13, 245, 16);
		contentPane.add(lblWelcomeToBucks);
		
		JLabel lblHelloUser = new JLabel("HELLO USER");
		lblHelloUser.setFont(new Font("Simplified Arabic", Font.BOLD, 16));
		lblHelloUser.setBounds(312, 42, 109, 16);
		contentPane.add(lblHelloUser);
		
		JLabel lblSelectTheOption = new JLabel("Select the option you want to perform");
		lblSelectTheOption.setFont(new Font("Simplified Arabic", Font.BOLD, 15));
		lblSelectTheOption.setBounds(234, 88, 293, 16);
		contentPane.add(lblSelectTheOption);
		
		JButton withdrawn = new JButton("CASH WIDTHDRAWL");
		withdrawn.setBackground(new Color(169, 169, 169));
		withdrawn.setFont(new Font("Simplified Arabic", Font.BOLD, 14));
		withdrawn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
				Withdrawn wi=new Withdrawn();
				wi.setVisible(true);
			}
		});
		withdrawn.setBounds(136, 145, 161, 25);
		contentPane.add(withdrawn);
		
		JButton back = new JButton("BACK");
		back.setBackground(new Color(169, 169, 169));
		back.setFont(new Font("Simplified Arabic", Font.BOLD, 14));
		back.setBounds(136, 210, 161, 25);
		contentPane.add(back);
		
		JButton cashbalance = new JButton("CHECK BALANCE");
		cashbalance.setBackground(new Color(169, 169, 169));
		cashbalance.setFont(new Font("Simplified Arabic", Font.BOLD, 14));
		cashbalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cashbalance.setBounds(426, 145, 172, 25);
		contentPane.add(cashbalance);
		
		JButton changepin = new JButton("CHANGE PIN");
		changepin.setBackground(new Color(169, 169, 169));
		changepin.setFont(new Font("Simplified Arabic", Font.BOLD, 14));
		changepin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		changepin.setBounds(426, 210, 172, 25);
		contentPane.add(changepin);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(32, 57, 97, 25);
		contentPane.add(btnNewButton);
	}
}
