package aaa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test1 extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField passwordField;
	private JPasswordField pwdpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 frame = new Test1();
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
	public Test1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblNewLabel.setBounds(34, 27, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_1.setBounds(44, 52, 44, 15);
		contentPane.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBounds(112, 24, 190, 21);
		contentPane.add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 49, -11, 21);
		contentPane.add(passwordField);
		
		pwdpassword = new JPasswordField();
		pwdpassword.setBounds(112, 49, 190, 21);
		contentPane.add(pwdpassword);
		
		JButton btnNewButton = new JButton("\u91CD\u7F6E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username.setText(" ");
				pwdpassword.setText("");
				
			}
		});
		btnNewButton.setBounds(209, 80, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u767B\u5F55");
		btnNewButton_1.setMnemonic('f');
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = username.getText();
				char[] password = pwdpassword.getPassword();
				String p = new String(password);
				
				if(name.equals("xuegang")&&p.equals("123")){
					JOptionPane.showMessageDialog(null, "µÇÂ¼³É¹¦");
				}else{
					JOptionPane.showMessageDialog(null, "µÇÂ¼Ê§°Ü");
				}
			}
		});
		btnNewButton_1.setBounds(112, 80, 93, 23);
		contentPane.add(btnNewButton_1);
	}
}
