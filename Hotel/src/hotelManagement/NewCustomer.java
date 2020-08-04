package hotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class NewCustomer {

	private JFrame frmHotelmanagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	JComboBox  textField_3;
	int hjk=1;
	  Connection conn;
	  int p=0;
	  String s1[]=new String[10];
	    PreparedStatement ps;
	    ResultSet rs;
	    private JTextField textField_6;
	    private JTextField textField_7;
	    public void getVailableRooms()
	    {
	    	String sql="select * from Rooms";
	    	int r=0;
			try {
				ps=conn.prepareStatement(sql);
			
				rs=ps.executeQuery();
				//JOptionPane.showMessageDialog(null,"Bhosdiwale");
			//	System.out.println("Abid1");
			while(rs.next()) {
				String s=rs.getString("ava");
				s=s.toLowerCase();
				
				if(s.equals("yes"))
						{
			s1[r]=rs.getString("no");
			System.out.println(s1[r]);
					r++;
						}
			//	System.out.println("Abid1");
				
			}
			
		
				}catch(Exception ae)
			{
				JOptionPane.showMessageDialog(null,"Abid");
			}
			finally {
				try {
					rs.close();
					ps.close();
				//	conn.close();
					System.out.println("Behen ke lawde");
					 textField_3= new JComboBox(s1);
					frmHotelmanagement.getContentPane().add(textField_3);
					frmHotelmanagement.setBounds(100, 100, 1062, 756);
					textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
					textField_3.setBackground(Color.WHITE);
					frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					textField_3.setBounds(289, 342, 206, 40);
				}catch(Exception ae)
				{
					JOptionPane.showMessageDialog(null,"Ma Ki Chut");
					textField_5.setText("");
				}
			}
	    }
	    private void updateRoom()
	    {
	    	String s1="No";
	    	String sql="update Rooms set ava='"+s1+"'where no='"+(String)textField_3.getSelectedItem()+"'";
	    	
			int p=0;
			try {
				ps=conn.prepareStatement(sql);
				ps.execute();
				}catch(Exception ae) {
				
			}
	    }
	private int  getTotalBil(String s)
	{
		String sql="select * from Rooms where no=?";
		int p=0;
		try {
			
			ps=conn.prepareStatement(sql);
			ps.setString(1, s);
			rs=ps.executeQuery();
			if(rs.next())
			{
			p=rs.getInt("charge");
			return p;
			}
		}catch(Exception ae) {
			JOptionPane.showMessageDialog(null,"Abid");
		}
		return 0;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewCustomer window = new NewCustomer();
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
	public NewCustomer() {
	
		initialize();
	
		conn=sqlcoonection.making();
		getVailableRooms();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelmanagement = new JFrame();
		frmHotelmanagement.setTitle("HotelManagement");
		frmHotelmanagement.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\imagesandicons\\hotel.jpg"));
		frmHotelmanagement.getContentPane().setBackground(Color.WHITE);
		frmHotelmanagement.getContentPane().setLayout(null);
		frmHotelmanagement.setVisible(true);
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(111, 167, 140, 40);
		frmHotelmanagement.getContentPane().add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblAge.setBounds(111, 220, 140, 40);
		frmHotelmanagement.getContentPane().add(lblAge);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblPhone.setBounds(111, 273, 140, 40);
		frmHotelmanagement.getContentPane().add(lblPhone);
		
		JLabel lblRoomNo = new JLabel("Room No");
		lblRoomNo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblRoomNo.setBounds(111, 326, 140, 40);
		frmHotelmanagement.getContentPane().add(lblRoomNo);
		
		JLabel lblPayment = new JLabel("Payment");
		lblPayment.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblPayment.setBounds(111, 543, 140, 40);
		frmHotelmanagement.getContentPane().add(lblPayment);
		
		JLabel lblRemaining = new JLabel("Remaining");
		lblRemaining.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblRemaining.setBounds(111, 605, 140, 40);
		frmHotelmanagement.getContentPane().add(lblRemaining);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField.setBounds(289, 173, 206, 36);
		frmHotelmanagement.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(289, 222, 206, 36);
		frmHotelmanagement.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(289, 275, 206, 36);
		frmHotelmanagement.getContentPane().add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(289, 545, 206, 36);
		frmHotelmanagement.getContentPane().add(textField_4);
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
  int j=Integer.parseInt(textField_4.getText());
  j=p-j;
  textField_5.setText(""+j);
			}});
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(289, 607, 206, 36);
		frmHotelmanagement.getContentPane().add(textField_5);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\imagesandicons\\MV5BNzBkZDU5MWItMDRlNy00MzMzLTk0ZDMtMTllNWNkNWNmMzY1XkEyXkFqcGdeQXVyNDY5MjMyNTg@._V1_.jpg"));
		label.setBounds(527, 169, 506, 340);
		frmHotelmanagement.getContentPane().add(label);
		
		JButton btnAddCustomer = new JButton("Add Customer");
		btnAddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql="insert into Customers (Name,Age,RNo,Payment,Phone,rpay,days,perday) values(?,?,?,?,?,?,?,?)";
				try {
				//	System.out.println("Abid1");
				
					//	u=true;
					ps=conn.prepareStatement(sql);
					System.out.println("Abid1");
					ps.setString(1, textField.getText());
					ps.setString(2, textField_1.getText());
			//	System.out.println(textField_3.getItemCount());
					ps.setString(3, (String)textField_3.getSelectedItem());
					ps.setString(4, textField_4.getText());
				//textField_6.setText(""+p);
					ps.setString(5, textField_2.getText());
			 // int j=Integer.parseInt(textField_4.getText());
			 // j=p-j;
			 // textField_5.setText(""+j);
					ps.setString(6, textField_5.getText());
					ps.setString(7, textField_7.getText());
					
					System.out.println(textField_3.getItemCount());
if(textField_1.getText().equals("")||textField.getText().equals("")||textField_2.getText().equals("")||textField_4.getText().equals("")||textField_7.getText().equals("")||textField_5.getText().equals("")||textField_6.getText().equals(""))
							{
						JOptionPane.showMessageDialog(null,"All field must be filled");
						
							}
					else {
						int p=Integer.parseInt(textField_4.getText());
						int m=Integer.parseInt(textField_5.getText());
						int c=Integer.parseInt(textField_7.getText());
						
						hjk=(p+m)/c;
						ps.setString(8, ""+hjk);
					ps.execute();
				
					
					JOptionPane.showMessageDialog(null,"Thank You!!");
					updateRoom();
					textField.setText("");
					rs.close();
					ps.close();
					textField_1.setText("");
					textField_2.setText("");
					getVailableRooms();
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					rs.close();
					ps.close();
					}
					
			}catch(Exception ae) {
				JOptionPane.showMessageDialog(null,"This room is not available");
				textField_5.setText("");
			}
			}
		});
		btnAddCustomer.setForeground(Color.WHITE);
		btnAddCustomer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnAddCustomer.setBackground(Color.BLACK);
		btnAddCustomer.setBounds(475, 662, 206, 25);
		frmHotelmanagement.getContentPane().add(btnAddCustomer);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			//	textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
			}
		
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnCancel.setBackground(Color.BLACK);
		btnCancel.setBounds(693, 662, 160, 25);
		frmHotelmanagement.getContentPane().add(btnCancel);
		
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
		btnBack.setBounds(881, 662, 160, 25);
		frmHotelmanagement.getContentPane().add(btnBack);
		
		JLabel lblTotalBil = new JLabel("Total Bil");
		lblTotalBil.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblTotalBil.setBounds(111, 469, 140, 40);
		frmHotelmanagement.getContentPane().add(lblTotalBil);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(289, 471, 206, 36);
		frmHotelmanagement.getContentPane().add(textField_6);
		
		JLabel lblAPlaceWhere = new JLabel("A Place Where You Will Get All You Want");
		lblAPlaceWhere.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblAPlaceWhere.setHorizontalAlignment(SwingConstants.CENTER);
		lblAPlaceWhere.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblAPlaceWhere.setBounds(211, 40, 706, 56);
		frmHotelmanagement.getContentPane().add(lblAPlaceWhere);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_7.setColumns(10);
		textField_7.setBounds(289, 396, 206, 36);
		frmHotelmanagement.getContentPane().add(textField_7);
	
		textField_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String k=(String)textField_3.getSelectedItem();
			//	updateRoom();
				p=getTotalBil(k);
			int e1=Integer.parseInt(textField_7.getText());
			p=p*e1;
		textField_6.setText(""+p);
			}});
		JLabel lblTotalDays = new JLabel("Total Days");
		lblTotalDays.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblTotalDays.setBounds(111, 394, 140, 40);
		frmHotelmanagement.getContentPane().add(lblTotalDays);
		
       //    textField_3 = new JComboBox();
		
	
	//	System.out.println("Abid3");
		frmHotelmanagement.setBounds(400,100,1170,838);
		
	}
}
