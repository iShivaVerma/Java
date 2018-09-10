package question6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.ListIterator;
import java.util.Scanner;

public class ShoppingCart {

	static ArrayList<Item> systemCart=new ArrayList<>();
	
	static{
		systemCart.add(new Item(100, 2000, "Shirt"));
		systemCart.add(new Item(101, 2500, "Trouser"));
		systemCart.add(new Item(102, 3000, "Jackets"));
	}
	
	ArrayList<Item> userCart=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShoppingCart shoppingCartObject=new ShoppingCart();
		Scanner scannerObject=new Scanner(System.in);
		int choice;
		int choice1;
		int itemId;
		while(true){
			System.out.println("-------------MENU------------");
			System.out.println("1.System Cart");
			System.out.println("2.Insert Item");
			System.out.println("3.Remove Item");
			System.out.println("4.User Cart");
			System.out.println("5.Calculate Bill & Sort User Cart According to ItemID");
			System.out.println("6.Exit");
			System.out.print("Enter the choice:");
			choice=Integer.parseInt(scannerObject.nextLine());
			switch (choice) {
			case 1:
				shoppingCartObject.display(ShoppingCart.systemCart);
				break;
			case 2:
				System.out.println("Enter ItemId:");
				itemId=Integer.parseInt(scannerObject.nextLine());
				shoppingCartObject.addCart(itemId, shoppingCartObject.userCart);
				break;
			case 3:
				System.out.println("Enter ItemId:");
				itemId=Integer.parseInt(scannerObject.nextLine());
				shoppingCartObject.removeItem(itemId, shoppingCartObject.userCart);
				break;
			case 4:
				shoppingCartObject.display(shoppingCartObject.userCart);
				break;
			case 5:shoppingCartObject.sortUserCartAccordingToItemId(shoppingCartObject.userCart);
				break;
			case 6:
				System.exit(0);
				break;
			default:System.out.println("Enter Correct Choice");
				break;
			}
		}
	}
	public void addCart(int itemId,ArrayList<Item> userCart){
		int flag=0;
		ListIterator<Item> listIteratorObject=systemCart.listIterator();
		while(listIteratorObject.hasNext()){
			if(listIteratorObject.next().getItemId()==itemId){
				userCart.add(listIteratorObject.previous());
				flag++;
				break;
			}
		}
		if(flag==0)
			System.out.println("Item Not Found");
	}
	public void display(ArrayList<Item> arrayListObject){
		ListIterator<Item> listIteratorObject=arrayListObject.listIterator();
		while(listIteratorObject.hasNext())
			System.out.println(listIteratorObject.next());
	}
	
	public void sortUserCartAccordingToItemId(ArrayList<Item> arrayListObject){
		Collections.sort(arrayListObject,new ItemIdSorter());
		System.out.println(arrayListObject);
		calculateAmount(arrayListObject);
	}
	public void calculateAmount(ArrayList<Item> arrayListObject){
		int amount=0;
		ListIterator<Item> listIteratorObject=arrayListObject.listIterator();
		while(listIteratorObject.hasNext())
			amount+=listIteratorObject.next().getItemPrice();
		System.out.println("Amount:"+amount);
		System.out.println("Date:"+new Date().toString());
	}
	public void removeItem(int itemId,ArrayList<Item> userCart){
		ListIterator<Item> listIteratorObject=systemCart.listIterator();
		int flag=0;
		while(listIteratorObject.hasNext()){
			if(listIteratorObject.next().getItemId()==itemId){
				userCart.remove(listIteratorObject.previous());
				flag++;
				break;
			}
		}
		if(flag==0)
			System.out.println("Item not Found");
	}

}
