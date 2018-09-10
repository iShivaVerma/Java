package question2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import utility.ConnectorJDBC;

public class VerifyEmployeeOtherWay {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int employeeID=Integer.parseInt(scannerObject.nextLine());
		String query="SELECT EID FROM EMPLOYEE_INFO WHERE EID=?";
		PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
		preparedStatementObject.setInt(1, employeeID);
		ResultSet resultSetObject=preparedStatementObject.executeQuery();
		if(resultSetObject.next())
			System.out.println("FOUND");
		else
			System.out.println("NOT FOUND");
		
		scannerObject.close();
	}

}
