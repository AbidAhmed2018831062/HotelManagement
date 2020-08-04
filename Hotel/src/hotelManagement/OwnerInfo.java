package hotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class OwnerInfo {

	private JFrame frmHotelmanagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OwnerInfo window = new OwnerInfo();
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
	public OwnerInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelmanagement = new JFrame();
		frmHotelmanagement.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\imagesandicons\\hotel.jpg"));
		frmHotelmanagement.setTitle("HotelManagement");
		frmHotelmanagement.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmHotelmanagement.getContentPane().setBackground(Color.WHITE);
		frmHotelmanagement.setBounds(400, 50, 1249, 950);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelmanagement.getContentPane().setLayout(null);
		frmHotelmanagement.setVisible(true);
		JTextArea txtrMyNameIs = new JTextArea();
		txtrMyNameIs.setEditable(false);
		txtrMyNameIs.setLineWrap(true);
		txtrMyNameIs.setWrapStyleWord(true);
		txtrMyNameIs.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 26));
		txtrMyNameIs.setText("My name is Jang Man Weol.I am a creature which is neither human nor ghost.But I have this gift to serve the guests who are heading towards heaven.I am 1000 years old.I am fond of food specially ramen.");
		txtrMyNameIs.setBounds(24, 199, 1207, 103);
		frmHotelmanagement.getContentPane().add(txtrMyNameIs);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("F:\\imagesandicons\\ED2-FvbVUAAxwka.jpg"));
		lblNewLabel.setBounds(156, 374, 953, 417);
		frmHotelmanagement.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Owner Jang Man Weol");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setBounds(519, 804, 282, 30);
		frmHotelmanagement.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("Hotel Del Luna");
		label.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		label.setBounds(929, 798, 290, 92);
		frmHotelmanagement.getContentPane().add(label);
		
		JLabel lblCustomersAreLike = new JLabel("Customers Are Like God To Us");
		lblCustomersAreLike.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
		lblCustomersAreLike.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomersAreLike.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblCustomersAreLike.setBounds(119, 68, 955, 71);
		frmHotelmanagement.getContentPane().add(lblCustomersAreLike);
		
		JLabel lblNewLabel_3 = new JLabel("Owners Info");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(431, 318, 370, 27);
		frmHotelmanagement.getContentPane().add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(431, 318, 370, 27);
		frmHotelmanagement.getContentPane().add(panel);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelmanagement.setVisible(false);
				Reception rc=new Reception();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		button.setBackground(Color.BLACK);
		button.setBounds(761, 847, 160, 25);
		frmHotelmanagement.getContentPane().add(button);
	}
}
