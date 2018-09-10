package com.lambda;

public class LambdaTestMain {

	public static void main(String[] args) {
		
		MathOperation mathOperation=(x,y)->x+y;
		MathOperation1 mathOperation1=(a,b)->a-b;
		Printable printable=()->System.out.println("Hello");
		System.out.println(mathOperation.operation(4, 5));
		System.out.println(mathOperation1.sub(5, 4));
		printable.disp();
	}
}
