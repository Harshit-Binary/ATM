package mainatm;
import java.io.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Userlogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	double balance;
	private JTextField accField;
	private JPasswordField passField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userlogin frame = new Userlogin();
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
	public Userlogin() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 768, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Back");
		button.setBounds(258, 322, 77, 33);
		button.setForeground(new Color(0, 0, 0));
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		button.setBackground(new Color(240, 255, 240));
		contentPane.add(button);
		
		JButton button_1 = new JButton("Login");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 String acc = new String(accField.getText());
				 String pi = new String(passField.getPassword());
				try
				{	
					final String mfile="account details.txt";
					File objfile=new File(mfile);
					

							FileReader objFR=new FileReader(objfile.getAbsoluteFile());
							BufferedReader objBR=new BufferedReader(objFR);
							String line=objBR.readLine();
							while(line!=null)
							{
								String acc_no="M".concat(acc);
								Pattern patt = Pattern.compile(acc_no);
								Matcher m = patt.matcher(line);
								String pin="P".concat(pi);
								Pattern patt1 = Pattern.compile(pin);
								Matcher m1 = patt1.matcher(line);
								if(m.find()&&m1.find())
								{
							
									String bal=line.substring(line.lastIndexOf("B")+1);
									 balance = Double.parseDouble(bal);
									 String name=line.substring((line.lastIndexOf("N")+1),line.lastIndexOf("B"));
									 File passfile=new File("login.txt");
									 try {
										 BufferedWriter bw=new BufferedWriter(new FileWriter(passfile.getAbsoluteFile(),true));
										 bw.write(acc_no+"\tP"+pi+"\tN"+name+"B"+balance);
										 bw.close();
									 }
									 catch(Exception e)
									 {
										 e.printStackTrace();
									 }
									 
									close();
								/*	Withdraw wt=new Withdraw();
									wt.Withdraw(acc_no,pin,balance);
									BalanceEnquiry be=new BalanceEnquiry();
									be.BalanceEnquiry(acc_no,pin,bal);
									*/
									Services ser=new Services();
									ser.setVisible(true);
								}
								
							
									line=objBR.readLine();
							}
							objBR.close();
				}
				catch (IOException Ex)
				{
					System.out.println("Exception : " + Ex.toString());
				}
				JOptionPane.showMessageDialog(null,"Welcome User","User Authentication", 1);
				
				
			}
		});
		button_1.setBounds(455, 323, 85, 33);
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_1.setBackground(new Color(240, 255, 240));
		contentPane.add(button_1);
		
		JLabel label_2 = new JLabel("Login id :-");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setBounds(296, 204, 69, 14);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(label_2);
		
		accField = new JTextField();
		accField.setBounds(296, 227, 199, 20);
		accField.setForeground(Color.BLACK);
		accField.setColumns(5);
		accField.setBackground(new Color(240, 255, 240));
		contentPane.add(accField);
		
		JLabel label_3 = new JLabel("Password :-");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setBounds(290, 260, 93, 14);
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(label_3);
		
		passField = new JPasswordField();
		passField.setBounds(290, 287, 199, 20);
		passField.setForeground(Color.WHITE);
		passField.setEchoChar('$');
		passField.setBackground(new Color(240, 255, 240));
		contentPane.add(passField);
		
		JLabel label_4 = new JLabel("USER LOGIN");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setBounds(338, 163, 136, 16);
		label_4.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 18));
		label_4.setBackground(Color.GRAY);
		contentPane.add(label_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 758, 126);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(197, 59, 0, 0);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(202, 59, 0, 0);
		panel.add(label_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 12, 257, 108);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(467, 59, 51, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(520, 59, 0, 0);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(525, 52, 46, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(616, 142, 0, 0);
		panel.add(label_8);
		
		JLabel lblGfh = new JLabel("gfh");
		lblGfh.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		lblGfh.setBounds(202, 27, 546, 64);
		panel.add(lblGfh);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\hh.jpg"));
		label_10.setBounds(243, 126, 313, 279);
		contentPane.add(label_10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\yy.jpg"));
		lblNewLabel_1.setBounds(0, 120, 758, 299);
		contentPane.add(lblNewLabel_1);
	}
}
