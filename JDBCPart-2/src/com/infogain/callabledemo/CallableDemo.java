package com.infogain.callabledemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableDemo {

	public static void main(String[] args) {
		
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connectionObject=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "hr", "hr");
			CallableStatement callableStatementObject=connectionObject.prepareCall("{call MYPROC(?)}");
			callableStatementObject.setString(1, "Ac");
			callableStatementObject.execute();
			System.out.println("Record Deleted");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
