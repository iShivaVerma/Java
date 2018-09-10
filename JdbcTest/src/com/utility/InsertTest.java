package com.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connectionObject;
		PreparedStatement preparedStatementObject;
		connectionObject=ConnectionProvider.getConnnetionObject();
		//Insert Query
		preparedStatementObject=connectionObject.prepareStatement("INSERT INTO EMPLOYEE_INFO VALUES(?,?,?,?)");
		preparedStatementObject.setInt(1, 103);
		preparedStatementObject.setString(2, "Thor");
		preparedStatementObject.setString(3, "HR");
		preparedStatementObject.setFloat(4, 45000F);
		int result=preparedStatementObject.executeUpdate();
		if(result>0)
			System.out.println("Record Inserted");
		else
			System.out.println("Record Not Inserted");
		
		
		//Working
//		boolean result=preparedStatementObject.execute();
//		if(result==true)
//			System.out.println("Record Inserted");
//		else
//			System.out.println("Record Not Inserted");
	}

}
