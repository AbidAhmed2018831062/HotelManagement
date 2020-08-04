package hotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class AddManager {

	private JFrame frmHotelmanagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    private JLabel label_1;
    private JLabel lblPicthManagerWith;
    private JLabel lblAManagerIs;
    private JButton btnAddManager;
    private JButton btnBack;
    private JTextField textField_6;
    private JLabel lblSatrtingYear;
    private JTextField textField_7;
    private JLabel lblEndingYear;
    private JLabel label_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddManager window = new AddManager();
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
	public AddManager() {
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
		JLabel label = new JLabel("NAME");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		label.setBounds(140, 220, 127, 30);
		frmHotelmanagement.getContentPane().add(label);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblAge.setBounds(140, 269, 127, 30);
		frmHotelmanagement.getContentPane().add(lblAge);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblSalary.setBounds(140, 318, 127, 30);
		frmHotelmanagement.getContentPane().add(lblSalary);
		
		JLabel lblTarining = new JLabel("Training");
		lblTarining.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblTarining.setBounds(140, 367, 127, 30);
		frmHotelmanagement.getContentPane().add(lblTarining);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblPhone.setBounds(140, 430, 127, 30);
		frmHotelmanagement.getContentPane().add(lblPhone);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField.setColumns(10);
		textField.setBounds(279, 216, 160, 36);
		frmHotelmanagement.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(279, 265, 160, 36);
		frmHotelmanagement.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(279, 314, 160, 36);
		frmHotelmanagement.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(279, 363, 160, 36);
		frmHotelmanagement.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(277, 426, 160, 36);
		frmHotelmanagement.getContentPane().add(textField_4);
		
		JLabel lblManagerNo = new JLabel("Manager No");
		lblManagerNo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblManagerNo.setBounds(101, 492, 166, 30);
		frmHotelmanagement.getContentPane().add(lblManagerNo);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(279, 488, 160, 36);
		frmHotelmanagement.getContentPane().add(textField_5);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("F:\\imagesandicons\\steamuserimages-a.akamaihd.net.jpg"));
		label_1.setBounds(623, 135, 640, 464);
		frmHotelmanagement.getContentPane().add(label_1);
		
		lblPicthManagerWith = new JLabel("PIC:99th Manager With Owner");
		lblPicthManagerWith.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblPicthManagerWith.setBounds(747, 584, 382, 30);
		frmHotelmanagement.getContentPane().add(lblPicthManagerWith);
		
		lblAManagerIs = new JLabel("A Manager Is The Backbone of A Hotel");
		lblAManagerIs.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblAManagerIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblAManagerIs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblAManagerIs.setBounds(239, 51, 955, 71);
		frmHotelmanagement.getContentPane().add(lblAManagerIs);
		
		btnAddManager = new JButton("Add Manager");
		btnAddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="insert into Manager (Name,Age,Salary,Tarining,no,Phone,sty,eny) values(?,?,?,?,?,?,?,?)";
				try {
					System.out.println("Abid1");
					ps=conn.prepareStatement(sql);
					System.out.println("Abid1");
					ps.setString(1, textField.getText());
					ps.setString(2, textField_1.getText());
					ps.setString(3, textField_2.getText());
					ps.setString(4, textField_3.getText());
					ps.setString(5, textField_5.getText());
					ps.setString(6, textField_4.getText());
					ps.setString(7, textField_6.getText());
					ps.setString(8, textField_7.getText());
					//ps.setString(5, textField_5.getText());
					ps.execute();
					JOptionPane.showMessageDialog(null,"Manager Has Been Added Successfully");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
				//	rs.close();
					ps.close();
			}catch(Exception ae) {
				JOptionPane.showMessageDialog(null,ae);
			}
				
			}
		});
		btnAddManager.setForeground(Color.WHITE);
		btnAddManager.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnAddManager.setBackground(Color.BLACK);
		btnAddManager.setBounds(569, 656, 253, 25);
		frmHotelmanagement.getContentPane().add(btnAddManager);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hp=new HomePage();
			}
			
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(834, 656, 160, 25);
		frmHotelmanagement.getContentPane().add(btnBack);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(279, 543, 160, 36);
		frmHotelmanagement.getContentPane().add(textField_6);
		
		lblSatrtingYear = new JLabel("Satrting Year");
		lblSatrtingYear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblSatrtingYear.setBounds(101, 547, 166, 30);
		frmHotelmanagement.getContentPane().add(lblSatrtingYear);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textField_7.setColumns(10);
		textField_7.setBounds(279, 606, 160, 36);
		frmHotelmanagement.getContentPane().add(textField_7);
		
		lblEndingYear = new JLabel("Ending Year");
		lblEndingYear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblEndingYear.setBounds(101, 612, 166, 30);
		frmHotelmanagement.getContentPane().add(lblEndingYear);
		
		label_2 = new JLabel("Hotel Del Luna");
		label_2.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label_2.setBounds(961, 691, 290, 92);
		frmHotelmanagement.getContentPane().add(label_2);
		frmHotelmanagement.setBounds(400, 100, 1328, 830);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
