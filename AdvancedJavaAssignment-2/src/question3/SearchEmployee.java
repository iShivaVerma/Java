package question3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import utility.ConnectorJDBC;

public class SearchEmployee {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		SearchEmployee searchEmployeeObject=new SearchEmployee();
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int employeeID=Integer.parseInt(scannerObject.nextLine());
		searchEmployeeObject.display(employeeID);
		scannerObject.close();
	}
	public void display(int employeeID) throws SQLException{
		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="SELECT * FROM EMPLOYEE_INFO WHERE EID=?";
		PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
		preparedStatementObject.setInt(1, employeeID);
		ResultSet resultSetObject=preparedStatementObject.executeQuery();
		if(resultSetObject.next()){
			System.out.println("Found");
			System.out.println("Employee ID:"+resultSetObject.getInt(1));
			System.out.println("Employee Name:"+resultSetObject.getString(2));
			System.out.println("Department:"+resultSetObject.getString(3));
			System.out.println("Salary:"+resultSetObject.getFloat(4));
		}
		else
			System.out.println("Not Found");
		
	}

}
