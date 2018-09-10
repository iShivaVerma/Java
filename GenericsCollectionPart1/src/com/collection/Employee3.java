package com.collection;

public class Employee3{

	private String name;
	private int age;
	public Employee3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Employee3() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee3 [name=" + name + ", age=" + age + "]";
	}
	
}
