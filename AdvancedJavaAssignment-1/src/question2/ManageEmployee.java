package question2;

import java.util.Date;
import java.util.LinkedList;

public class ManageEmployee {

	static LinkedList<Employee> employeeList=new LinkedList<>();
	static{
		employeeList.add(new Employee(100, "Tom", new Date(1996,02,29)));
		employeeList.add(new Employee(101, "Jerry", new Date(1995,04,30)));
		employeeList.add(new Employee(102, "Nick", new Date(1997,01,21)));
	}
}
