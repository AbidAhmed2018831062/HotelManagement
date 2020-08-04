package hotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Reception {

	private JFrame frmHotelmanagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reception window = new Reception();
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
	public Reception() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelmanagement = new JFrame();
		frmHotelmanagement.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\imagesandicons\\hotel.jpg"));
		frmHotelmanagement.setTitle("HotelManagement");
		frmHotelmanagement.getContentPane().setBackground(Color.WHITE);
		frmHotelmanagement.setBackground(Color.WHITE);
		frmHotelmanagement.setBounds(400, 100, 1058, 771);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelmanagement.getContentPane().setLayout(null);
		frmHotelmanagement.setVisible(true);
		JButton btnNewCustomerAdd = new JButton("New Customer Add");
		btnNewCustomerAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				NewCustomer nwc=new NewCustomer();
			}
		});
		btnNewCustomerAdd.setForeground(Color.WHITE);
		btnNewCustomerAdd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnNewCustomerAdd.setBackground(Color.BLACK);
		btnNewCustomerAdd.setBounds(25, 140, 294, 25);
		frmHotelmanagement.getContentPane().add(btnNewCustomerAdd);
		
		JButton btnRooms = new JButton("Rooms");
		btnRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	frmHotelmanagement.setVisible(false);
				frmHotelmanagement.setVisible(false);
				Rooms r=new Rooms();
			}
		});
		btnRooms.setForeground(Color.WHITE);
		btnRooms.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnRooms.setBackground(Color.BLACK);
		btnRooms.setBounds(25, 178, 294, 25);
		frmHotelmanagement.getContentPane().add(btnRooms);
		
		JButton btnAllEmployeeInfo = new JButton("All Employee Info");
		btnAllEmployeeInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				ALLEmployeeInfo il=new ALLEmployeeInfo();
			}
		});
		btnAllEmployeeInfo.setForeground(Color.WHITE);
		btnAllEmployeeInfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnAllEmployeeInfo.setBackground(Color.BLACK);
		btnAllEmployeeInfo.setBounds(25, 216, 294, 25);
		frmHotelmanagement.getContentPane().add(btnAllEmployeeInfo);
		
		JButton btnAllCustomerInfo = new JButton("All Customer Info");
		btnAllCustomerInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				ALLCUstomerInfo il=new ALLCUstomerInfo();
			}
		});
		btnAllCustomerInfo.setForeground(Color.WHITE);
		btnAllCustomerInfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnAllCustomerInfo.setBackground(Color.BLACK);
		btnAllCustomerInfo.setBounds(25, 254, 294, 25);
		frmHotelmanagement.getContentPane().add(btnAllCustomerInfo);
		
		JButton btnManagerInfo = new JButton("Check Out");
		btnManagerInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				CheckOut c=new CheckOut();
			}
		});
		btnManagerInfo.setForeground(Color.WHITE);
		btnManagerInfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnManagerInfo.setBackground(Color.BLACK);
		btnManagerInfo.setBounds(25, 292, 294, 25);
		frmHotelmanagement.getContentPane().add(btnManagerInfo);
		
		JButton btnUpdateRoomStatus = new JButton("Update Room Status");
		btnUpdateRoomStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				UpdateRoom upr=	new UpdateRoom();
			}
		});
		btnUpdateRoomStatus.setForeground(Color.WHITE);
		btnUpdateRoomStatus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnUpdateRoomStatus.setBackground(Color.BLACK);
		btnUpdateRoomStatus.setBounds(25, 330, 294, 25);
		frmHotelmanagement.getContentPane().add(btnUpdateRoomStatus);
		
		JButton btnSearchRoom = new JButton("Search Room");
		btnSearchRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				SearchRooms sr=new SearchRooms();
				
			}
		});
		btnSearchRoom.setForeground(Color.WHITE);
		btnSearchRoom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnSearchRoom.setBackground(Color.BLACK);
		btnSearchRoom.setBounds(25, 368, 294, 25);
		frmHotelmanagement.getContentPane().add(btnSearchRoom);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon("F:\\imagesandicons\\pexels-photo-2507010.jpeg"));
		lblNewLabel.setBounds(413, 179, 615, 415);
		frmHotelmanagement.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enjoy Your Life while You Can");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(108, 45, 694, 46);
		frmHotelmanagement.getContentPane().add(lblNewLabel_1);
		
		JButton btnManagerInfo_1 = new JButton("Manager Info");
		btnManagerInfo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				ManagerInfo mai=new ManagerInfo();
			}
		});
		btnManagerInfo_1.setForeground(Color.WHITE);
		btnManagerInfo_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnManagerInfo_1.setBackground(Color.BLACK);
		btnManagerInfo_1.setBounds(25, 444, 294, 25);
		frmHotelmanagement.getContentPane().add(btnManagerInfo_1);
		
		JLabel label = new JLabel("Hotel Del Luna");
		label.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label.setBounds(600, 619, 290, 92);
		frmHotelmanagement.getContentPane().add(label);
		
		JButton btnOwnerInfo = new JButton("Owner Info");
		btnOwnerInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				OwnerInfo in=new OwnerInfo();
			}
		});
		btnOwnerInfo.setForeground(Color.WHITE);
		btnOwnerInfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnOwnerInfo.setBackground(Color.BLACK);
		btnOwnerInfo.setBounds(25, 482, 294, 25);
		frmHotelmanagement.getContentPane().add(btnOwnerInfo);
		
		JButton btnAboutUs = new JButton("About Del Luna");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				About hotel=new About();
			}
		});
		btnAboutUs.setForeground(Color.WHITE);
		btnAboutUs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnAboutUs.setBackground(Color.BLACK);
		btnAboutUs.setBounds(25, 520, 294, 25);
		frmHotelmanagement.getContentPane().add(btnAboutUs);
		
		JButton btnUpdateCustomer = new JButton("Update Customer");
		btnUpdateCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateCustomer uc=new UpdateCustomer();
			}
		});
		btnUpdateCustomer.setForeground(Color.WHITE);
		btnUpdateCustomer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnUpdateCustomer.setBackground(Color.BLACK);
		btnUpdateCustomer.setBounds(25, 406, 294, 25);
		frmHotelmanagement.getContentPane().add(btnUpdateCustomer);
		
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
		btnBack.setBounds(25, 641, 138, 25);
		frmHotelmanagement.getContentPane().add(btnBack);
	}

}
