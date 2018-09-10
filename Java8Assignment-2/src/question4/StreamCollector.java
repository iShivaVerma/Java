package question4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollector {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(100,"Kevin"));
		employees.add(new Employee(101,"Jack"));
		employees.add(new Employee(102,"Trevor"));
		employees.add(new Employee(103,"Jones"));
		
		List<Employee> list=employees.stream().filter(emp->emp.getEid()%2==0).collect(Collectors.toList());
		System.out.println(list);
	}
}
