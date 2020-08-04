package hotelManagement;

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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class AddDrivers {

	private JFrame frmHotelmanagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	 Connection conn;
	    PreparedStatement ps;
	    ResultSet rs;
	    private JTextField textField_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDrivers window = new AddDrivers();
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
	public AddDrivers() {
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
		frmHotelmanagement.setBounds(400, 100, 995, 777);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelmanagement.getContentPane().setLayout(null);
		frmHotelmanagement.setVisible(true);;
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblName.setBounds(134, 168, 127, 30);
		frmHotelmanagement.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblAge.setBounds(134, 242, 127, 30);
		frmHotelmanagement.getContentPane().add(lblAge);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblSalary.setBounds(134, 323, 127, 30);
		frmHotelmanagement.getContentPane().add(lblSalary);
		
		JLabel lblDied = new JLabel("Died");
		lblDied.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblDied.setBounds(134, 400, 127, 30);
		frmHotelmanagement.getContentPane().add(lblDied);
		
		JLabel lblCarno = new JLabel("CarNo");
		lblCarno.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblCarno.setBounds(134, 468, 127, 30);
		frmHotelmanagement.getContentPane().add(lblCarno);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField.setColumns(10);
		textField.setBounds(273, 168, 140, 30);
		frmHotelmanagement.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(273, 242, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(273, 323, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(273, 400, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_4.setColumns(10);
		textField_4.setBounds(273, 468, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\imagesandicons\\pexels-photo-2935255.jpeg"));
		label.setBounds(519, 88, 363, 531);
		frmHotelmanagement.getContentPane().add(label);
		
		JLabel lblAPlaceBetween = new JLabel("We Take You Where You Coudn't Go");
		lblAPlaceBetween.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblAPlaceBetween.setHorizontalAlignment(SwingConstants.CENTER);
		lblAPlaceBetween.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 34));
		lblAPlaceBetween.setBounds(149, 0, 700, 123);
		frmHotelmanagement.getContentPane().add(lblAPlaceBetween);
		
		JButton button = new JButton("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String sql="insert into Drivers (Name,Age,Salary,carno,Died,Phone) values(?,?,?,?,?,?)";
			System.out.println("Abid1");
			try {
				ps=conn.prepareStatement(sql);
			ps.setString(1, textField.getText());
			ps.setString(2, textField_1.getText());
			ps.setString(3, textField_2.getText());
			ps.setString(4, textField_4.getText());
			ps.setString(5, textField_3.getText());
			ps.setString(6, textField_5.getText());
			//ps.setString(5, textField_5.getText());
			ps.execute();
			JOptionPane.showMessageDialog(null,"Driver Has Been Added Successfully");
		//	rs.close();
			ps.close();
	}catch(Exception ae) {
		JOptionPane.showMessageDialog(null,ae);
	}
			
	}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		button.setBackground(Color.BLACK);
		button.setBounds(134, 595, 97, 25);
		frmHotelmanagement.getContentPane().add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(260, 595, 113, 25);
		frmHotelmanagement.getContentPane().add(button_1);
		
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
		btnBack.setBounds(394, 595, 113, 25);
		frmHotelmanagement.getContentPane().add(btnBack);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblPhone.setBounds(123, 525, 127, 30);
		frmHotelmanagement.getContentPane().add(lblPhone);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_5.setColumns(10);
		textField_5.setBounds(273, 525, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_5);
		
		JLabel label_1 = new JLabel("Hotel Del Luna");
		label_1.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label_1.setBounds(642, 638, 290, 92);
		frmHotelmanagement.getContentPane().add(label_1);
	}

}
