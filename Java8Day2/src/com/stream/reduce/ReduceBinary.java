package com.stream.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryOperator<Integer> sum=(i1,i2)->i1+i2;
		Integer identity=0;
		Stream<Integer> stream=Stream.of(10,6,7);
		int res=stream.reduce(identity, sum);
		System.out.println(res);
		
		final List<Integer> numbers=Arrays.asList(20,30,40);
		int sum1=numbers.stream().reduce(0,(num1,num2)->num1+num2);
		System.out.println(sum1);
	}

}
