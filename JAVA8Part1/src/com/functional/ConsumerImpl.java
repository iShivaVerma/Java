package com.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listObject=Arrays.asList("Thor","Black Panther");
		ConsumerImpl consumerImpl=new ConsumerImpl();
		listObject.forEach(consumerImpl);
		
		Consumer<String> consumer=(i)->System.out.println(i+",");
		System.out.println(consumer);
	}

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.print(t+",");
	}

}
