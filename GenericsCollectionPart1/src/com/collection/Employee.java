package com.collection;

public class Employee {

	private int empID;
	private String name;
	private String department;
	
	public Employee() {
		super();
	}
	public Employee(int empID, String name, String department) {
		super();
		this.empID = empID;
		this.name = name;
		this.department = department;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void print(){
		System.out.println("EmpID:"+empID+",Name:"+name+",Department:"+department);
	}
	
}
