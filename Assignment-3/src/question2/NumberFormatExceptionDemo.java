package question2;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int number;
		System.out.println("Enter a number:");
		try{
			number=Integer.parseInt(s.nextLine());
			System.out.println(number);
		}
		catch(NumberFormatException numberFormatExceptionObject){
			System.out.println("Not an Integer");
		}
		s.close();
	}

}
