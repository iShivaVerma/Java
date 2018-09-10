package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee3> listObject=new ArrayList<>();
		listObject.add(new Employee3("Thor",30));
		listObject.add(new Employee3("Hulk",35));
		listObject.add(new Employee3("Iron Man",34));
		System.out.println("---------------");
		System.out.println("Elements Before Sorting:");
		System.out.println(listObject);
		Collections.sort(listObject,new AgeComparator());
		System.out.println("---------------");
		System.out.println("Elements After Sorting:");
		System.out.println(listObject);
		//Collections.sort(listObject,new AgeComparator());
	}

}
