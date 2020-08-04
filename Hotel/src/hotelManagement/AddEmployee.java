package hotelManagement;
import java.sql.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class AddEmployee {

	private JFrame frmHotelmanagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	JComboBox comboBox;
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    private JTextField textField_5;
	String s1[]= {"Bar Attender","Receptionist","Waiter","Guest Attender","Room Cleaner","Dry Cleaner"};
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee window = new AddEmployee();
					window.frmHotelmanagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddEmployee() {
		initialize();
		conn=sqlcoonection.making();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelmanagement = new JFrame();
		frmHotelmanagement.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\imagesandicons\\hotel.jpg"));
		frmHotelmanagement.setTitle("HotelManagement");
		frmHotelmanagement.getContentPane().setBackground(Color.WHITE);
		frmHotelmanagement.getContentPane().setLayout(null);
		frmHotelmanagement.setVisible(true);
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(73, 204, 127, 30);
		frmHotelmanagement.getContentPane().add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblAge.setBounds(73, 262, 127, 30);
		frmHotelmanagement.getContentPane().add(lblAge);
		
		JLabel lblJob = new JLabel("Job");
		lblJob.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblJob.setBounds(84, 327, 127, 30);
		frmHotelmanagement.getContentPane().add(lblJob);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblSalary.setBounds(84, 384, 127, 30);
		frmHotelmanagement.getContentPane().add(lblSalary);
		
		JLabel lblDied = new JLabel("Died");
		lblDied.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblDied.setBounds(84, 439, 127, 30);
		frmHotelmanagement.getContentPane().add(lblDied);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField.setBounds(228, 204, 140, 30);
		frmHotelmanagement.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(228, 262, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(228, 384, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_4.setColumns(10);
		textField_4.setBounds(228, 439, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\imagesandicons\\photo-1570581118391-7a6f30b69b16.jpg"));
		lblNewLabel_1.setBounds(414, 175, 304, 294);
		frmHotelmanagement.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\imagesandicons\\image4s.jpg"));
		label.setBounds(761, 175, 361, 294);
		frmHotelmanagement.getContentPane().add(label);
		
		JLabel lblDeathIsAlways = new JLabel("Death is always not the end.");
		lblDeathIsAlways.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblDeathIsAlways.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeathIsAlways.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblDeathIsAlways.setBounds(281, 48, 668, 83);
		frmHotelmanagement.getContentPane().add(lblDeathIsAlways);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="insert into Employee (Name,Age,Job,Salary,Died,Phone) values(?,?,?,?,?,?)";
				try {
					System.out.println("Abid1");
					ps=conn.prepareStatement(sql);
					System.out.println("Abid1");
					ps.setString(1, textField.getText());
					ps.setString(2, textField_1.getText());
					ps.setString(3, (String) comboBox.getSelectedItem());
					ps.setString(4, textField_3.getText());
					ps.setString(5, textField_4.getText());
					ps.setString(6, textField_5.getText());
					//ps.setString(5, textField_5.getText());
					ps.execute();
					JOptionPane.showMessageDialog(null,"Employee Has Been Added Successfully");
					textField.setText("");
					textField_1.setText("");
				//	textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
				//	rs.close();
					ps.close();
			}catch(Exception ae) {
				JOptionPane.showMessageDialog(null,ae);
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(191, 534, 97, 25);
		frmHotelmanagement.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			//	textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
			
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnCancel.setBackground(Color.BLACK);
		btnCancel.setBounds(321, 534, 113, 25);
		frmHotelmanagement.getContentPane().add(btnCancel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				HomePage hp=new HomePage();
				
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(466, 538, 113, 25);
		frmHotelmanagement.getContentPane().add(btnBack);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblPhone.setBounds(73, 491, 127, 30);
		frmHotelmanagement.getContentPane().add(lblPhone);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_5.setColumns(10);
		textField_5.setBounds(228, 491, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_5);
		
		JLabel label_1 = new JLabel("Hotel Del Luna");
		label_1.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label_1.setBounds(807, 606, 290, 92);
		frmHotelmanagement.getContentPane().add(label_1);
	
		comboBox = new JComboBox(s1);
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(223, 327, 145, 30);
		frmHotelmanagement.getContentPane().add(comboBox);
		frmHotelmanagement.setBounds(400, 100, 1152, 758);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
