package com.generics;

public class GenericMethod {

	public static <E> void print(E[] e){
//		if(E instanceof Integer){
//			for (E e2 : e) {
//				System.out.print(e2+",");
//			}
//		System.out.println();
//		}
//		else{
//			for (E e2 : e) {
//				System.out.print(e2);
//			}
//		System.out.println();
//		}
		
		for (E e2 : e) {
			System.out.print(e2+",");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
	
		Integer[] num={20,30,40};
		GenericMethod.print(num);	//Static method Call
		Character stream[]={'J','A','V','A'};
		GenericMethod.print(stream);	//Static method Call
	}
}
