package question4;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Product {
	
	public static void main(String[] args) {
		Hashtable<String, String> hashtableObject=new Hashtable<String,String>();
		Product productObject=new Product();
		String name;
		Scanner scannerObject=new Scanner(System.in);
		int choice;
		while(true){
			System.out.println("-----MENU----");
			System.out.println("1.Add Product Record");
			System.out.println("2.Display Product Records");
			System.out.println("3.Search a Product");
			System.out.println("4.Remove a Product Record");
			System.out.println("5.Exit");
			System.out.print("Enter the Choice:");
			choice=Integer.parseInt(scannerObject.nextLine());
			switch(choice){
			case 1:
				productObject.insert(hashtableObject);
				break;
			case 2:
				productObject.display(hashtableObject);
				break;
			case 3:
				System.out.print("Enter Product ID:");
				name=scannerObject.nextLine();
				productObject.search(hashtableObject, name);
				break;
			case 4:
				System.out.print("Enter Product ID:");
				name=scannerObject.nextLine();
				productObject.remove(hashtableObject, name);
				break;
			case 5:System.exit(0);
				break;
			default:System.out.println("Enter Correct Choice");
			}
		}
	}
	public void insert(Hashtable<String, String> hashtableObject){
		Scanner scannerObject=new Scanner(System.in);
		String productId;
		String productName;
		System.out.println("Enter Details:");
		System.out.print("Product ID:");
		productId=scannerObject.nextLine();
		System.out.print("Product Name:");
		productName=scannerObject.nextLine();
		hashtableObject.put(productId, productName);
	}
	
	public void display(Hashtable<String, String> hashtableObject){
		Set<String> setObject=hashtableObject.keySet();
		Iterator<String> iteratorObject=setObject.iterator();
		while(iteratorObject.hasNext()){
			String string=iteratorObject.next();
			System.out.println(string+"\t::\t"+hashtableObject.get(string));
		}
	}
	
	public void search(Hashtable<String, String> hashtableObject,String name){
		int flag=0;
		Set<String> setObject=hashtableObject.keySet();
		Iterator<String> iteratorObject=setObject.iterator();
		while(iteratorObject.hasNext()){
			String string=iteratorObject.next();
			if(string.compareToIgnoreCase(name)==0){
				flag++;
			}
		}
		if(flag==0)
			System.out.println(name+" Not Found!!!");
		else
			System.out.println(name+"\t::\t"+hashtableObject.get(name));
	}
	
	public void remove(Hashtable<String, String> hashtableObject,String name){
		int flag=0;
		Set<String> setObject=hashtableObject.keySet();
		Iterator<String> iteratorObject=setObject.iterator();
		while(iteratorObject.hasNext()){
			String string=iteratorObject.next();
			if(string.compareToIgnoreCase(name)==0){
				flag++;
			}
		}
		if(flag==0)
			System.out.println(name+" Not Found!!!");
		else{
			hashtableObject.remove(name);
			System.out.println(name+" Removed!!");
		}
	}
}
