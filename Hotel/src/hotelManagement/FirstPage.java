package hotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class FirstPage extends JFrame {

	private JFrame frmHotelmanagement;
	Thread th;
	JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel label_1;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage window = new FirstPage();
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
	public FirstPage() {
		initialize();
		//
		System.out.println("Amarendra");
	   // run();

		
	}

	private void initialize() {
		frmHotelmanagement = new JFrame();
		frmHotelmanagement.setTitle("HotelManagement");
		frmHotelmanagement.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\imagesandicons\\hotel.jpg"));
		frmHotelmanagement.setResizable(false);
		frmHotelmanagement.getContentPane().setBackground(Color.WHITE);
		frmHotelmanagement.setBounds(400, 100, 1165,934);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelmanagement.getContentPane().setLayout(null);
	//	frame.setVisible(true);
		 lblNewLabel_1 = new JLabel("Welcome To Hotel Del Luna");
		 lblNewLabel_1.setIcon(new ImageIcon("F:\\imagesandicons\\index1.png"));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(241, 110, 635, 55);
		frmHotelmanagement.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\imagesandicons\\pexels-photo-258154.jpeg"));
		label.setBounds(0, 0, 1158, 772);
		frmHotelmanagement.getContentPane().add(label);
		
		btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				LogIn lg=new LogIn();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(0, 774, 164, 79);
		frmHotelmanagement.getContentPane().add(btnNewButton);
		
		label_1 = new JLabel("Hotel Del Luna");
		label_1.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label_1.setBounds(845, 766, 290, 92);
		frmHotelmanagement.getContentPane().add(label_1);
		//frame.setVisible(true);
    }

	
		
	

	}


