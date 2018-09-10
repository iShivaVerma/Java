package com.generics;

public class MultipleParameters<T,U> {

	T tObject;
	U uObject;

	public MultipleParameters() {
		super();
	}
	public MultipleParameters(T tObject, U uObject) {
		super();
		this.tObject = tObject;
		this.uObject = uObject;
	}
	public T gettObject() {
		return tObject;
	}
	public void settObject(T tObject) {
		this.tObject = tObject;
	}
	public U getuObject() {
		return uObject;
	}
	public void setuObject(U uObject) {
		this.uObject = uObject;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleParameters<Integer, String> multipleParametersObject=new MultipleParameters<Integer,String>(10,"Thor");
		MultipleParameters<Integer, String> multipleParametersObject2=new MultipleParameters<Integer,String>(20,"Iron Man");
		System.out.println("Emp Name:"+multipleParametersObject.getuObject());
		System.out.println("Emp ID:"+multipleParametersObject.gettObject());
		System.out.println("Emp Name:"+multipleParametersObject2.getuObject());
		System.out.println("Emp ID:"+multipleParametersObject2.gettObject());
	}

}
