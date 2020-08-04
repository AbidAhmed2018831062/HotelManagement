package hotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class UpdateCustomer {

	int p=0,k=0,l=0,m=0,n=0;
	private JFrame frmHotelmanagement;
	private JTextField textField;
	private JTextField textField_1;
	 Connection conn;
	    PreparedStatement ps;
	    ResultSet rs;
	    private JTextField textField_2;
	    private JTextField textField_3;
	    private JTextField textField_4;
	/**
	 * Launch the application.
	 */
	    private void updateRoom()
	    {
	    	int hjk=Integer.parseInt(textField_4.getText());
	    	hjk=hjk-p;
	    	System.out.println(hjk);
	    	
	    	hjk*=n;
	    	System.out.println(hjk);
	    	
	    	l=l+hjk;
	    	System.out.println(l);
	    	
	    	String s1=""+l;
	    	System.out.println(s1);
	    	
	    	
	    	
	    	String sql="update Customers set rpay='"+s1+"' where Phone='"+textField.getText()+"'";
	    	
		
			try {
				ps=conn.prepareStatement(sql);
				ps.execute();
				JOptionPane.showMessageDialog(null,"Updated Successfully");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			//	textField_5.setText("");
				}catch(Exception ae) {
					JOptionPane.showMessageDialog(null,ae);
			}
	    }
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateCustomer window = new UpdateCustomer();
					window.frmHotelmanagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public UpdateCustomer() {
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
		
		JLabel lblNewLabel = new JLabel("Thank You For Giving Us The Opportunity To Serve You");
		lblNewLabel.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(189, 31, 955, 71);
		frmHotelmanagement.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("May You Have A Better After Life");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label.setBounds(425, 93, 567, 71);
		frmHotelmanagement.getContentPane().add(label);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblPhoneNo.setBounds(170, 235, 140, 40);
		frmHotelmanagement.getContentPane().add(lblPhoneNo);
		
		JLabel lblRemainingPayment = new JLabel("Remaining Payment");
		lblRemainingPayment.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblRemainingPayment.setBounds(96, 576, 262, 40);
		frmHotelmanagement.getContentPane().add(lblRemainingPayment);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField.setColumns(10);
		textField.setBounds(384, 241, 233, 30);
		frmHotelmanagement.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(384, 338, 233, 30);
		frmHotelmanagement.getContentPane().add(textField_1);
		
		JButton button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="select * from Customers where Phone=?";
				try {
					ps=conn.prepareStatement(sql);
					ps.setString(1,textField.getText());
				//	ps.setString(2, textField_1.getText());
					rs=ps.executeQuery();
					if(rs.next())
					{
						String add1=rs.getString("rpay");
						textField_3.setText(add1);
						String add2=rs.getString("Name");
						textField_1.setText(add2);
						String add3=rs.getString("RNo");
						textField_2.setText(add3);
						String add4=rs.getString("days");
						textField_4.setText(add4);
						p=Integer.parseInt(add4);
						m=Integer.parseInt(add3);
						l=Integer.parseInt(add1);
						n=rs.getInt("perday");
						
					}
					rs.close();
					ps.close();
					
					}catch(Exception ae)
				{
					JOptionPane.showMessageDialog(null,"Wrong Phone Number");	
				}
				finally {
					try {
						ps.close();
						rs.close();
					
						//deleteRow();
					}catch(Exception ae)
					{
						JOptionPane.showMessageDialog(null,"Wrong Phone Number");	
					}
					
					
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		button.setBackground(Color.BLACK);
		button.setBounds(505, 284, 160, 25);
		frmHotelmanagement.getContentPane().add(button);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblName.setBounds(189, 332, 140, 40);
		frmHotelmanagement.getContentPane().add(lblName);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(384, 418, 233, 30);
		frmHotelmanagement.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(384, 582, 233, 30);
		frmHotelmanagement.getContentPane().add(textField_3);
		
		JLabel lblRoomNo = new JLabel("Room No");
		lblRoomNo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblRoomNo.setBounds(189, 418, 140, 40);
		frmHotelmanagement.getContentPane().add(lblRoomNo);
		
		JButton btnDeleteCustomer = new JButton("Update");
		btnDeleteCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateRoom();
			}
		});
		btnDeleteCustomer.setForeground(Color.WHITE);
		btnDeleteCustomer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnDeleteCustomer.setBackground(Color.BLACK);
		btnDeleteCustomer.setBounds(550, 646, 245, 25);
		frmHotelmanagement.getContentPane().add(btnDeleteCustomer);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("F:\\imagesandicons\\hotel-clerk-holding-thank-you-sign-room-73837669.jpg"));
		label_1.setBounds(832, 216, 399, 481);
		frmHotelmanagement.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Hotel Del Luna");
		label_2.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label_2.setBounds(941, 625, 290, 92);
		frmHotelmanagement.getContentPane().add(label_2);
		
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
		btnBack.setBounds(560, 698, 160, 25);
		frmHotelmanagement.getContentPane().add(btnBack);
		
		JLabel lblDays = new JLabel("Days");
		lblDays.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblDays.setBounds(189, 494, 140, 40);
		frmHotelmanagement.getContentPane().add(lblDays);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		textField_4.setColumns(10);
		textField_4.setBounds(384, 494, 233, 30);
		frmHotelmanagement.getContentPane().add(textField_4);
		frmHotelmanagement.setBounds(400, 100, 1309, 798);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
