package question5AnotherWay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class PrintEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(100, "Thor"));
		empList.add(new Employee(101, "Black Panther"));
		empList.add(new Employee(102, "The Flash"));
		Consumer<Employee> consumerObject=new Consumer<Employee>() {
			
			@Override
			public void accept(Employee employeeObject) {
				// TODO Auto-generated method stub
				System.out.println(employeeObject);
			}
		};
		System.out.println("Using Anonymous Interface Object:-");
		empList.forEach(consumerObject);
		System.out.println("Using Lambda Expression:-");
		Consumer<Employee> consumerObject1=(employeeObject)->System.out.println(employeeObject);
		empList.forEach(consumerObject1);
		
	}

}
