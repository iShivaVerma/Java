package com.infogain.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DepartmentController {

	public static void main(String[] args) {
		DepartmentController departmentControllerObject=new DepartmentController();
		departmentControllerObject.add();
		departmentControllerObject.display();
	}
	Set<Department> departmentSet;
	
	public DepartmentController(){
		departmentSet=new HashSet<Department>();
	}
	public void add(){
		departmentSet.add(new Department("Accounting", "Pune"));
		departmentSet.add(new Department("Finance", "Noida"));
		departmentSet.add(new Department("IT", "Gurgaon"));
		departmentSet.add(new Department("Human Resource", "Bangalore"));
	}
	
	public void display(){
		System.out.println("---------------------------");
		System.out.println("Departments And Location");
		
		for (Department department : departmentSet) {
			System.out.println(department.getName()+" And "+department.getLocation());
		}
		
		System.out.println("---------------------------");
		System.out.println("Using Iterator:");
		Iterator<Department> iteratorObject=departmentSet.iterator();
		while(iteratorObject.hasNext()){
			System.out.println(iteratorObject.next());
		}
	}
}
