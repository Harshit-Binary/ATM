package mainatm;
import java.io.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Services extends JFrame {

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
					Services frame = new Services();
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
	public Services() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 776, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblServices = new JLabel("SERVICES");
		lblServices.setBounds(355, 160, 141, 27);
		lblServices.setForeground(Color.WHITE);
		lblServices.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblServices);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setBounds(347, 204, 136, 23);
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				close();
				Withdraw wt=new Withdraw();
				wt.setVisible(true);
			}
		});
		contentPane.add(btnWithdraw);
		
		JButton btnBalanceEnquiary = new JButton("Balance Enquiary");
		btnBalanceEnquiary.setBounds(347, 291, 136, 23);
		btnBalanceEnquiary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				close();
				
				BalanceEnquiry be=new BalanceEnquiry();
				be.setVisible(true);
			}
		});
		contentPane.add(btnBalanceEnquiary);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setBounds(347, 336, 136, 25);
		contentPane.add(btnLogout);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 758, 115);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("");
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		panel.add(label_2);
		
		JLabel label_5 = new JLabel("New label");
		panel.add(label_5);
		label_5.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		
		JLabel label = new JLabel("");
		panel.add(label);
		label.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		
		JLabel label_3 = new JLabel("New label");
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		panel.add(label_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(256, 127, 303, 262);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\hh.jpg"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 115, 758, 287);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\yy.jpg"));
		contentPane.add(lblNewLabel_1);
		
		JLabel username = new JLabel("");
		username.setBounds(10, 235, 236, 46);
		username.setFont(new Font("Simplified Arabic Fixed", Font.BOLD, 16));
		contentPane.add(username);
		
		File login=new File("login.txt");
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(login));
			String line = br.readLine();
			String name=line.substring((line.lastIndexOf("N")+1),line.lastIndexOf("B"));
			username.setText("Welcome "+name);
			
			JButton btnChangePin = new JButton("Change Pin");
			btnChangePin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					close();
					Pinchange frame = new Pinchange();
					frame.setVisible(true);
					
					
				}
			});
			btnChangePin.setBounds(347, 238, 136, 23);
			contentPane.add(btnChangePin);
			br.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
