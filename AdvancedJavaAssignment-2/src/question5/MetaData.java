package question5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import utility.ConnectorJDBC;

public class MetaData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		Statement statementObject=connectionObject.createStatement();
		/*String query="DESC EMPLOYEE_INFO";
		ResultSet resultSetObject=statementObject.executeQuery(query);
		while(resultSetObject.next()) {
			System.out.print(resultSetObject.getString(1));
			System.out.print("\t");
			System.out.print(resultSetObject.getString(2));
			System.out.print("\t");
			System.out.print(resultSetObject.getString(3));
			System.out.print("\t");
			System.out.print(resultSetObject.getString(4));
		}*/
		
		String query="SELECT*FROM EMPLOYEE_INFO";
		ResultSet resultSetObject=statementObject.executeQuery(query);
		ResultSetMetaData resultSetMetaDataObject=resultSetObject.getMetaData();
		
		System.out.println("---------METADATA-------");
		int i=resultSetMetaDataObject.getColumnCount();
		while(i>0){
			System.out.print(resultSetMetaDataObject.getColumnName(i));
			System.out.print("\t");
			System.out.print(resultSetMetaDataObject.getColumnTypeName(i));
			System.out.println();
			i--;
		}
		System.out.println("-----------DATA------------");
		while(resultSetObject.next()) {
			System.out.print(resultSetObject.getString(1));
			System.out.print("\t");
			System.out.print(resultSetObject.getString(2));
			System.out.print("\t");
			System.out.print(resultSetObject.getString(3));
			System.out.print("\t");
			System.out.print(resultSetObject.getString(4));
			System.out.println();
		}
	}

}
