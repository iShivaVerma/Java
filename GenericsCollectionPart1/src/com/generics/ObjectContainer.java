package com.generics;

public class ObjectContainer {

	private Object object;
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectContainer objectContainerObject=new ObjectContainer();
		objectContainerObject.setObject("Ravi");
		System.out.println("String Object is:"+objectContainerObject.getObject());
		objectContainerObject.setObject(10);
		System.out.println("String Object is:"+objectContainerObject.getObject().toString());
		int i=(Integer)(objectContainerObject.getObject());
		System.out.println(i);
	}

}
