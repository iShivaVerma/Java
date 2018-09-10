package laptop;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LaptopRecords laptopRecordObject=new LaptopRecords();
		int choice;
		int serialNumber;
		String brandName;
		int cost;
		int searchSerailNumber;
		int minCost,maxCost;
		Scanner s=new Scanner(System.in);
		while(true){
		System.out.println("--------------MENU--------------");
		System.out.println("1.Add Laptop\n2.Search Laptop on Basis of Serial Number");
		System.out.println("3.Search Laptop on Basis of Cost Range\n4.Exit\nEnter your Choice:");
		choice=Integer.parseInt(s.nextLine());
		switch(choice){
			case 1:
				System.out.println("\nEnter the Laptop Serial Number:");
				serialNumber=Integer.parseInt(s.nextLine());
				System.out.println("\nEnter the Brand Name:");
				brandName=s.nextLine();
				System.out.println("\nEnter the Cost:");
				cost=Integer.parseInt(s.nextLine());
				laptopRecordObject.addLaptop(serialNumber, brandName, cost);
				break;
			case 2:
				System.out.println("\nEnter the Serial Number");
				searchSerailNumber=Integer.parseInt(s.nextLine());
				laptopRecordObject.searchOnBasisOfSerialNumber(searchSerailNumber);
				break;
			case 3:
				System.out.println("\nEnter the Cost Range\nMinimum Cost:");
				minCost=Integer.parseInt(s.nextLine());
				System.out.println("Max Cost:");
				maxCost=Integer.parseInt(s.nextLine());
				laptopRecordObject.searchOnBasisOfCostRange(minCost, maxCost);
				break;
			case 4:
				System.exit(0);
				break;
			default:System.out.println("Enter Correct Choice");
			}
		}
	}

}
