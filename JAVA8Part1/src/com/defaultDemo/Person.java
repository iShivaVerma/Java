package com.defaultDemo;

public interface Person {

	void print();
	default void sayHello(){
		System.out.println("Person Interface sayHello() method");
	}
	static void printAge(){
		System.out.println("printAge() from Person Interface");
	}
}
