package mainatm;
import java.io.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Confiemwithdraw extends JFrame {

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
					Confiemwithdraw frame = new Confiemwithdraw();
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
	public Confiemwithdraw() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 742, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYouAreShure = new JLabel("You Are Shure To Be Withdraw");
		lblYouAreShure.setForeground(new Color(255, 255, 255));
		lblYouAreShure.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 19));
		lblYouAreShure.setBounds(214, 160, 316, 32);
		contentPane.add(lblYouAreShure);
		
		JLabel balancelabel = new JLabel("");
		balancelabel.setForeground(new Color(255, 255, 255));
		balancelabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		balancelabel.setBounds(322, 229, 150, 42);
		contentPane.add(balancelabel);
		File withfile=new File("withdrawbal.txt");
		try 
		{
			
			BufferedReader br=new BufferedReader(new FileReader(withfile));
			String line = br.readLine();
			balancelabel.setText(line);
			br.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				File withfile=new File("withdrawbal.txt");
				withfile.delete();
				close();
				Services sr=new Services();
				sr.setVisible(true);
			}
		});
		btnNo.setBounds(429, 296, 89, 23);
		contentPane.add(btnNo);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//withdraw perform--------------------------------
				
				
				File f12=new File("login.txt");
				final String r1="account details.txt";
				//final String r2="account details1.txt";
				File f=new File("temp.txt");
				File r=new File(r1);
				//File r3=new File(r2);
				File creditfile=new File("credit.txt");
			 try
			 { 
				 BufferedReader brl = new BufferedReader(new FileReader(f12));
				 String li=brl.readLine();
				 String acc=li.substring((li.lastIndexOf("M")),li.lastIndexOf("P"));
				 String pi=li.substring((li.lastIndexOf("P")),li.lastIndexOf("N"));
				 BufferedReader brwl = new BufferedReader(new FileReader(creditfile));
				 String lin=brwl.readLine();
				 String balance=lin;
				// String ac="M".concat(acc);
				// String p="P".concat(pi);
				 //String bal="B".concat(balance);
				 
				 FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
				 BufferedWriter bw = new BufferedWriter(fw);
				 BufferedReader br = new BufferedReader(new FileReader(r));
				 String line=br.readLine();
				 
				// FileWriter fw1 = new FileWriter(file.getAbsoluteFile(),true);
				// BufferedWriter bw1 = new BufferedWriter(fw1);*/
				// BufferedReader br1 = new BufferedReader(new FileReader(r3));
				// String line1=br1.readLine();
				 Pattern patt = Pattern.compile(acc);
				 Pattern patt1 = Pattern.compile(pi);
				 
				 //String bal=Double.toString(balance);
			//	Pattern patt2 = Pattern.compile(bal);
			//	 System.out.println(acc);
			//	 System.out.println(pi);
				 while(line !=null)
				    {
				    	//System.out.println(line);
				    	Matcher m = patt.matcher(line);
				    	Matcher m1 = patt1.matcher(line);
				    	//Matcher m2 = patt2.matcher(line);

			    		
				    	if(m.find()&&m1.find())
				    	{
				    		String name=line.substring((line.lastIndexOf("N")+1),line.lastIndexOf("B"));
				    		
				    		bw.write(acc+"\t"+pi+"\tN"+name+"\tB"+balance+"\n");
				    		bw.newLine();
				    	}
				    	else
				    	{
				    		bw.write(line+"\n");
				    		bw.newLine();
				    		
				    	}
				    	line=br.readLine();
				    	
				    }   
		 

		
			br.close();
			bw.close();
			//br1.close();
			brwl.close();
			brl.close();
			
			 }
			 catch(Exception e)
		     {
		        	e.printStackTrace();
		     }
			finally
			{
				
    				try
    				{
    					r.delete();
        				f.renameTo(r);
        				close();
        				BUCKS_BANK_ATM window = new BUCKS_BANK_ATM();
    					window.frmWelcomeToAutomated.setVisible(true);
        				}
    				catch(Exception e)
    				{
    					e.printStackTrace();	
    				}	 
        		
			}
			 JOptionPane.showMessageDialog(null,"Please Collect Your Money","User Authentication", 1);
				
				
				
				
				
				
			 File loginfile=new File("login.txt");
			 loginfile.delete();
				File withfile=new File("withdrawbal.txt");
				withfile.delete();
				 creditfile=new File("credit.txt");
				creditfile.delete();
			}
		});
		btnYes.setBounds(262, 296, 89, 23);
		contentPane.add(btnYes);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 726, 125);
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
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(317, 12, 0, 0);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(322, 12, 0, 0);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(231, 23, 485, 62);
		label_5.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		panel.add(label_5);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		lblNewLabel_3.setBounds(10, 12, 188, 113);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		lblNewLabel.setBounds(0, 0, 173, 131);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\hh.jpg"));
		lblNewLabel_1.setBounds(214, 135, 316, 251);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\yy.jpg"));
		lblNewLabel_2.setBounds(0, 123, 726, 274);
		contentPane.add(lblNewLabel_2);
	}

}
