package hotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class UpdateRoom {

	private JFrame frmHotelmanagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
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
					UpdateRoom window = new UpdateRoom();
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
	public UpdateRoom() {
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
		frmHotelmanagement.setBounds(400, 100, 1289, 762);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelmanagement.getContentPane().setLayout(null);
		frmHotelmanagement.setVisible(true);
		JLabel label = new JLabel("Room No");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label.setBounds(148, 168, 140, 40);
		frmHotelmanagement.getContentPane().add(label);
		
		JLabel lblBed = new JLabel("Bed");
		lblBed.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblBed.setBounds(148, 249, 140, 40);
		frmHotelmanagement.getContentPane().add(lblBed);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblStatus.setBounds(148, 427, 140, 40);
		frmHotelmanagement.getContentPane().add(lblStatus);
		
		JLabel lblAvailabilty = new JLabel("Availabilty");
		lblAvailabilty.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblAvailabilty.setBounds(133, 511, 140, 40);
		frmHotelmanagement.getContentPane().add(lblAvailabilty);
		
		JLabel lblCharge = new JLabel("Charge");
		lblCharge.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblCharge.setBounds(148, 337, 140, 40);
		frmHotelmanagement.getContentPane().add(lblCharge);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField.setColumns(10);
		textField.setBounds(355, 168, 140, 30);
		frmHotelmanagement.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(355, 263, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(355, 347, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(355, 433, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_4.setColumns(10);
		textField_4.setBounds(355, 517, 140, 30);
		frmHotelmanagement.getContentPane().add(textField_4);
		
		JButton button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="SELECT * FROM Rooms where no=?";
				try {
					ps=conn.prepareStatement(sql);
					ps.setString(1, textField.getText());
					
					rs=ps.executeQuery();
				
			if(rs.next())
			{
				String add1=rs.getString("bed");
				textField_1.setText(add1);
				String add2=rs.getString("charge");
				textField_2.setText(add2);
				String add3=rs.getString("status");
				textField_3.setText(add3);
				String add4=rs.getString("ava");
				textField_4.setText(add4);
			}
				else
				{
					JOptionPane.showMessageDialog(null,"Incorrect pin/user name");
				}
				
				}
				catch(Exception ae){
					JOptionPane.showMessageDialog(null,ae);
					
				}
				finally {
					try {
						rs.close();
						ps.close();
						}
				
				catch(Exception ae){
					//JOptionPane.showMessageDialog(null,"Sorry For Inconviniecne ,We will look towards it immediately");
					
				}
				
			}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		button.setBackground(Color.BLACK);
		button.setBounds(486, 225, 160, 25);
		frmHotelmanagement.getContentPane().add(button);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String add1=textField.getText();
				String add2=textField_1.getText();
				String add3=textField_2.getText();
				String add4=textField_3.getText();
				String add5=textField_4.getText();
			//	String add6=textField_29.getText();
				String sql="update Rooms set bed='"+add1+"',charge='"+add2+"',status='"+add3+"',ava='"+add4+"' where no='"+add5+"'";
					try {
						ps=conn.prepareStatement(sql);
						ps.execute();
						JOptionPane.showMessageDialog(null,"Room Updated");
						
						}catch(Exception ae)
					{
							JOptionPane.showMessageDialog(null,ae);
							
					}
			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnSave.setBackground(Color.BLACK);
		btnSave.setBounds(441, 586, 160, 25);
		frmHotelmanagement.getContentPane().add(btnSave);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				Reception rc=new Reception();
				
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(617, 586, 160, 25);
		frmHotelmanagement.getContentPane().add(btnBack);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnCancel.setBackground(Color.BLACK);
		btnCancel.setBounds(801, 586, 160, 25);
		frmHotelmanagement.getContentPane().add(btnCancel);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("F:\\imagesandicons\\pexels-photo-2659629.jpeg"));
		label_1.setBounds(812, 101, 399, 464);
		frmHotelmanagement.getContentPane().add(label_1);
		
		JLabel lblWeAreHere = new JLabel("We Are Here To Please You As Much As We Casn");
		lblWeAreHere.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblWeAreHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeAreHere.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblWeAreHere.setBounds(168, 13, 955, 71);
		frmHotelmanagement.getContentPane().add(lblWeAreHere);
		
		JLabel label_2 = new JLabel("Hotel Del Luna");
		label_2.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label_2.setBounds(891, 623, 290, 92);
		frmHotelmanagement.getContentPane().add(label_2);
	}

}
