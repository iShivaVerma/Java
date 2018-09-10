package com.lambda;

public class XyzImpl implements Xyz{

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Xyz xyzObject=new XyzImpl();
		xyzObject.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Inside Print Method");
	}

}
