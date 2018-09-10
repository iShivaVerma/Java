package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayListObject=new ArrayList<>();
		arrayListObject.add("Hulk");
		arrayListObject.add("Spider Man");
		arrayListObject.add("Black Panther");
		System.out.println("Element Before Sorting:"+arrayListObject);
		Collections.sort(arrayListObject);
		System.out.println("Element After Sorting:"+arrayListObject);
		Collections.sort(arrayListObject,Collections.reverseOrder());
		System.out.println("Element After Sorting in Reverse Order:"+arrayListObject);
		Collections.reverse(arrayListObject);
		System.out.println("Element After Reversing:"+arrayListObject);
		System.out.println();
	}

}
