package hotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import StudentManagement.sqlcoonection;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.Toolkit;
public class LogIn {

	private JFrame frmHotelmanagement;
	private JTextField textField;
	private JTextField textField_1;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
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
	public LogIn() {
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
		frmHotelmanagement.setBackground(Color.WHITE);
		frmHotelmanagement.setBounds(400, 100, 820, 622);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelmanagement.getContentPane().setLayout(null);
		frmHotelmanagement.setVisible(true);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setIcon(new ImageIcon("F:\\imagesandicons\\256-2560208_person-icon-black-png-transparent-png.jpg"));
		lblNewLabel.setBounds(135, 197, 56, 31);
		frmHotelmanagement.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		textField.setBounds(191, 197, 116, 34);
		frmHotelmanagement.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setIcon(new ImageIcon("F:\\imagesandicons\\index.jpg"));
		label.setBounds(135, 241, 56, 31);
		frmHotelmanagement.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(191, 238, 116, 34);
		frmHotelmanagement.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\imagesandicons\\LoginIconAppl.png"));
		lblNewLabel_1.setBounds(354, 119, 225, 244);
		frmHotelmanagement.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Introduce Yourself");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\imagesandicons\\256-2560208_person-icon-black-png-transparent-png.jpg"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_2.setBounds(228, 57, 319, 49);
		frmHotelmanagement.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("LogIn");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="select * from Hotel where id=? and pin=?";
				try {
					ps=conn.prepareStatement(sql);
					ps.setString(1,textField.getText());
					ps.setString(2, textField_1.getText());
					rs=ps.executeQuery();
					if(rs.next())
					{
					
						try {
							rs.close();
							ps.close();
							frmHotelmanagement.setVisible(false);
							HomePage ob=new HomePage();
						}catch(Exception ae) {
							
						}
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Wrong Password/UserId");
					}
						
					}catch(Exception ae)
				{
						
						
				}finally {
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(159, 362, 116, 25);
		frmHotelmanagement.getContentPane().add(btnNewButton);
		
		JButton btnCabcel = new JButton("Cancel");
		btnCabcel.setForeground(Color.WHITE);
		btnCabcel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnCabcel.setBackground(Color.BLACK);
		btnCabcel.setBounds(311, 362, 116, 25);
		frmHotelmanagement.getContentPane().add(btnCabcel);
		
		JLabel lblNewLabel_3 = new JLabel("Hotel Del Luna");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		lblNewLabel_3.setBounds(500, 470, 290, 92);
		frmHotelmanagement.getContentPane().add(lblNewLabel_3);
	}
}
