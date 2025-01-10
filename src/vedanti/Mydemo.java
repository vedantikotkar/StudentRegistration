package vedanti;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Mydemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAddr;
	private JTextField txtMob;
	private JTextField txtemail;
	private JTextField txtp;
	private JTextField txtdr;
	private JTextField txtpd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mydemo frame = new Mydemo();
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
	public Mydemo() {
		setBackground(new Color(64, 0, 128));
		setFont(new Font("Dialog", Font.PLAIN, ११));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\vedanti kotkar\\Downloads\\ing.png"));
		setTitle("Student Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, ११));
		lblNewLabel.setBounds(147, 0, 127, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name");
		lblNewLabel_1.setBounds(10, 39, 127, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Address");
		lblNewLabel_2.setBounds(10, 72, 127, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Mobile No");
		lblNewLabel_3.setBounds(10, 101, 111, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Email");
		lblNewLabel_4.setBounds(10, 127, 94, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Enter prevoius year's degree");
		lblNewLabel_5.setBounds(10, 155, 192, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Enter percentage");
		lblNewLabel_6.setBounds(10, 180, 143, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Enter degree of your registration");
		lblNewLabel_7.setBounds(10, 205, 192, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton btn = new JButton("Submit");
		btn.setBackground(new Color(230, 230, 250)); 
		btn.setFont(new Font("Tahoma", Font.BOLD, ११));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String msg=txtName.getText()+"\n Your Details are:\n";
				msg+="Address:"+txtAddr.getText()+"\n";
				msg+="Mobile No:"+txtMob.getText()+"\n";
				msg+="Email :"+txtemail.getText()+"\n";
				msg+=" Your Previous year's degree is :"+txtpd.getText()+"\n";
				msg+=" Your Percentage are :"+txtp.getText()+"\n";
				msg+="Your Registration degree is :"+txtdr.getText()+"\n";
				JOptionPane.showMessageDialog(btn,msg);
			}
		});
		btn.setBounds(15, 238, 89, 23);
		contentPane.add(btn);
		txtName = new JTextField();
		txtName.setBackground(new Color(230, 230, 250)); 
		txtName.setBounds(212, 36, 149, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAddr = new JTextField();
		txtAddr.setBackground(new Color(230, 230, 250)); 
		txtAddr.setBounds(212, 69, 149, 20);
		contentPane.add(txtAddr);
		txtAddr.setColumns(10);
		
		txtMob = new JTextField();
		txtMob.setBackground(new Color(230, 230, 250)); 
		txtMob.setBounds(212, 98, 149, 20);
		contentPane.add(txtMob);
		txtMob.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setBackground(new Color(230, 230, 250)); 
		txtemail.setBounds(212, 124, 149, 20);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
	    txtpd = new JTextField();
	    txtpd.setBackground(new Color(230, 230, 250)); 
		txtpd.setBounds(212, 152, 149, 20);
		contentPane.add(txtpd);
		txtpd.setColumns(10);
		
		txtp = new JTextField();
		txtp.setBackground(new Color(230, 230, 250)); 
		txtp.setBounds(212, 177, 149, 20);
		contentPane.add(txtp);
		txtp.setColumns(10);
		
		txtdr = new JTextField();
		txtdr.setBackground(new Color(230, 230, 250)); 
		txtdr.setBounds(212, 202, 149, 20);
		contentPane.add(txtdr);
		txtdr.setColumns(10);
		
		JButton btn2 = new JButton("Reset");
		btn2.setBackground(new Color(230, 230, 250)); 
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				txtName.setText("");
				txtAddr.setText("");
				txtMob.setText("");
				txtemail.setText("");
				txtpd.setText("");
				txtp.setText("");
				txtdr.setText("");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, ११));
		btn2.setBounds(236, 238, 89, 23);
		contentPane.add(btn2);
	}
}
