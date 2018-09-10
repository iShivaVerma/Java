package question1;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		MainClass mainClassObject=new MainClass();
		int choice;
		Scanner scannerObject=new Scanner(System.in);
		ManageProduct manageProductObject=new ManageProduct();
		while(true){
			System.out.println("\n-------------MENU---------------");
			System.out.println("1.Add Product");
			System.out.println("2.Display Product info. by Date");
			System.out.println("3.Delete Product");
			System.out.println("4.Display All Products");
			System.out.println("5.Exit");
			System.out.println("Enter the choice:");
			choice=Integer.parseInt(scannerObject.nextLine());
			switch(choice){
			case 1:
				Product productObject=mainClassObject.insert();
				manageProductObject.addProduct(productObject);
				break;
			case 2:
				System.out.println("Enter Date:");
				System.out.print("Day:");
				int day=Integer.parseInt(scannerObject.nextLine());
				System.out.print("Month:");
				int month=Integer.parseInt(scannerObject.nextLine());
				System.out.print("Year:");
				int year=Integer.parseInt(scannerObject.nextLine());
				manageProductObject.displayProduct(new Date(year,month,day));
				break;
			case 3:
				System.out.print("Enter the Product ID:");
				int productID=Integer.parseInt(scannerObject.nextLine());
				manageProductObject.deleteProduct(productID);
				break;
			case 4:
				manageProductObject.displayProducts();
				break;
			case 5:
				System.exit(0);
				break;
				default:System.out.println("Enter correct choice");
			}
		}
	}
	
	public Product insert(){
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter Details:-");
		System.out.print("Product ID:");
		int productID=Integer.parseInt(scannerObject.nextLine());
		System.out.print("Name:");
		String name=scannerObject.nextLine();
		System.out.print("Price:");
		float price=Float.parseFloat(scannerObject.nextLine());
		System.out.println("Date:");
		System.out.print("Year:");
		int year=Integer.parseInt(scannerObject.nextLine());
		System.out.print("Month:");
		int month=Integer.parseInt(scannerObject.nextLine());
		System.out.print("Day:");
		int day=Integer.parseInt(scannerObject.nextLine());
		Date dateObject=new Date(year, month, day);
		Product productObject=new Product(productID, name, price, dateObject);
		return productObject;
	}

}
