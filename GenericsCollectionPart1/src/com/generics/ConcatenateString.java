package com.generics;

public class ConcatenateString implements GenericInterface<String,String>{

	String tObject;
	String uObject;

	@Override
	public void getData(String tObject, String uObject) {
		// TODO Auto-generated method stub
		this.tObject=tObject;
		this.uObject=uObject;
	}
	String join(){
		return tObject+uObject;
	}

}
