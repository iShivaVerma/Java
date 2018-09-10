package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vectorObject=new Vector<>();
		vectorObject.add("Thor");
		vectorObject.add("Iron Man");
		vectorObject.add("The Flash");
		
		System.out.println("Element at 0:"+vectorObject.get(0));
		System.out.println("----------------------");
		System.out.println("Using Iterator:");
		Iterator<String> iteratorObject=vectorObject.iterator();
		while(iteratorObject.hasNext()){
			System.out.println(iteratorObject.next());
		}
		
		System.out.println("----------------------");
		System.out.println("Using Enumeration:");
		Enumeration<String> enumerationObject=vectorObject.elements();
		while(enumerationObject.hasMoreElements()){
			System.out.println(enumerationObject.nextElement());
		}
	}

}
