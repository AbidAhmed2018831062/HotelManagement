package hotelManagement;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class ALLCUstomerInfo {

	private JFrame frmHotelmanagement;
private JTable table;
private JScrollPane jsp;
private DefaultTableModel  model;
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
					ALLCUstomerInfo window = new ALLCUstomerInfo();
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
	public ALLCUstomerInfo() {
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
		frmHotelmanagement.setBounds(400, 100, 1266, 900);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelmanagement.getContentPane().setLayout(null);
		frmHotelmanagement.setVisible(true);
		JLabel lblCustomer = new JLabel("Watch Customer Info Here");
		lblCustomer.setForeground(Color.BLACK);
		lblCustomer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblCustomer.setBounds(274, 164, 296, 25);
		frmHotelmanagement.getContentPane().add(lblCustomer);
		
		JButton button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="select * from Customers";
				try {
				ps=conn.prepareStatement(sql);
			//	ps.setString(1, textField_8.getText());
					rs=ps.executeQuery();
					while(rs.next())
					{
							//	table.setBounds(45, 162, 1151, 301);
				    String s=rs.getString("Name");
				    String row[]=new String[5];
				    row[0]=s;
				    s=rs.getString("Age");
				    row[1]=s;
				    s=rs.getString("Phone");
				    row[2]=s;
				   
				    s=rs.getString("RNo");
				    row[3]=s;
				    s=rs.getString("rpay");
				    row[4]=s;
				    
				    model.addRow(row);
				    
				    
					}
					rs.close();
					ps.close();
				
				}catch(Exception ae) {
					JOptionPane.showMessageDialog(null, ae);
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		button.setBackground(Color.BLACK);
		button.setBounds(606, 168, 160, 25);
		frmHotelmanagement.getContentPane().add(button);
		table = new JTable();
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		
		String col[]= {"Name","Age","Phone No","Room No","Remaining Payment"};
		model=new DefaultTableModel();
	//	model =new DefaultTableModel();
		model.setColumnIdentifiers(col);
         table.setModel(model);
		table.setSelectionBackground(Color.GREEN);
		table.setBackground(Color.WHITE);
		//table.setFont(f);
		JScrollPane jsp=new JScrollPane(table);
   ///	model.setFont(f);
		jsp.setBounds(24, 239, 1212, 471);
		table.setRowHeight(50);
		//table.setLayout(flow);
	//	panel_1.add(jsp);
		frmHotelmanagement.getContentPane().add(jsp);		
		
		JLabel label = new JLabel("Hotel Del Luna");
		label.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label.setBounds(910, 732, 290, 92);
		frmHotelmanagement.getContentPane().add(label);
		
		JLabel lblCustomersSatisfactionIs = new JLabel("Customers Satisfaction Is Everything For US");
		lblCustomersSatisfactionIs.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblCustomersSatisfactionIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomersSatisfactionIs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblCustomersSatisfactionIs.setBounds(159, 49, 955, 71);
		frmHotelmanagement.getContentPane().add(lblCustomersSatisfactionIs);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				Reception rc=new Reception();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(471, 771, 160, 25);
		frmHotelmanagement.getContentPane().add(button_1);
	}
}
