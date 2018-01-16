package mainatm;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
//import java.awt.Window.Type;
import javax.swing.SwingConstants;

public class Managerlogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idField;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JButton btnBack;
	private JLabel lblPleaseAuthenticateYourself;
	private JPasswordField passwordField;
	private JLabel both;
	private JButton btnReset;
	private JPanel panel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_4;
	private JLabel label_6;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Managerlogin frame = new Managerlogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void managerLogin()
	{			
        
  
        String manager_login_id="12345";
		String password = "54321";
		String str = new String(passwordField.getPassword());
        String str1 = new String(idField.getText());
        if(str1.isEmpty()) {
        	//both.setText("Please  Enter Manager ID");
        	JOptionPane.showMessageDialog(null,"Please  Enter Manager ID","Manager Authentication", 3);
        }
        else if(str.isEmpty()) {
        	//both.setText("Please  Enter Password");
        	JOptionPane.showMessageDialog(null,"Please  Enter Password","Manager Authentication", 3);
        }
        else if(manager_login_id.equals(str1) && password.equals(str))
        {
        		//both.setText("Authenticated ");
        	JOptionPane.showMessageDialog(null,"Login are Successfully","Manager Authentication", 1);
        		//Managerlogin man=new Managerlogin();
          	    //man.dispose();
        	close();
          	    Managerwork mw=new Managerwork(); 
              	mw.setVisible(true);
         }
           else
             // both.setText("Login Id OR Password is Wrong ");
        	   JOptionPane.showMessageDialog(null,"Login Id OR Password is Wrong ","Manager Authentication", 2);
        		idField.setText(null);
        		passwordField.setText(null);
    }  
	
	public void close()
	{
		WindowEvent winclose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
	}
	
	/**
	 * Create the frame.
	 */	
	public Managerlogin() {
		setType(Type.UTILITY);
		setBackground(Color.BLUE);
		setForeground(Color.YELLOW);
		setTitle("Welcome To Automated Teller Machine");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 783, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginId = new JLabel("Login id :-");
		lblLoginId.setBounds(313, 199, 69, 14);
		lblLoginId.setForeground(Color.WHITE);
		lblLoginId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblLoginId);
		
		idField = new JTextField();
		idField.setBounds(313, 230, 199, 20);
		idField.setBackground(Color.LIGHT_GRAY);
		idField.setForeground(new Color(0, 0, 0));
		contentPane.add(idField);
		idField.setColumns(5);
		
		lblPassword = new JLabel("Password :-");
		lblPassword.setBounds(313, 263, 79, 14);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(485, 338, 85, 33);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBackground(new Color(240, 255, 240));
		btnLogin.setHorizontalAlignment(SwingConstants.LEFT);
		btnLogin.setIcon(new ImageIcon("F:\\ATM\\mainatm\\img\\button.png"));
		btnLogin.setSelectedIcon(new ImageIcon("F:\\ATM\\mainatm\\img\\button.png"));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				managerLogin();
				idField.setText(null);
				passwordField.setText(null);
			}
		});
		contentPane.add(btnLogin);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(259, 337, 77, 33);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setBackground(new Color(245, 245, 245));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			//Managerlogin manl=new Managerlogin();
			//manl.dispose();
				close();
			BUCKS_BANK_ATM window = new BUCKS_BANK_ATM();
			window.frmWelcomeToAutomated.setVisible(true);
			}
		});
		contentPane.add(btnBack);
		
		lblPleaseAuthenticateYourself = new JLabel("MANAGER LOGIN");
		lblPleaseAuthenticateYourself.setBounds(331, 153, 186, 33);
		lblPleaseAuthenticateYourself.setForeground(Color.WHITE);
		lblPleaseAuthenticateYourself.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblPleaseAuthenticateYourself);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(313, 289, 199, 20);
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setEchoChar('$');
		contentPane.add(passwordField);
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(374, 338, 79, 33);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnReset.setForeground(new Color(0, 0, 0));
		btnReset.setBackground(new Color(240, 255, 240));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				idField.setText(null);
				passwordField.setText(null);
			}
		});
		contentPane.add(btnReset);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(0, 0, 56, 16);
		contentPane.add(label_3);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(0, 0, 56, 16);
		contentPane.add(label_5);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 765, 124);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		panel.setLayout(null);
		
		label = new JLabel("");
		label.setBounds(223, 59, 0, 0);
		panel.add(label);
		
		label_1 = new JLabel("");
		label_1.setBounds(228, 59, 0, 0);
		panel.add(label_1);
		
		label_4 = new JLabel("New label");
		label_4.setBounds(0, 5, 257, 108);
		panel.add(label_4);
		label_4.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\background.gif"));
		
		label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		label_2.setBounds(252, 40, 480, 57);
		panel.add(label_2);
		//Image img=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		
		both = new JLabel("");
		both.setBounds(546, 59, 0, 0);
		panel.add(both);
		
		label_6 = new JLabel("");
		label_6.setBounds(551, 59, 0, 0);
		panel.add(label_6);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(245, 31, 495, 72);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\text.gif"));
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(259, 135, 311, 260);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\hh.jpg"));
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 119, 765, 293);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HARSHIT AGARWAL\\Desktop\\yy.jpg"));
		contentPane.add(lblNewLabel);
	}
}
