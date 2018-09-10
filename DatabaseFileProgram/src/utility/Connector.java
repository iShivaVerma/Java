package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	static Connection connectionObject=null;
	public static Connection getConnection(){
		try {
			Class.forName("oracle:jdbc.driver.OracleDriver");
				connectionObject=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException|SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connectionObject;
	}
}
