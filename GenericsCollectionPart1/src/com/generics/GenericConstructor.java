package com.generics;

public class GenericConstructor <T>{

	T tObject;
	
	public GenericConstructor(T tObject) {
		super();
		this.tObject = tObject;
	}
	public GenericConstructor() {
		super();
	}
	public T gettObject() {
		return tObject;
	}
	public void settObject(T tObject) {
		this.tObject = tObject;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericConstructor<String> genericConstructorString=new GenericConstructor<>("Hello");
		System.out.println("String Object:"+genericConstructorString.gettObject());
		GenericConstructor<Integer> genericConstructorInteger=new GenericConstructor<>(10);
		System.out.println("Integer Object:"+genericConstructorInteger.gettObject());
	}

}
