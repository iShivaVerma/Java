package question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("Hello");
		arrayList.add("World!");
		arrayList.add("How");
		arrayList.add("are");
		arrayList.add("you?");
		System.out.println("Length>3");
		Stream<String> stream=arrayList.stream();
		stream.filter((str)->str.length()>3).forEach(System.out::println);
		System.out.println("Upper Case:");
		Stream<String> streamUpper=arrayList.stream();
		String string=streamUpper.map((str)->str.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(string);
		
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(10);
		integers.add(4);
		integers.add(9);
		integers.add(7);
		integers.add(5);
		
		List<Integer> square=integers.stream().distinct().map(i->i*i).collect(Collectors.toList());
		System.out.println(square);
	}
}
