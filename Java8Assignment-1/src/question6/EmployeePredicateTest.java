package question6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeePredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(100, "Thor", 51));
		empList.add(new Employee(101, "Tony Stark", 33));
		empList.add(new Employee(102, "Jack Hughman", 32));
		empList.add(new Employee(103, "Jonny Depp", 29));
		empList.add(new Employee(104, "AntMan", 50));
		Predicate<Employee> predicateLength=(length)->length.getName().length()>5;
		Predicate<Employee> predicateStart=(start)->start.getName().startsWith("A");
		Predicate<Employee> predicateAge1=(age)->age.getAge()>=50;
		Predicate<Employee> predicateAge2=(age)->age.getAge()<40;
		Predicate<Employee> predicateAge3=(age)->age.getAge()<30 || age.getAge()==50;
		System.out.println("Name with Length>5");
		filter(empList, predicateLength);
		System.out.println("Names Starting with 'A'");
		filter(empList, predicateStart);
		System.out.println("Employees having Age>=50");
		filter(empList, predicateAge1);
		System.out.println("Employees having Age<40");
		filter(empList, predicateAge2);
		System.out.println("Employees having Age<30 OR Age==50");
		filter(empList, predicateAge3);
	}
	public static void filter(List<Employee> emp,Predicate<Employee> condition){
		for(Employee employeeObject: emp){
			if(condition.test(employeeObject))
				System.out.println(employeeObject);
		}
	}
}
