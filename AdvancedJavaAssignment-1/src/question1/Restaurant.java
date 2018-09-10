package question1;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		int choice;
		int dishID;
		Restaurant restaurantObject=new Restaurant();
		Scanner scannerObject=new Scanner(System.in);
		while(true){
			System.out.println("----------Menu----------");
			System.out.println("1.Display Dishes");
			System.out.println("2.Search Dish");
			System.out.println("3.Exit");
			System.out.print("Enter the choice:");
			choice=Integer.parseInt(scannerObject.nextLine());
			switch (choice) {
			case 1:
				restaurantObject.display();
				break;

			case 2:
				System.out.print("Enter Dish ID:");
				dishID=Integer.parseInt(scannerObject.nextLine());
				restaurantObject.search(dishID);
				break;
			case 3:System.exit(0);
				break;
			default:
				System.out.println("Enter correct choice");
				break;
			}
		}
	}
	public void display(){
		Iterator<Dish> iteratorObject=Menu.menuList.iterator();
		while(iteratorObject.hasNext()){
			System.out.println(iteratorObject.next());
		}
	}
	
	public void search(int dishID){
		ListIterator<Dish> listIteratorObject=Menu.menuList.listIterator();
		int flag=0;
		while(listIteratorObject.hasNext()){
			if(listIteratorObject.next().getDishID()==dishID){
				System.out.println(listIteratorObject.previous());
				flag++;
				break;
			}
		}
		if(flag==0)
			System.out.println("Dish Not Found");
	}
}
