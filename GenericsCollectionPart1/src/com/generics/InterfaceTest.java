package com.generics;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add addObject=new Add();
		addObject.getData(10, 20);
		System.out.println("Sum:"+addObject.sum());
	}

}
