package hotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import StudentManagement.Loading;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class SearchRooms {

	private JFrame frmHotelmanagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	 Connection conn;
	    PreparedStatement ps;
	    ResultSet rs;
	    private JLabel lblWeTakeCare;
	    private JLabel label;
	    private JButton btnBack;
	    private JLabel label_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchRooms window = new SearchRooms();
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
	public SearchRooms() {
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
		JLabel lblRoomNo = new JLabel("Room No");
		lblRoomNo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblRoomNo.setBounds(45, 220, 140, 40);
		frmHotelmanagement.getContentPane().add(lblRoomNo);
		
		JLabel lblBed = new JLabel("Bed");
		lblBed.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblBed.setBounds(74, 273, 140, 40);
		frmHotelmanagement.getContentPane().add(lblBed);
		
		JLabel lblCharge = new JLabel("Charge");
		lblCharge.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblCharge.setBounds(74, 326, 140, 40);
		frmHotelmanagement.getContentPane().add(lblCharge);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblStatus.setBounds(74, 389, 140, 40);
		frmHotelmanagement.getContentPane().add(lblStatus);
		
		JLabel lblAvailability = new JLabel("Availability");
		lblAvailability.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblAvailability.setBounds(33, 457, 181, 40);
		frmHotelmanagement.getContentPane().add(lblAvailability);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField.setColumns(10);
		textField.setBounds(237, 222, 160, 36);
		frmHotelmanagement.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(237, 275, 160, 36);
		frmHotelmanagement.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(237, 328, 160, 36);
		frmHotelmanagement.getContentPane().add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(237, 391, 160, 36);
		frmHotelmanagement.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(237, 459, 160, 36);
		frmHotelmanagement.getContentPane().add(textField_5);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
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
				textField_4.setText(add3);
				String add4=rs.getString("ava");
				textField_5.setText(add4);
			}
				else
				{
					JOptionPane.showMessageDialog(null,"Incorrect pin/user name");
				}
			rs.close();
			ps.close();
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
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnSearch.setBackground(Color.BLACK);
		btnSearch.setBounds(436, 229, 160, 25);
		frmHotelmanagement.getContentPane().add(btnSearch);
		
		lblWeTakeCare = new JLabel("We Take Care OF Every Single Complain Of Yours");
		lblWeTakeCare.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblWeTakeCare.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblWeTakeCare.setBounds(128, 60, 716, 67);
		frmHotelmanagement.getContentPane().add(lblWeTakeCare);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\imagesandicons\\pexels-photo-2659629.jpeg"));
		label.setBounds(608, 128, 399, 481);
		frmHotelmanagement.getContentPane().add(label);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				Reception sr=new Reception();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(385, 535, 160, 25);
		frmHotelmanagement.getContentPane().add(btnBack);
		
		label_1 = new JLabel("Hotel Del Luna");
		label_1.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label_1.setBounds(712, 612, 290, 92);
		frmHotelmanagement.getContentPane().add(label_1);
		frmHotelmanagement.setBounds(400, 100, 1054, 751);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
