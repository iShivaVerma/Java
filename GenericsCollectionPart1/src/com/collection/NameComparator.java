package com.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee3> {

	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
