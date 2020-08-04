package hotelManagement;
import java.sql.*;
import javax.swing.*;
public class sqlcoonection {
Connection conn=null;

public static Connection making()
{
	try {
		Class.forName("org.sqlite.JDBC");
	Connection	conn=DriverManager.getConnection("jdbc:sqlite:E:\\HotelManagement\\HotelManagement.db");
	//JOptionPane.showMessageDialog(null,"Successful");
	return conn;
		
		
	}catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,e);
		return null;
	}
}
}
