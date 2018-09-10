package com.defaultDemo1;

public interface Male {

	default void sayHello(){
		System.out.println("sayHello() from Male Interface");
	}
}
