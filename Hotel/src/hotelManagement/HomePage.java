package hotelManagement;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class HomePage extends JFrame{

    public static void main(String[] args) {
        new HomePage().setVisible(true);
    }
    
    public HomePage() {
        super("HOTEL MANAGEMENT SYSTEM");
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\imagesandicons\\hotel.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setForeground(Color.CYAN);
        getContentPane().setLayout(null); 

    setVisible(true);
      		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("HOTEL MANAGEMENT");
        AirlineSystem.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
        AirlineSystem.setForeground(Color.BLACK);
	menuBar.add(AirlineSystem);
		
        JMenuItem FlightDetails = new JMenuItem("RECEPTION");
	AirlineSystem.add(FlightDetails);
		
	JMenu AirlineSystemHello = new JMenu("ADMIN");
	AirlineSystemHello.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
        AirlineSystemHello.setForeground(Color.BLACK);
	menuBar.add(AirlineSystemHello);
        
        JMenuItem FlightDetailshello1 = new JMenuItem("ADD EMPLOYEE");
	AirlineSystemHello.add(FlightDetailshello1);
        
        FlightDetailshello1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                	setVisible(false);
                  AddEmployee ad=new  AddEmployee();
                }catch(Exception e ){}
            }
	});
        

        JMenuItem FlightDetailshello2 = new JMenuItem("ADD ROOMS");
	AirlineSystemHello.add(FlightDetailshello2);
        
        FlightDetailshello2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                	setVisible(false);
              AddRooms ad=new  AddRooms();
                }catch(Exception e ){}
            }
	});
        

	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            	setVisible(false);
            	Reception r=new Reception();
            }
	});
        
        
        JMenuItem FlightDetailshello3 = new JMenuItem("ADD DRIVERS");
	AirlineSystemHello.add(FlightDetailshello3);
        
	FlightDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                	setVisible(false);
                 AddDrivers ad=new  AddDrivers();
                }catch(Exception e ){}
            }
	});
    
    JMenuItem FlightDetailshello4 = new JMenuItem("ADD MANAGER");
AirlineSystemHello.add(FlightDetailshello4);
    
FlightDetailshello4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            try{
            	setVisible(false);
            AddManager ad=new    AddManager();
            }catch(Exception e ){}
        }
});
        
		
        setBounds(200,000,1700,1027);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel lblNewLabel = new JLabel("We will make sure you love this world before you leave the world");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(137, 49, 996, 118);
        getContentPane().add(lblNewLabel);
        
        JLabel lblWelcomeToHotel = new JLabel("Welcome To Hotel Del Luna");
        lblWelcomeToHotel.setIcon(new ImageIcon("F:\\imagesandicons\\index1.png"));
        lblWelcomeToHotel.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcomeToHotel.setForeground(Color.WHITE);
        lblWelcomeToHotel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
        lblWelcomeToHotel.setBounds(113, 110, 996, 118);
        getContentPane().add(lblWelcomeToHotel);
        
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon("F:\\imagesandicons\\night-dark-hotel-luxury.jpg"));
        label.setForeground(Color.WHITE);
        label.setBounds(0, 0, 1700, 1030);
        getContentPane().add(label);
    }
}