package mainatm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;
import java.awt.Window.Type;
import javax.swing.UIManager;

public class Widthdrawn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Widthdrawn frame = new Widthdrawn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Widthdrawn() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 438);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the amount you want to withdrawal");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBounds(177, 102, 431, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblHelloUser = new JLabel("Hello.. User");
		lblHelloUser.setForeground(new Color(0, 0, 0));
		lblHelloUser.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblHelloUser.setBounds(297, 60, 156, 27);
		contentPane.add(lblHelloUser);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(173, 216, 230), 2));
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
		textField.setBackground(new Color(240, 248, 255));
		textField.setBounds(256, 202, 241, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheAmount = new JLabel("Enter the amount in multiple of 100");
		lblEnterTheAmount.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblEnterTheAmount.setBounds(229, 150, 342, 16);
		contentPane.add(lblEnterTheAmount);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnContinue.setBackground(new Color(248, 248, 255));
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnContinue.setBounds(489, 288, 119, 25);
		contentPane.add(btnContinue);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setBackground(new Color(248, 248, 255));
		btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnBack.setBounds(177, 288, 110, 25);
		contentPane.add(btnBack);
		
		JLabel lblWelcomeToBucks = new JLabel("WELCOME TO BUCKS BANK ATM");
		lblWelcomeToBucks.setFont(new Font("Aharoni", Font.BOLD, 25));
		lblWelcomeToBucks.setBounds(190, 13, 418, 34);
		contentPane.add(lblWelcomeToBucks);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBackground(new Color(245, 245, 245));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\SoftBlue.jpg"));
		lblNewLabel_2.setBounds(0, 0, 735, 398);
		contentPane.add(lblNewLabel_2);
	}
}
