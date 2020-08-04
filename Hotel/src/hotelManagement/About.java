package hotelManagement;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class About implements ActionListener{

	private JFrame frmHotelmanagement;
	JPanel panel;
	CardLayout f;
	JButton btnPrevious;
	JButton btnNext;

	ImageIcon icon;
	private JButton button;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About window = new About();
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
	public About() {
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
		frmHotelmanagement.setBounds(400, 100, 1230, 846);
		frmHotelmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelmanagement.getContentPane().setLayout(null);
		
		JTextArea txtrHotelDelLuna = new JTextArea();
		txtrHotelDelLuna.setWrapStyleWord(true);
		txtrHotelDelLuna.setText("Hotel Del Luna was created 1000 years ago.Since in those 1000 years human civillaization  has changed regularly our hotel also changed with the passing of time to give the best service to our customers .Because customers are everything for us.We want to give our customers the best service.Hotel Del Luna is like a small world.From Beaches to Zoos you will find everything here");
		txtrHotelDelLuna.setLineWrap(true);
		txtrHotelDelLuna.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 26));
		txtrHotelDelLuna.setEditable(false);
		txtrHotelDelLuna.setBounds(12, 110, 1151, 219);
		frmHotelmanagement.getContentPane().add(txtrHotelDelLuna);
		
		
		 f=new CardLayout();
			panel = new JPanel(f);
			panel.setBounds(115, 342, 948, 303);
			frmHotelmanagement.getContentPane().add(panel);
			frmHotelmanagement.setVisible(true);
			btnPrevious = new JButton("Previous");
			btnPrevious.setForeground(Color.WHITE);
			btnPrevious.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
			btnPrevious.setBackground(Color.BLACK);
			btnPrevious.setBounds(113, 658, 160, 25);
			frmHotelmanagement.getContentPane().add(btnPrevious);
			
		 btnNext = new JButton("Next");
			btnNext.setForeground(Color.WHITE);
			btnNext.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
			btnNext.setBackground(Color.BLACK);
			btnNext.setBounds(903, 658, 160, 25);
			frmHotelmanagement.getContentPane().add(btnNext);
			
			JLabel lblWelcomeToHotel = new JLabel("Welcome To Hotel Del Luna History");
			lblWelcomeToHotel.setIcon(new ImageIcon("F:\\imagesandicons\\HotelPhoto1.jpg"));
			lblWelcomeToHotel.setHorizontalAlignment(SwingConstants.CENTER);
			lblWelcomeToHotel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
			lblWelcomeToHotel.setBounds(127, 26, 955, 71);
			frmHotelmanagement.getContentPane().add(lblWelcomeToHotel);
			
			JLabel lblHotelDelLuna = new JLabel("Hotel Del Luna");
			lblHotelDelLuna.setIcon(new ImageIcon("F:\\imagesandicons\\hotel.jpg"));
			lblHotelDelLuna.setForeground(Color.RED);
			lblHotelDelLuna.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
			lblHotelDelLuna.setBounds(873, 694, 290, 92);
			frmHotelmanagement.getContentPane().add(lblHotelDelLuna);
			
			button = new JButton("Back");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frmHotelmanagement.setVisible(false);
					Reception rc=new Reception();
				}
			});
			button.setForeground(Color.WHITE);
			button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
			button.setBackground(Color.BLACK);
			button.setBounds(36, 749, 160, 25);
			frmHotelmanagement.getContentPane().add(button);
	        showImage();
	        btnPrevious.addActionListener(this);
			btnNext.addActionListener(this);
		
	}
	private void showImage()
	{
	String[] s= {"1.jpg","10.jpg","11.jpg","12.jpg","13.jpg","14.jpg","16.jpg","17.jpg","20.jpeg","21.jpg","pexels-photo-2507010.jpeg","pexels-photo-2659629.jpeg","night-dark-hotel-luxury.jpg","pexels-photo-258154.jpeg","5.jpeg","6.jpg","7.jpeg","8.jpg","9.jpg","unnamed.jpg"};
	for(String n:s)
	{
	 icon=new ImageIcon(getClass().getResource(n));
	Image	img=icon.getImage();
		Image newImg=img.getScaledInstance(panel.getWidth(), panel.getHeight(),Image.SCALE_SMOOTH);
		icon=new ImageIcon(newImg);
		JLabel j=new JLabel(icon);
		panel.add(j);
		
		
	}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnPrevious)
		{
		f.previous(panel);
		}
		else
			f.next(panel);
		
	}
}
