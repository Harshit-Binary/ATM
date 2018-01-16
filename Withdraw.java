package mainatm;
import java.io.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Withdraw extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField baltextField;
	String acc_no,pin;
	double balance;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw frame = new Withdraw();
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

	
	

	 public int Denomination(int amt)
	    {
		   final String f1 = "Atm Balance.txt";

	        int r2000=0, r500=0, r100=0  ,count=0; 
	        double d=0;
	       // System.out.print("Enter The Amount in Rupees : \n\n");
	       // BufferedReader br1 =null;
     	File f = new File(f1);

	        String mon=null;
	        try {
	        BufferedReader br12 = new BufferedReader(new FileReader(f));
	        mon=br12.readLine();
	        d=Double.parseDouble(mon);
	        br12.close();
	        }
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }
	        if( amt%100 != 0)
	        	baltextField.setText(null);
	        	//System.out.println("Please Enter the amount in multiples of 100 !!! Try Again !!!");
	        else if(amt>d)
	        	baltextField.setText(null);
	        	//-------------atm mai jitna hai usse km hi nikal skte ho-----------------
	        	//System.out.println("ATM Out Of Cash.Please Inform The Manager");
	        else
	        {
	        	while(amt >= 2000) 
	        	{ 
	        		r2000 = amt / 2000 ; 
	        		amt = amt % 2000;
	        		//-------------------------------write perform in txt file and show the last time withdraw---------------
	        		//System.out.print("\nTotal Number Of 2000 Rupees Notes :"+ r2000) ;
	        		break ; 
	        	}
	        	while(amt >= 500) 
	        	{ 
	        		r500 = amt / 500 ; 
	        		amt = amt % 500;
	        		//System.out.print("\nTotal Number Of 500 Rupees Notes : "+ r500) ;
	        		break ; 
	        	} 
	        	while(amt >= 100) 
	        	{ 
	        		r100 = amt / 100 ; 
	        		amt = amt % 100;
	        		//System.out.print("\nTotal Number Of 100 Rupees Notes : "+ r100) ;
	        		break ; 
	        	} 
	        	
	        	count = r2000 + r500 + r100 ;   
			    //System.out.print("\n\nTotal Number Of Notes Require : "+ count) ; 
			    //System.out.println("\n\nPlease collect your money");
			    
	        }	
	        return count;
	       
	     
	    }
	
	/**
	 * Create the frame.
	 */
	public Withdraw() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 771, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheAmount = new JLabel("Enter The Amount To Be Withdraw");
		lblEnterTheAmount.setForeground(Color.WHITE);
		lblEnterTheAmount.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 19));
		lblEnterTheAmount.setBounds(235, 176, 299, 23);
		contentPane.add(lblEnterTheAmount);
		
		baltextField = new JTextField();
		baltextField.setBackground(Color.LIGHT_GRAY);
		baltextField.setBounds(282, 258, 224, 20);
		contentPane.add(baltextField);
		baltextField.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				close();
				Services sr = new Services();
				sr.setVisible(true);
			
			}
			
		});
		btnBack.setBounds(257, 334, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String origibal;
				double originalba = 0.0;
				double withdrawbal=new Double(baltextField.getText());
				String bals=Double.toString(withdrawbal);
				int bal=(int)withdrawbal;
				
				int i=Denomination(bal);
				
				File login=new File("login.txt");
				try
				{
					BufferedReader br=new BufferedReader(new FileReader(login));
					String line = br.readLine();
					origibal=line.substring(line.lastIndexOf("B")+1);
					originalba = Double.parseDouble(origibal);
					//int originalbal=(int)originalba;
					br.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				int originalbal=(int)originalba;
				if(bals.isEmpty())
				{
					baltextField.setText(null);
					//images.....................................
				}
				else if(withdrawbal > originalbal)
				{
					baltextField.setText(null);
					//image.........................................
				}
				else if(i==0)
				{
					baltextField.setText(null);
				}
				else
				{
					originalba=originalba-withdrawbal;
					File withfile=new File("withdrawbal.txt");
					File creditfile=new File("credit.txt");
					try 
					{
						String bas=Double.toString(originalba);
						String wbal=Double.toString(withdrawbal);
						BufferedWriter bw=new BufferedWriter(new FileWriter(creditfile.getAbsoluteFile(),true));
						BufferedWriter bww=new BufferedWriter(new FileWriter(withfile.getAbsoluteFile(),true));
						bw.write(bas);
						bww.write(wbal);
						bw.close();
						bww.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					close();
					Confiemwithdraw cw=new Confiemwithdraw();
					cw.setVisible(true);
					
				}
				
				
			}
		});
		btnConfirm.setBounds(445, 334, 89, 23);
		contentPane.add(btnConfirm);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		label.setBounds(257, 13, 470, 51);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 753, 127);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(351, 12, 0, 0);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(356, 12, 0, 0);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(361, 5, 46, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(412, 12, 0, 0);
		panel.add(label_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		lblNewLabel_2.setBounds(10, 5, 218, 122);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\hh.jpg"));
		lblNewLabel.setBounds(233, 139, 317, 259);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\yy.jpg"));
		lblNewLabel_1.setBounds(0, 110, 753, 301);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEnterTheAmount_1 = new JLabel("Enter the amount in multiple of 100");
		lblEnterTheAmount_1.setBounds(321, 198, 46, 14);
		contentPane.add(lblEnterTheAmount_1);
	}

}
