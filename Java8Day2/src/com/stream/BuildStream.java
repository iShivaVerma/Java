package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BuildStream {

	public static void main(String[] args) {
		Stream<Integer> streamObject=Stream.of(20,30,40);
		streamObject.forEach(i->System.out.println(i));
		Stream<Integer> streamObject1=Stream.of(new Integer[]{20,30,40});
		streamObject1.forEach((Integer i)->System.out.println(i));
		Stream<Integer> streamObject2=Stream.of(new Integer[]{20,30,40});
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		streamObject2.forEach((Integer i)->arrayList.add(i));
		System.out.println("Using Collection");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		
	}
}
