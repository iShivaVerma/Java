package question3;

import java.util.Scanner;

public class ArrayCustomSizeCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		try{
			int size=Integer.parseInt(s.nextLine());
			int[] array=new int[size];
			System.out.println("Array of size:"+size+" successfully created");
		}
		catch(NumberFormatException numberFormatExceptionObject){
			System.out.println("Size of the is Not an Integer");
			System.out.println("Array not Created");
		}
		catch(NegativeArraySizeException negativeArraySizeExceptionObject){
			System.out.println("Array index must be Positive");
			System.out.println("Array not Created");
		}
		s.close();
	}

}
