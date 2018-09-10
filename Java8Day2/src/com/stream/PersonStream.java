package com.stream;

import java.util.ArrayList;

public class PersonStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> arrayList=new ArrayList<Person>();
		Person person1=new Person("Kevin",32);
		Person person2=new Person("Peter",30);
		arrayList.add(person1);
		arrayList.add(person2);
		arrayList.stream().forEach(System.out::println);
	}

}
