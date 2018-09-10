package question3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookMap {

	public static void main(String[] args) {
		HashMap<String, Long> hashMapObject=new HashMap<String,Long>();
		String name;
		PhoneBookMap phoneBookMapObject=new PhoneBookMap();
		Scanner scannerObject=new Scanner(System.in);
		int choice;
		while(true){
			System.out.println("-----MENU----");
			System.out.println("1.Add New Phone Book Entry");
			System.out.println("2.Display");
			System.out.println("3.Search a Phone Number");
			System.out.println("4.Exit");
			System.out.print("Enter the Choice:");
			choice=Integer.parseInt(scannerObject.nextLine());
			switch(choice){
			case 1:
				phoneBookMapObject.insert(hashMapObject);
				break;
			case 2:
				phoneBookMapObject.display(hashMapObject);
				break;
			case 3:
				System.out.print("Enter Name:");
				name=scannerObject.nextLine();
				phoneBookMapObject.search(hashMapObject, name);
				break;
			case 4:System.exit(0);
				break;
			default:System.out.println("Enter Correct Choice");
			}
		}
	}
	public void insert(HashMap<String, Long> hashMapObject){
		Scanner scannerObject=new Scanner(System.in);
		String name;
		Long number;
		System.out.println("Enter Details:");
		System.out.print("Name:");
		name=scannerObject.nextLine();
		System.out.print("Number:");
		number=Long.parseLong(scannerObject.nextLine());
		hashMapObject.put(name,number);
	}
	
	public void display(HashMap<String, Long> hashMapObject){
		Set<String> setObject=hashMapObject.keySet();
		Iterator<String> iteratorObject=setObject.iterator();
		while(iteratorObject.hasNext()){
			String string=iteratorObject.next();
			System.out.println(string+"\t::\t"+hashMapObject.get(string));
		}
	}
	
	public void search(HashMap<String, Long> hashMapObject,String name){
		int flag=0;
		Set<String> setObject=hashMapObject.keySet();
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
			System.out.println(name+"\t::\t"+hashMapObject.get(name));
	}
}
