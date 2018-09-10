package question7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import utility.ConnectorJDBC;

/*CREATE 2 TABLES: REGULAR_CUSTOMER
				 CORPORATE_CUSTOMER*/

public class CustomerDataEntry {

	public static void main(String[] args) throws SQLException {
		
		Scanner scannerObject=new Scanner(System.in);
		CustomerDataEntry customerDataEntryObject=new CustomerDataEntry();
		while(true) {
			System.out.println("-------MENU------");
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Exit");
			System.out.print("Enter the Choice:");
			int choice=Integer.parseInt(scannerObject.nextLine());
			switch(choice) {
			case 1:
				customerDataEntryObject.insert();
				break;
			case 2:
				customerDataEntryObject.display();
				break;
			case 3:
				System.exit(0);
				break;
				default:System.out.println("Enter Correct Choice");
			}
		}
	}
	
	public void insert() throws SQLException {
		CustomerDataEntry customerDataEntryObject=new CustomerDataEntry();
		Scanner scannerObject=new Scanner(System.in);
		System.out.print("Enter Customer Name:");
		String name=scannerObject.nextLine();
		System.out.print("Enter Customer Type:");
		String type=scannerObject.nextLine();
		Customer customerObject=new Customer(name, type);
		customerDataEntryObject.dataInsert(customerObject);
	}
	
	public void dataInsert(Customer customerObject) throws SQLException {
		String query;
		//String table;
		if(customerObject.getType().compareToIgnoreCase("regular")==0)
			query="INSERT INTO REGULAR_CUSTOMER VALUES(?,?)";
			//table="REGULAR_CUSTOMER";
		else
			query="INSERT INTO CORPORATE_CUSTOMER VALUES(?,?)";
			//table="CORPORATE_CUSTOMER";
		
		//query="INSERT INTO ? VALUES(?,?)";
		Connection connectionObject=ConnectorJDBC.getConnnetionObject();
		PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
		//preparedStatementObject.setString(1, table);
		preparedStatementObject.setString(1, customerObject.getName());
		preparedStatementObject.setString(2, customerObject.getType());
//		System.out.println(customerObject.getName());
//		System.out.println(customerObject.getType());
		if(preparedStatementObject.executeUpdate()==1)
			System.out.println("Inserted");
		else
			System.out.println("Not Inserted");
	}
	
	public void display() throws SQLException {
		Connection connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="SELECT*FROM REGULAR_CUSTOMER";
		Statement statementObject=connectionObject.createStatement();
		ResultSet resultSetObject=statementObject.executeQuery(query);
		System.out.println("---------REGULAR CUSTOMER----------");
		while(resultSetObject.next()) {
			System.out.print(resultSetObject.getString(1));
			System.out.print("\t");
			System.out.print(resultSetObject.getString(2));
			System.out.println();
		}
		System.out.println("---------CORPORATE CUSTOMER----------");
		query="SELECT*FROM CORPORATE_CUSTOMER";
		resultSetObject=statementObject.executeQuery(query);
		while(resultSetObject.next()) {
			System.out.print(resultSetObject.getString(1));
			System.out.print("\t");
			System.out.print(resultSetObject.getString(2));
			System.out.println();
		}
	}
	
}
