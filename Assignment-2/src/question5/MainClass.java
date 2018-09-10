package question5;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Dish ID:");
		int input=Integer.parseInt(s.nextLine());
		Restaurant restaurantObject=new Restaurant();
		System.out.println(restaurantObject.getDish(input));
	}

}
