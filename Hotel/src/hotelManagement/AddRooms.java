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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class AddRooms {

	private JFrame frmHotelmanagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	  Connection conn;
	    PreparedStatement ps;
	    ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRooms window = new AddRooms();
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
	public AddRooms() {
		initialize();
		conn=sqlcoonection.making();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelmanagement = new JFrame();
		frmHotelmanagement.setTitle("HotelManagement");
		frmHotelmanagement.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\imagesandicons\\hotel.jpg"));
		frmHotelmanagement.getContentPane().setBackground(Color.WHITE);
		frmHotelmanagement.setBounds(400, 100, 1033, 748);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelmanagement.getContentPane().setLayout(null);
		frmHotelmanagement.setVisible(true);
		JLabel lblRoomNo = new JLabel("Room No");
		lblRoomNo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblRoomNo.setBounds(149, 187, 127, 30);
		frmHotelmanagement.getContentPane().add(lblRoomNo);
		
		JLabel lblCharge = new JLabel("Charge");
		lblCharge.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblCharge.setBounds(149, 273, 127, 30);
		frmHotelmanagement.getContentPane().add(lblCharge);
		
		JLabel lblBed = new JLabel("Bed");
		lblBed.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblBed.setBounds(149, 363, 127, 30);
		frmHotelmanagement.getContentPane().add(lblBed);
		
		JLabel lblStaus = new JLabel("Staus");
		lblStaus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblStaus.setBounds(149, 424, 127, 30);
		frmHotelmanagement.getContentPane().add(lblStaus);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField.setColumns(10);
		textField.setBounds(317, 195, 140, 30);
		frmHotelmanagement.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(317, 273, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(317, 347, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(317, 424, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\imagesandicons\\pexels-photo-2467285.jpeg"));
		label.setBounds(592, 125, 399, 481);
		frmHotelmanagement.getContentPane().add(label);
		
		JLabel lblHotelDelLuna = new JLabel("Hotel Del Luna Best Place Ever");
		lblHotelDelLuna.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblHotelDelLuna.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelDelLuna.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 34));
		lblHotelDelLuna.setBounds(206, 33, 636, 123);
		frmHotelmanagement.getContentPane().add(lblHotelDelLuna);
		
		JButton button = new JButton("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="insert into Rooms (no,bed,charge,status,ava) values(?,?,?,?,?)";
				System.out.println("Abid1");
				try {
					ps=conn.prepareStatement(sql);
				ps.setString(1, textField.getText());
				ps.setString(2, textField_2.getText());
				ps.setString(3, textField_1.getText());
				ps.setString(4, textField_3.getText());
				ps.setString(5, "Yes");
				//ps.setString(5, textField_5.getText());
				ps.execute();
				JOptionPane.showMessageDialog(null,"Room Has Been Added Successfully");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				//rs.close();
				ps.close();
		}catch(Exception ae) {
			JOptionPane.showMessageDialog(null,"Ok");
		}
		}
			}
		);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		button.setBackground(Color.BLACK);
		button.setBounds(195, 543, 97, 25);
		frmHotelmanagement.getContentPane().add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(328, 543, 113, 25);
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
		btnBack.setBounds(465, 543, 113, 25);
		frmHotelmanagement.getContentPane().add(btnBack);
		
		JLabel label_1 = new JLabel("Hotel Del Luna");
		label_1.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label_1.setBounds(682, 609, 290, 92);
		frmHotelmanagement.getContentPane().add(label_1);
	}

}
