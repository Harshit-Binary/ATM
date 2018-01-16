package mainatm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class Adduser extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField acctextField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adduser frame = new Adduser();
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
	public Adduser() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 749, 443);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheNew = new JLabel("Enter The New User Details");
		lblEnterTheNew.setBounds(227, 114, 246, 39);
		lblEnterTheNew.setForeground(new Color(255, 255, 255));
		lblEnterTheNew.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblEnterTheNew);
		
		JLabel lblAccountNumber = new JLabel("Account Number :-");
		lblAccountNumber.setBounds(227, 144, 137, 22);
		lblAccountNumber.setForeground(new Color(255, 255, 255));
		lblAccountNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblAccountNumber);
		
		acctextField = new JTextField();
		acctextField.setBounds(224, 177, 246, 20);
		contentPane.add(acctextField);
		acctextField.setColumns(10);
		
		JLabel lblPinNumber = new JLabel("Pin Number :-");
		lblPinNumber.setBounds(224, 204, 118, 29);
		lblPinNumber.setForeground(new Color(255, 255, 255));
		lblPinNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblPinNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(224, 232, 246, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblName = new JLabel("Name :-");
		lblName.setBounds(224, 263, 118, 14);
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(224, 288, 246, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblBalance = new JLabel("Balance :-");
		lblBalance.setBounds(224, 319, 128, 14);
		lblBalance.setForeground(new Color(255, 255, 255));
		lblBalance.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblBalance);
		
		textField_3 = new JTextField();
		textField_3.setBounds(224, 344, 246, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(234, 376, 89, 23);
		btnBack.setBackground(new Color(248, 248, 255));
		btnBack.setBorder(null);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
				Managerwork mw=new Managerwork();
				mw.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(btnBack);
		
		
		
		
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(382, 375, 89, 23);
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(240, 248, 255));
		btnSave.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
			//--------------------------------------------------------------------------------------	

			
						String acc_no=new String(acctextField.getText());
						String pin= new String(textField_1.getText());
						String name=new String(textField_2.getText());
						String bal=new String(textField_3.getText());
						
							for(int i=0;i<acc_no.length();i++)
							{
								if(!(Character.isDigit(acc_no.charAt(i))))
								{
									JOptionPane.showMessageDialog(null,"account no should contain only digits","Manager Authentication", 1);
									break;
								}
							}
						
						
						for(int i=0;i<pin.length();i++)
						{
							if(!(Character.isDigit(pin.charAt(i))))
							{
								JOptionPane.showMessageDialog(null,"PIN should contain only digits","Manager Authentication", 1);		
								break;
							}
						}
						
				
							for(int i=0;i<bal.length();i++)
							{
								if(!(Character.isDigit(bal.charAt(i))))
								{
									JOptionPane.showMessageDialog(null,"Balance should contain only digits","Manager Authentication", 1);		
									break;
								}
							}
							
							String acc="M".concat(acc_no);
							//String bals=Double.toString(bal);
							File objfile=new File("account details.txt");
						
							
						
						 if(acc_no.isEmpty()&&pin.isEmpty()&&name.isEmpty()&&bal.isEmpty())
							JOptionPane.showMessageDialog(null,"Please Fill User the All Details","Manager Authentication", 3);
						else if(acc_no.isEmpty()&&pin.isEmpty()&&name.isEmpty())
							JOptionPane.showMessageDialog(null,"Please Fill User Account Number,Pin Number and Name","Manager Authentication", 3);
						else if(acc_no.isEmpty()&&pin.isEmpty()&&bal.isEmpty())
							JOptionPane.showMessageDialog(null,"Please Fill User Account Number,Pin Number and Balance","Manager Authentication", 3);
						else if(acc_no.isEmpty()&&pin.isEmpty())
							JOptionPane.showMessageDialog(null,"Please Fill  User Account Number,Pin Number ","Manager Authentication", 3);
						else if(name.isEmpty()&&bal.isEmpty())
							JOptionPane.showMessageDialog(null,"Please Fill User Name,Balance ","Manager Authentication", 3);
						else if(name.isEmpty())
							JOptionPane.showMessageDialog(null,"Please Fill User Name ","Manager Authentication", 3);
						else if(pin.isEmpty())
							JOptionPane.showMessageDialog(null,"Please Fill Pin Number ","Manager Authentication", 3);
						else if(acc_no.isEmpty())
							JOptionPane.showMessageDialog(null,"Please Fill User Account Number ","Manager Authentication", 3);
						else if(acc_no.length()!=14)
						{
							JOptionPane.showMessageDialog(null,"the account no should be 14 digit long","Manager Authentication", 3);
						}
						
						else if(pin.length()!=4)
						{
							JOptionPane.showMessageDialog(null,"PIN should be 4 digit long","Manager Authentication", 3);
						
						}
						
						else if(bal.isEmpty())
							JOptionPane.showMessageDialog(null,"Please Fill User Balance ","Manager Authentication", 3);
						else 
						{
							//final String fileName="account details.txt";
							final String fileName1="account details1.txt";
							//File objfile=new File(fileName);
							File objfile1=new File(fileName1);
							try 
							{
								if(!objfile.exists())
								{
									if(!objfile.createNewFile())
									{
										System.out.println("Error!!! Contact :- 'Software Developer'.");
										System.exit(0);
									}
								}
								FileWriter objfileWriter = new FileWriter(objfile.getAbsoluteFile(),true);
								//instnace (object) of BufferedReader with respect of FileWriter
								BufferedWriter objBW = new BufferedWriter(objfileWriter);
								FileWriter objfileWriter1 = new FileWriter(objfile1.getAbsoluteFile(),true);
								//instnace (object) of BufferedReader with respect of FileWriter
								BufferedWriter objBW1 = new BufferedWriter(objfileWriter1);
								//write into file
								double bals = Double.parseDouble(bal);
								objBW.write("M"+acc_no+"\tP"+pin+"\tN"+name+"\tB"+bals+"\n");
								objBW1.write(acc_no+"\t"+pin+"\t"+name+"\t"+bals+"\n");
								objBW.newLine();
								objBW1.newLine();
								Toolkit.getDefaultToolkit().beep();
								
								objBW.close();
								objBW1.close();
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
							JOptionPane.showMessageDialog(null,"User Details are Updated ","Manager Authentication", 1);
							close();
							Managerwork ce=new Managerwork();
							ce.setVisible(true);
					}
						}
				//----------------------------------------------------------------------------------------
				
			
		});
		btnSave.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(btnSave);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 733, 125);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(256, 12, 0, 0);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(261, 12, 0, 0);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(266, 5, 46, 14);
		panel.add(label_2);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(317, 12, 0, 0);
		panel.add(label_4);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(322, 12, 0, 0);
		panel.add(label_3);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(238, 23, 485, 62);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 12, 190, 114);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(216, 124, 320, 295);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\hh.jpg"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 114, 733, 295);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\yy.jpg"));
		contentPane.add(lblNewLabel_1);
	}
}