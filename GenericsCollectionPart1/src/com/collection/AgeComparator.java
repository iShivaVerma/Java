package com.collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee3>{

	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		// TODO Auto-generated method stub
		int age1=o1.getAge();
		int age2=o2.getAge();
		if(age1==age2)
			return 0;
		else if(age1>age2)
			return 1;
		else
			return -1;
	}

}
