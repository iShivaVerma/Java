package question4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import utility.ConnectorJDBC;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		int itemID;
		Item[] items=new Item[2];
		items[0]=new Item(100, "Pizza", 1);
		items[1]=new Item(101, "Pasta", 2);
		MainClass  mainClassObject=new MainClass();
		mainClassObject.insert(items);
		
		Scanner scannerObject=new Scanner(System.in);
		while(true){
			System.out.println("---------MENU---------");
			System.out.println("1.Show All Items");
			System.out.println("2.Find An Item");
			System.out.println("3.Update An Item");
			System.out.println("4.Add An Item");
			System.out.println("5.Delete An item");
			System.out.println("6.Delete all items");
			System.out.println("7.Exit");
			System.out.println("Enter your choice:");
			int choice=Integer.parseInt(scannerObject.nextLine());
			switch(choice){
			case 1:
				mainClassObject.display();
				break;
			case 2:
				System.out.print("Enter Item ID:");
				itemID=Integer.parseInt(scannerObject.nextLine());
				mainClassObject.search(itemID);
				break;
			case 3:
				System.out.print("Enter Item ID:");
				itemID=Integer.parseInt(scannerObject.nextLine());
				mainClassObject.update(itemID);
				break;
			case 4:
				mainClassObject.insert();
				break;
			case 5:
				System.out.print("Enter Item ID:");
				itemID=Integer.parseInt(scannerObject.nextLine());
				mainClassObject.delete(itemID);
				break;
			case 6:
				mainClassObject.deleteAll();
				break;
			case 7:System.exit(0);
				break;
			}
		}
	}
	
	public void insert(Item[] items) throws SQLException{
		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		for(int i=0;i<items.length;i++){
			int itemID=items[i].getItemId();
			String itemName=items[i].getItemName();
			int itemPrepTime=items[i].getItemPrepTime();
			String query="INSERT INTO ITEM VALUES(?,?,?)";
			PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
			preparedStatementObject.setInt(1, itemID);
			preparedStatementObject.setString(2, itemName);
			preparedStatementObject.setInt(3, itemPrepTime);
			int result=preparedStatementObject.executeUpdate();
			if(result>0)
				System.out.println("Inserted");
			else
				System.out.println("Not Inserted");
		}
		
	}
	
	public void insert() throws SQLException{
		Scanner scannerObject=new Scanner(System.in);
		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		System.out.println("Enter Details:");
		System.out.print("Item ID:");
		int itemID=Integer.parseInt(scannerObject.nextLine());
		System.out.print("Item Name:");
		String itemName=scannerObject.nextLine();
		System.out.print("Item Prep Time:");
		int itemPrepTime=Integer.parseInt(scannerObject.nextLine());
		String query="INSERT INTO ITEM VALUES(?,?,?)";
		PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
		preparedStatementObject.setInt(1, itemID);
		preparedStatementObject.setString(2, itemName);
		preparedStatementObject.setInt(3, itemPrepTime);
		int result=preparedStatementObject.executeUpdate();
		if(result>0)
			System.out.println("Inserted");
		else
			System.out.println("Not Inserted");
		scannerObject.close();
	}
	
	public void display() throws SQLException{
		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="SELECT*FROM ITEM";
		Statement statementObject=connectionObject.createStatement();
		ResultSet resultSetObject=statementObject.executeQuery(query);
		while(resultSetObject.next())
		{
			System.out.println(resultSetObject.getInt(1)+" "+resultSetObject.getString(2)+" "+resultSetObject.getInt(3));
		}
	}
	
	public void search(int itemID) throws SQLException{
		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="SELECT * FROM ITEM WHERE ITEMID=?";
		PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
		preparedStatementObject.setInt(1, itemID);
		ResultSet resultSetObject=preparedStatementObject.executeQuery();
		if(resultSetObject.next()){
			System.out.println("Found");
			System.out.println("Item ID:"+resultSetObject.getInt(1));
			System.out.println("Item Name:"+resultSetObject.getString(2));
			System.out.println("Item Prep Time:"+resultSetObject.getInt(3));
		}
		else
			System.out.println("Not Found");
	}
	
	public void update(int itemID) throws SQLException{
		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="UPDATE ITEM WHERE ITEMID=?";
		PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
		preparedStatementObject.setInt(1, itemID);
		ResultSet resultSetObject=preparedStatementObject.executeQuery();
		if(resultSetObject.next()){
			System.out.println("Found");
			System.out.println("!!Updated!!");
		}
		else
			System.out.println("Not Found");
	}
	public void delete(int itemID) throws SQLException{
		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="DELETE FROM ITEM WHERE ITEMID=?";
		PreparedStatement preparedStatementObject=connectionObject.prepareStatement(query);
		preparedStatementObject.setInt(1, itemID);
		ResultSet resultSetObject=preparedStatementObject.executeQuery();
		if(resultSetObject.next())
			System.out.println("!!Deleted!!");
		else
			System.out.println("Not Found");
	}
	public void deleteAll() throws SQLException{
		Connection connectionObject;
		connectionObject=ConnectorJDBC.getConnnetionObject();
		String query="DELETE FROM ITEM";
		Statement statementObject=connectionObject.createStatement();
		ResultSet resultSetObject=statementObject.executeQuery(query);
		if(resultSetObject.next())
			System.out.println("!!Deleted!!");
		else
			System.out.println("!!Not Deleted!!");
	}

}
