package myPack;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import utility.Connector;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connectionObject=Connector.getConnection();
		Statement statementObject=connectionObject.createStatement();
		
	}

}
