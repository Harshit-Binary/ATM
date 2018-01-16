package mainatm;
import java.io.*;
import java.util.regex.Pattern;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextArea;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class BalanceEnquiry extends JFrame {

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
					BalanceEnquiry frame = new BalanceEnquiry();
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
	public BalanceEnquiry() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 781, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel ballabel = new JLabel("");
		ballabel.setForeground(Color.WHITE);
		ballabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 21));
		ballabel.setBounds(294, 206, 194, 55);
		contentPane.add(ballabel);
		
		JLabel lblYourBalance = new JLabel("Your Balance");
		lblYourBalance.setForeground(Color.WHITE);
		lblYourBalance.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 19));
		lblYourBalance.setBounds(336, 150, 180, 55);
		contentPane.add(lblYourBalance);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				close();
				
				Services sr=new Services();
				sr.setVisible(true);
			}
		});
		btnBack.setBounds(310, 339, 162, 23);
		contentPane.add(btnBack);
		
		JButton btnCheckYourBalance = new JButton("Check Your Balance");
		btnCheckYourBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				File passfile = new File("login.txt");
				try
				{
					BufferedReader br=new BufferedReader(new FileReader(passfile));
					String line=br.readLine();
					String bal=line.substring(line.lastIndexOf("B")+1);
					ballabel.setText(bal);
					//Pattern patt=Pattern.compile(arg0)
					br.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
				
			}
		});
		btnCheckYourBalance.setBounds(310, 303, 162, 23);
		contentPane.add(btnCheckYourBalance);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		label.setBounds(294, 13, 470, 51);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, -1, 763, 114);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(356, 12, 0, 0);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(361, 12, 0, 0);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(366, 5, 46, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(417, 12, 0, 0);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(0, 0, 207, 115);
		panel.add(label_5);
		label_5.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\hh.jpg"));
		lblNewLabel.setBounds(224, 126, 321, 257);
		contentPane.add(lblNewLabel);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\yy.jpg"));
		label_6.setBounds(0, 111, 764, 285);
		contentPane.add(label_6);
		
		
	}


	
}
