package question1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utility.ConnectorJDBC;

public class NumberOfRecords {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		int count=0;
		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="SELECT * FROM EMPLOYEE_INFO";
		Statement statementObject=connectionObject.createStatement();
		ResultSet resultSetObject=statementObject.executeQuery(query);
		while(resultSetObject.next())
			count++;
		System.out.println("Number of Records:"+count);
	}

}
