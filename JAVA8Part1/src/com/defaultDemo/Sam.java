package com.defaultDemo;

public class Sam implements Person{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print Method of Sam Class");
	}
	@Override
	public void sayHello(){
		System.out.println("sayHello() Overridden in Sam class");
	}
	/*
	//@Override  - GIVES AN ERROR
	static void printAge(){
		System.out.println("printAge() from Sam Class");
	}*/

}
