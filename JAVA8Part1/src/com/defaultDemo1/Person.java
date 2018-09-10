package com.defaultDemo1;

public interface Person {

	default void sayHello(){
		System.out.println("sayHello() from Person Interface");
	}
}
