package com.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ANONYMOUS INTERFACE
		Xyz xyzObject=new Xyz() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Inside Print");
			}
		};
		xyzObject.print();
		
		//LAMBDA IMPLEMENTATION
		Xyz xyz1=()->System.out.println("Hi");
		xyz1.print();
		
		//FUNCTIONAL INTERFACE -> ONLY CONTAINS 1 ABSTRACT METHOD
		//LAMBDA EXPRESSIONS ARE ONLY VALID FOR FUNCTIONAL INTERFACE
	}

}
