package hotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class ManagerInfo {

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
					ManagerInfo window = new ManagerInfo();
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
	public ManagerInfo() {
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
		frmHotelmanagement.setBounds(400, 100, 1324, 900);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelmanagement.getContentPane().setLayout(null);
		frmHotelmanagement.setVisible(true);
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField.setColumns(10);
		textField.setBounds(345, 191, 207, 36);
		frmHotelmanagement.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(345, 305, 207, 36);
		frmHotelmanagement.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(345, 393, 207, 36);
		frmHotelmanagement.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(345, 472, 207, 36);
		frmHotelmanagement.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(345, 558, 207, 36);
		frmHotelmanagement.getContentPane().add(textField_4);
		
		JButton button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="SELECT * FROM Manager where no=?";
				try {
					ps=conn.prepareStatement(sql);
					ps.setString(1, textField.getText());
					
					rs=ps.executeQuery();
				
			if(rs.next())
			{
				String add1=rs.getString("Name");
				textField_1.setText(add1);
				String add2=rs.getString("Age");
				textField_2.setText(add2);
				String add3=rs.getString("Salary");
				textField_3.setText(add3);
				String add4=rs.getString("Tarining");
				textField_4.setText(add4);
			}
		
				else
				{
					JOptionPane.showMessageDialog(null,"Incorrect  Manager Number");
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
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		button.setBackground(Color.BLACK);
		button.setBounds(442, 252, 160, 25);
		frmHotelmanagement.getContentPane().add(button);
		
		JLabel lblManagerNo = new JLabel("Manager No");
		lblManagerNo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblManagerNo.setBounds(117, 191, 179, 30);
		frmHotelmanagement.getContentPane().add(lblManagerNo);
		
		JLabel label_1 = new JLabel("NAME");
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		label_1.setBounds(169, 305, 127, 30);
		frmHotelmanagement.getContentPane().add(label_1);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblAge.setBounds(169, 393, 127, 30);
		frmHotelmanagement.getContentPane().add(lblAge);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblSalary.setBounds(169, 476, 127, 30);
		frmHotelmanagement.getContentPane().add(lblSalary);
		
		JLabel lblTraining = new JLabel("Training");
		lblTraining.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblTraining.setBounds(169, 558, 127, 30);
		frmHotelmanagement.getContentPane().add(lblTraining);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\imagesandicons\\hotel-del-luna.jpg"));
		label.setBounds(632, 124, 640, 600);
		frmHotelmanagement.getContentPane().add(label);
		
		JLabel lblAManagerAlways = new JLabel("A Manager Always Takes Good Care Of The Hotel");
		lblAManagerAlways.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblAManagerAlways.setHorizontalAlignment(SwingConstants.CENTER);
		lblAManagerAlways.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblAManagerAlways.setBounds(182, 31, 955, 71);
		frmHotelmanagement.getContentPane().add(lblAManagerAlways);
		
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
		btnBack.setBounds(442, 634, 160, 25);
		frmHotelmanagement.getContentPane().add(btnBack);
		
		JLabel label_2 = new JLabel("Hotel Del Luna");
		label_2.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label_2.setBounds(947, 748, 290, 92);
		frmHotelmanagement.getContentPane().add(label_2);
	}

}
