package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> arrayListObject=new ArrayList<Employee>();
		arrayListObject.add(new Employee(100,"Thor","HR"));
		arrayListObject.add(new Employee(101,"Iron Man","IT"));
		arrayListObject.add(new Employee(102,"Hulk","Sales"));
		Iterator<Employee> iteratorObject=arrayListObject.iterator();
		System.out.println("------------------");
		System.out.println("Using Iterator:");
		while(iteratorObject.hasNext())
			iteratorObject.next().print();
		System.out.println("------------------");
		System.out.println("Using Foreach Loop:");
		for (Employee employee : arrayListObject) {
			employee.print();
		}
	}

}
