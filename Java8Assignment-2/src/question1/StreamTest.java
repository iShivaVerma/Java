package question1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("Kevin", "IT"));
		employees.add(new Employee("Jack", "HR"));
		employees.add(new Employee("Trevor", "IT"));
		employees.add(new Employee("Jones", "Sales"));
		
		Stream<Employee> stream=employees.stream();
		stream.forEach(System.out::println);
	}

}
