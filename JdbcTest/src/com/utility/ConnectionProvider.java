package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	static Connection connectionObject=null;
	static Connection getConnnetionObject(){
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			connectionObject=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		}
		catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return connectionObject;
	}
}
