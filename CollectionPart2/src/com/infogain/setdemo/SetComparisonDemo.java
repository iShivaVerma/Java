package com.infogain.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetComparisonDemo {

	public static void main(String[] args) {
		HashSet<String> hashSetObject=new HashSet<>();
		LinkedHashSet<String> linkedHashSetObject=new LinkedHashSet<>();
		TreeSet<String> treeSetObject=new TreeSet<>();
		String strings[]={"NetApp","Apple","Samsung"};
		for (String string : strings) {
			hashSetObject.add(string);
			linkedHashSetObject.add(string);
			treeSetObject.add(string);
		}
		System.out.println("No Order:"+hashSetObject); //Not in Order of Insertion
		System.out.println("With Order:"+linkedHashSetObject); //In Order of Insertion
		System.out.println("Sorted Elements:"+treeSetObject); //Sorted Order
		
		System.out.println("Elements using Iterator:");
		System.out.println("Hash Set:");
		Iterator<String> iteratorObject=hashSetObject.iterator();
		while(iteratorObject.hasNext())
			System.out.print(iteratorObject.next()+" ");
		
		System.out.println("\nLinked Hash Set:");
		iteratorObject=linkedHashSetObject.iterator();
		while(iteratorObject.hasNext())
			System.out.print(iteratorObject.next()+" ");
		
		System.out.println("\nTree Hash Set:");
		iteratorObject=treeSetObject.iterator();
		while(iteratorObject.hasNext())
			System.out.print(iteratorObject.next()+" ");
	}
}
