package mainatm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Cashentry extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cashentry frame = new Cashentry();
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
	public Cashentry() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 774, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheCash = new JLabel("Enter The Cash in ATM");
		lblEnterTheCash.setForeground(new Color(255, 255, 255));
		lblEnterTheCash.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
		lblEnterTheCash.setBounds(304, 155, 221, 54);
		contentPane.add(lblEnterTheCash);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(299, 264, 239, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel labelamt = new JLabel("Amount :-");
		labelamt.setForeground(new Color(255, 255, 255));
		labelamt.setFont(new Font("Times New Roman", Font.BOLD, 19));
		labelamt.setBounds(300, 221, 110, 25);
		contentPane.add(labelamt);
		
		JButton btnSave = new JButton("\r\n");
		btnSave.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\151168120652964.png"));
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(224, 255, 255));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String d;
               
                	 d = new String(textField.getText());
                	if(d.isEmpty())
                		//warning.setText("Enter Amount please");
                		JOptionPane.showMessageDialog(null,"Enter the Amount Please","Manager Authentication", 3);
                	else
                	{
                		//warning.setText("Cash Added To ATM");
                		//sleep krwana hai
                		final String f1 = "Atm Balance.txt";
                		File objBal = new File(f1);
                		BufferedWriter br = null;
                		
                		try
                		{
                			if(!objBal.exists())
        					{
        						if(!objBal.createNewFile())
        						{
        							System.out.println("Error!! Contact:- 'Software Developer'.");
        							System.exit(0);
        						}
        					}
							FileWriter f12 = new FileWriter(objBal);
							br=new BufferedWriter(f12);
							br.write(d);
							br.close();
						}						
						catch(Exception e1q)
						{
							e1q.printStackTrace();
						}
					 finally {
						 
						 //picture lgani h right ki...................................................................!!!!!!!!!!!!!!!!!!!111
						 
						JOptionPane.showMessageDialog(null,"Cash are Added in ATM","Manager Authentication", 1);
	                	close();
	                	Managerwork mw=new Managerwork();
	                	mw.setVisible(true);            	
	                }
	               
                	}
			}
			
		});
		btnSave.setBounds(464, 339, 78, 43);
		contentPane.add(btnSave);
		
		JButton btnBack = new JButton("\r\n");
		btnBack.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\go-back-icon.png"));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				close();
				Managerwork frame = new Managerwork();
				frame.setVisible(true);
			}
		});
		btnBack.setBounds(263, 338, 78, 45);
		contentPane.add(btnBack);
		
		JLabel label = new JLabel("\r\n");
		label.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		label.setBounds(263, 17, 465, 49);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 1, 756, 114);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(348, 13, 0, 0);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(353, 13, 0, 0);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(358, 5, 55, 16);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(418, 13, 0, 0);
		panel.add(label_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		lblNewLabel_2.setBounds(6, 0, 234, 133);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\hh.jpg"));
		lblNewLabel.setBounds(244, 127, 314, 271);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\yy.jpg"));
		lblNewLabel_1.setBounds(0, 115, 756, 289);
		contentPane.add(lblNewLabel_1);
	}
}
