package com.generics;

public class ConcatenateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcatenateString concatenateString1=new ConcatenateString();
		concatenateString1.getData("Hello", " World!");
		System.out.println(concatenateString1.join());
	}

}
