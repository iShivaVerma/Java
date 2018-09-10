package com.generics;

public class Add implements GenericInterface<Integer, Integer>{

	Integer integerObject1;
	Integer integerObject2;
	@Override
	public void getData(Integer tObject, Integer uObject) {
		// TODO Auto-generated method stub
		integerObject1=tObject;
		integerObject2=uObject;
	}
	Integer sum(){
		return integerObject1+integerObject2;
	}
}
