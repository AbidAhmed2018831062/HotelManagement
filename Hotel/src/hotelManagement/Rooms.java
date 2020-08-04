package hotelManagement;
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Rooms {
	   DefaultTableModel model;
	private JFrame frmHotelmanagement;
private JTable table;
private JScrollPane jsp;
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
					Rooms window = new Rooms();
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
	public Rooms() {
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
		JLabel lblNewLabel = new JLabel("Watch Rooms Info Here");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(257, 200, 283, 25);
		frmHotelmanagement.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="select * from Rooms";
				try {
				ps=conn.prepareStatement(sql);
			//	ps.setString(1, textField_8.getText());
					rs=ps.executeQuery();
					while(rs.next())
					{
							//	table.setBounds(45, 162, 1151, 301);
				    String s=rs.getString("no");
				    String row[]=new String[5];
				    row[0]=s;
				    s=rs.getString("bed");
				    row[1]=s;
				    s=rs.getString("charge");
				    row[2]=s;
				   
				    s=rs.getString("status");
				    row[3]=s;
				    s=rs.getString("ava");
				    row[4]=s;
				    
				    model.addRow(row);
				    
				    
					}
					rs.close();
					ps.close();
				}catch(Exception ae) {
					
				}
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		button.setBackground(Color.BLACK);
		button.setBounds(564, 196, 160, 25);
		frmHotelmanagement.getContentPane().add(button);
		
		frmHotelmanagement.setBounds(400, 100, 1084, 875);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		table = new JTable();
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		
		String col[]= {"Room No","Bed","Charge","Status","Availability"};
		model=new DefaultTableModel();
	//	model =new DefaultTableModel();
		model.setColumnIdentifiers(col);
         table.setModel(model);
		table.setSelectionBackground(Color.GREEN);
		table.setBackground(Color.WHITE);
		//table.setFont(f);
		JScrollPane jsp=new JScrollPane(table);
   ///	model.setFont(f);
		jsp.setBounds(0, 249, 1054, 471);
		table.setRowHeight(50);
		//table.setLayout(flow);
	//	panel_1.add(jsp);
		frmHotelmanagement.getContentPane().add(jsp);		
		
		JLabel lblOurRoomsAre = new JLabel("Our Rooms Are Designed According To Our Customers");
		lblOurRoomsAre.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblOurRoomsAre.setHorizontalAlignment(SwingConstants.CENTER);
		lblOurRoomsAre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblOurRoomsAre.setBounds(72, 40, 955, 71);
		frmHotelmanagement.getContentPane().add(lblOurRoomsAre);
		
		JLabel label = new JLabel("Hotel Del Luna");
		label.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label.setBounds(748, 733, 290, 92);
		frmHotelmanagement.getContentPane().add(label);
		
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
		btnBack.setBounds(458, 760, 160, 25);
		frmHotelmanagement.getContentPane().add(btnBack);
	}
}
