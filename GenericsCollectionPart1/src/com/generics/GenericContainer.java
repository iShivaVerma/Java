package com.generics;

public class GenericContainer <T>{

	T tObject;
	
	public T gettObject() {
		return tObject;
	}

	public void settObject(T tObject) {
		this.tObject = tObject;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericContainer<String> genericContainerString=new GenericContainer<>();
		genericContainerString.settObject("Hello");
		String stringObject=genericContainerString.gettObject();
		System.out.println("String Object:"+stringObject);
		//genericContainerString.settObject(10);		Compile Time Error
		
		GenericContainer<Integer> genericContainerInteger=new GenericContainer<>();
		genericContainerInteger.settObject(new Integer(10));
		Integer i=genericContainerInteger.gettObject();
		System.out.println("Integer Object:"+i);
		
	}

}
