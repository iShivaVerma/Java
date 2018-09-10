package question1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.ConnectorJDBC;

public class NumberOfRecordsOtherWay {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="SELECT COUNT(*) FROM EMPLOYEE_INFO";
		Statement statementObject=connectionObject.createStatement();
		ResultSet resultSetObject=statementObject.executeQuery(query);
		resultSetObject.next();
		int count=resultSetObject.getInt(1);
		System.out.println("Number of Records:"+count);
	}

}
