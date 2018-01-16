package mainatm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Viewdata extends JFrame {

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
					Viewdata frame = new Viewdata();
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
	public Viewdata() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 729, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDetailsOfUser = new JLabel("Details of User");
		lblDetailsOfUser.setForeground(new Color(255, 255, 255));
		lblDetailsOfUser.setFont(new Font("Simplified Arabic", Font.BOLD, 17));
		lblDetailsOfUser.setBounds(291, 121, 154, 16);
		contentPane.add(lblDetailsOfUser);
		
		JTextArea showtextArea = new JTextArea();
		showtextArea.setBackground(Color.LIGHT_GRAY);
		showtextArea.setForeground(Color.BLACK);
		showtextArea.setBounds(35, 148, 630, 210);
		contentPane.add(showtextArea);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				close();
				Managerwork frame = new Managerwork();
				frame.setVisible(true);
				
				
			}
		});
		btnBack.setBounds(51, 380, 97, 25);
		contentPane.add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(-50, 0, 763, 114);
		contentPane.add(panel);
		
		JLabel label = new JLabel("");
		label.setBounds(356, 12, 0, 0);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(361, 12, 0, 0);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(366, 5, 46, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(417, 12, 0, 0);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		label_4.setBounds(53, 0, 207, 115);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		label_5.setBounds(283, 25, 470, 51);
		panel.add(label_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 110, 713, 319);
		contentPane.add(panel_1);
		
		final String mfile="account details.txt";
		File objfile=new File(mfile);
		
		try
		{
			FileReader objFR=new FileReader(objfile.getAbsoluteFile());
			BufferedReader objBR=new BufferedReader(objFR);
			String line=objBR.readLine();
			while(line!=null)
			{
				showtextArea.append(line);
				showtextArea.setEditable(false);
				line=objBR.readLine();
			}
			
			objBR.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
