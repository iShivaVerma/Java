package com.defaultDemo1;
//DIAMOND PROBLEM


public class Sam implements Male,Person{

	public static void main(String[] args) {
		Sam samObject=new Sam();
		samObject.sayHello();
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Overridden from Male Interface");
		Male.super.sayHello();
	}
	/*@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Overridden from Male Interface");
		Person.super.sayHello();
	}*/
}
