package mainatm;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Pinchange extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField newtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pinchange frame = new Pinchange();
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
	public Pinchange() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 744, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheNew = new JLabel("Enter The New Pin");
		lblEnterTheNew.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnterTheNew.setForeground(new Color(255, 255, 255));
		lblEnterTheNew.setBounds(304, 213, 171, 27);
		contentPane.add(lblEnterTheNew);
		
		newtextField = new JTextField();
		newtextField.setBounds(304, 258, 116, 20);
		contentPane.add(newtextField);
		newtextField.setColumns(10);
		
		JButton btnChange = new JButton("Change");
		btnChange.setBounds(416, 338, 89, 23);
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				String newpin=new String(newtextField.getText());
				File newpinfile=new File("newpinfile.txt");
				if(newpin.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please fill new pin ","User Authentication", 1);
				}
				else
				{
					
					try
					{
						FileWriter fw = new FileWriter(newpinfile.getAbsoluteFile(),true);
						//instnace (object) of BufferedReader with respect of FileWriter
						BufferedWriter bw = new BufferedWriter(fw);
						
						bw.write("P"+newpin);
						
						bw.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
					
					
					
					File f12=new File("login.txt");
					final String r1="account details.txt";
					//final String r2="account details1.txt";
					File f=new File("temp.txt");
					File r=new File(r1);
					//File r3=new File(r2);
					//File creditfile=new File("credit.txt");
				 try
				 { 
					 BufferedReader brl = new BufferedReader(new FileReader(f12));
					 String li=brl.readLine();
					 String acc=li.substring((li.lastIndexOf("M")),li.lastIndexOf("P"));
					 String pi=li.substring((li.lastIndexOf("P")),li.lastIndexOf("N"));
					 BufferedReader brwl = new BufferedReader(new FileReader(newpinfile));
					 String lin=brwl.readLine();
					 String newp=lin;
					// String newpi="".concat(newp);
					// String ac="M".concat(acc);
					// String p="P".concat(pi);
					 //String bal="B".concat(balance);
					 
					 FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
					 BufferedWriter bw = new BufferedWriter(fw);
					 BufferedReader br = new BufferedReader(new FileReader(r));
					 String line=br.readLine();
					 
					
					 Pattern patt = Pattern.compile(acc);
					 Pattern patt1 = Pattern.compile(pi);
					 
				
					 while(line !=null)
					    {
					    	//System.out.println(line);
					    	Matcher m = patt.matcher(line);
					    	Matcher m1 = patt1.matcher(line);
					    	//Matcher m2 = patt2.matcher(line);

				    		
					    	if(m.find()&&m1.find())
					    	{
					    		String name=line.substring((line.lastIndexOf("N")),line.lastIndexOf("B"));
					    		String balance=line.substring((line.lastIndexOf("B")));
					    		
					    		bw.write(acc+""+newp+"\t"+name+""+balance);
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
					
					
					
					
					
					
					
				 File loginfile=new File("login.txt");
				 loginfile.delete();
			
				 newpinfile=new File("newpinfile.txt");
					newpinfile.delete();
					
					
					
					
					
					
					
					
					
					
					
				}
			}
		});
		contentPane.add(btnChange);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(258, 338, 89, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				close();
				Services s=new Services();
				s.setVisible(true);
			}
		});
		contentPane.add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 728, 134);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		label_4.setBounds(0, -2, 209, 116);
		panel.add(label_4);
		
		JLabel label = new JLabel("");
		label.setBounds(384, 12, 0, 0);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(389, 12, 0, 0);
		panel.add(label_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(394, 12, 0, 0);
		panel.add(label_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		lblNewLabel.setBounds(205, 24, 513, 51);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\hh.jpg"));
		lblNewLabel_1.setBounds(248, 125, 273, 303);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\yy.jpg"));
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(0, 125, 728, 303);
		contentPane.add(lblNewLabel_2);
	}
}
