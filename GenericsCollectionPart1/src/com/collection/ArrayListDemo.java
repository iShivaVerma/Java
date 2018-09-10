package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listObject=new ArrayList<String>();
		listObject.add("Hello");	//Add the Object
		listObject.add("World");	//Add the Object
		listObject.add("!");	//Add the Object
		
		System.out.println("---------------");
		System.out.println("For Loop:");
		for(int i=0;i<listObject.size();i++)
			System.out.println(listObject.get(i));
		System.out.println("---------------");
		System.out.println("Foreach Loop:");
		for (String string : listObject) {
			System.out.println(string);
		}
		
//		listObject.add(10);		Compile Time Error
//		Integer i=(Integer)listObject.get(1);
		System.out.println("---------------");
		System.out.println("Element at 0 index:"+listObject.get(0));//Index based read Operation
		System.out.println("---------------");
		System.out.println("By Iterator:-");
		Iterator<String> iteratorObject=listObject.iterator();
		while(iteratorObject.hasNext()){
			System.out.println(iteratorObject.next());
		}
		System.out.println("---------------");
		System.out.println("By ListIterator:");
		ListIterator<String> listIteratorObject=listObject.listIterator();
		
		while(listIteratorObject.hasNext()){
			System.out.println(listIteratorObject.next());
		}
		System.out.println("---------------");
		System.out.println("By ListIterator in Reverse using Previous:");
		//Retrieves the current index position
		while(listIteratorObject.hasPrevious()){
			System.out.println(listIteratorObject.previous());
		}
	}

}
