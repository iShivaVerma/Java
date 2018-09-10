package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connectionObject=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			Statement statementObject=connectionObject.createStatement();
			ResultSet resultSetObject=statementObject.executeQuery("SELECT*FROM EMPLOYEE_INFO");
			while(resultSetObject.next()){
				System.out.println("EID:"+resultSetObject.getLong(1)+" Name:"+resultSetObject.getString(2));
				System.out.println("Department:"+resultSetObject.getString(3)+" Salary:"+resultSetObject.getFloat(4));
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
