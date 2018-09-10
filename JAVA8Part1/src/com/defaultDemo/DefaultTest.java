package com.defaultDemo;

public class DefaultTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personObject;
		personObject=new Mike();
		personObject.print();
		personObject=new Sam();
		personObject.print();
		personObject.sayHello();
		
		Person.printAge();
	}

}
