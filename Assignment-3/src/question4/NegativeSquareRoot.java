package question4;

import java.util.Scanner;

public class NegativeSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number=Integer.parseInt(s.nextLine());
		double squareRoot;
		if(number>=0){
			squareRoot=Math.sqrt(number);
			System.out.println("Square Root:"+squareRoot);
		}
		else
			throw new ArithmeticException("Square root is not possible for Negative Numbers");
		s.close();
	}

}
