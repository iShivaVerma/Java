package question4;

import java.io.*;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path="src\\question4\\Dishes.txt";
		MainClass mainClassObject=new MainClass();
		Dish dishObject[]=new Dish[4];
		dishObject[0]=new Dish(100, "Pizza", 2);
		dishObject[1]=new Dish(101, "Noodles", 3);
		dishObject[2]=new Dish(102, "Burger", 1);
		
		try{
			mainClassObject.saveDishes(dishObject, path);
			mainClassObject.readDishes(path,3);
		}
		catch(Exception exceptionObject){
			exceptionObject.printStackTrace();
		}
		
		Scanner scannerObject=new Scanner(System.in);
		int id;
		String name;
		int time;
		System.out.println("Enter Dish Details:");
		System.out.print("Dish ID:");
		id=Integer.parseInt(scannerObject.nextLine());
		System.out.print("Dish Name:");
		name=scannerObject.nextLine();
		System.out.print("Time:");
		time=Integer.parseInt(scannerObject.nextLine());
		dishObject[3]=new Dish(id, name, time);
		try{
			mainClassObject.saveDishes(dishObject, path);
			mainClassObject.readDishes(path,4);
		}
		catch(Exception exceptionObject){
			exceptionObject.printStackTrace();
		}
	}
	public void saveDishes(Dish dishes[],String path)throws Exception{
		FileOutputStream fileOutputStreamObject=new FileOutputStream(new File(path));
		ObjectOutputStream objectOutputStreamObject=new ObjectOutputStream(fileOutputStreamObject);
		objectOutputStreamObject.writeObject(dishes);
	}
	public void readDishes(String path,int number)throws Exception{
		FileInputStream fileInputStreamObject=new FileInputStream(new File(path));
		ObjectInputStream objectInputStreamObject=new ObjectInputStream(fileInputStreamObject);
		Dish dishes[]=(Dish[])objectInputStreamObject.readObject();
		MainClass mainClassObject=new MainClass();
		for(int i=0;i<number;i++)
			mainClassObject.display(dishes[i]);
	}
	private void display(Dish dish) {
		System.out.println(dish);
	}

}
