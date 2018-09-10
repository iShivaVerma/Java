package question1;

import java.sql.Connection;
import java.sql.Date;
//import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import utility.ConnectorJDBC;

public class ManageProduct {

	public void addProduct(Product productObject) throws SQLException{
		Connection connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="INSERT INTO PRODUCT VALUES(?,?,?,TO_DATE(?,'DD-MM-YY'))";
		PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
		preparedStatementObject.setInt(1, productObject.getProductID());
		preparedStatementObject.setString(2, productObject.getName());
		preparedStatementObject.setFloat(3, productObject.getPrice());
		preparedStatementObject.setDate(4, productObject.getDate());
		if(preparedStatementObject.executeUpdate()==1)
			System.out.println("Inserted");
		else
			System.out.println("Not Inserted");
	}
	
	public void displayProduct(Date date) throws SQLException{
		Connection connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="SELECT * FROM PRODUCT WHERE TO_CHAR(DATES)=?";	//String comparison
		PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
		String dates;
		if(String.valueOf(date.getMonth()).length()==1)
			dates=date.getDate()+"-0"+date.getMonth()+"-"+(date.getYear()%100);
		else
			dates=date.getDate()+"-"+date.getMonth()+"-"+(date.getYear()%100);
		System.out.println(dates);
		preparedStatementObject.setString(1, dates);
		ResultSet resultSetObject=preparedStatementObject.executeQuery();
		while(resultSetObject.next()){
			System.out.print(resultSetObject.getInt(1));
			System.out.print("\t");
			System.out.print(resultSetObject.getString(2));
			System.out.print("\t");
			System.out.print(resultSetObject.getFloat(3));
			System.out.print("\t");
			System.out.print(resultSetObject.getDate(4));
			System.out.println();
		}
	}
	
	public void deleteProduct(int productID) throws SQLException{
		Connection connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="DELETE FROM PRODUCT WHERE PRODUCTID=?";
		PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
		preparedStatementObject.setInt(1, productID);
		ResultSet resultSetObject=preparedStatementObject.executeQuery();
		if(resultSetObject.next())
			System.out.println("!!Deleted!!");
		else
			System.out.println("Not Found");
	}
	
	public void displayProducts() throws SQLException{
		Connection connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="SELECT * FROM PRODUCT";
		Statement statementObject=connectionObject.createStatement();
		ResultSet resultSetObject=statementObject.executeQuery(query);
		while(resultSetObject.next()){
			System.out.println("-------------------------------------------------------");
			System.out.print("| "+resultSetObject.getInt(1)+"\t| ");
			System.out.print(resultSetObject.getString(2)+"\t| ");
			System.out.print(resultSetObject.getFloat(3)+"\t| ");
			System.out.print(resultSetObject.getDate(4)+" |");
			System.out.println();
		}
		System.out.println("-------------------------------------------------------");
	}
}
