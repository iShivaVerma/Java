package question2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import utility.ConnectorJDBC;

public class VerifyEmployee {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		Statement statementObject=connectionObject.createStatement();
		String query="SELECT EID FROM EMPLOYEE_INFO";
		ResultSet resultSetObject=statementObject.executeQuery(query);
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int employeeID=Integer.parseInt(scannerObject.nextLine());
		int flag=0;
		while(resultSetObject.next()){
			if(employeeID==resultSetObject.getInt(1))
				flag++;
		}
		if(flag==0)
			System.out.println("Not Found");
		else
			System.out.println("Found");
		
		scannerObject.close();
	}

}
