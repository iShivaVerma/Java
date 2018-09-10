package question6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import utility.ConnectorJDBC;

public class BulkUpdate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Scanner scannerObject=new Scanner(System.in);
		System.out.print("Enter the percentage:");
		int percentage=Integer.parseInt(scannerObject.nextLine());
		float percent=(float)percentage/100;
		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="UPDATE EMPLOYEE_INFO SET SALARY=SALARY+SALARY*?";
		PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
		preparedStatementObject.setFloat(1, percent);
		if(preparedStatementObject.executeUpdate()>1)
			System.out.println("Successfully Updated");
		else
			System.out.println("Not Successfully Updated");
		
		scannerObject.close();
	}

}
