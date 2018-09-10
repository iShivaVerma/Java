package question2;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamFilterTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("Kevin", "IT",30000.50));
		employees.add(new Employee("Jack", "HR",25000.60));
		employees.add(new Employee("Trevor", "IT",9888.50));
		employees.add(new Employee("Amit", "Sales",6750.80));
		Stream<Employee> streamDisplay=employees.stream();
		streamDisplay.forEach(System.out::println);
		System.out.print("Total Sum Of Salary:");
		double sum = employees.stream().map(Employee::getSalary).mapToDouble(Double::intValue).sum();
		System.out.println(sum);
		
		System.out.println("Salary>20000:");
		Stream<Employee> streamSalary1=employees.stream();
		streamSalary1.filter((emp)->emp.getSalary()>20000D).forEach(System.out::println);
		System.out.println("Salary<20000:");
		Stream<Employee> streamSalary2=employees.stream();
		streamSalary2.filter((emp)->emp.getSalary()<20000D).forEach(System.out::println);
		System.out.println("Names Starting with 'A':");
		Stream<Employee> streamName=employees.stream();
		streamName.filter((emp)->emp.getName().startsWith("A")).forEach(System.out::println);
		System.out.println("Name Size greater than 5:");
		Stream<Employee> streamNameSize=employees.stream();
		streamNameSize.filter((emp)->emp.getName().length()>5).forEach(System.out::println);
		System.out.println("Name in Upper Case:");
		Stream<Employee> streamNameUpper=employees.stream();
		streamNameUpper.map((emp)->emp.getName().toUpperCase()).forEach(System.out::println);
	}
}
