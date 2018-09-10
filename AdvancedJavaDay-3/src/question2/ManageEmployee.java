package question2;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageEmployee {

	static Employee employee;
	
	static ArrayList<Employee> arrayListObject;
	
	static{
		employee=new Employee();
		arrayListObject=new ArrayList<Employee>();
	}
	
	public void addEmployee(){
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter the Details:");
		System.out.print("Employee ID:");
		int employeeID=Integer.parseInt(scannerObject.nextLine());
		System.out.print("Name:");
		String name=scannerObject.nextLine();
		System.out.print("Address:");
		String address=scannerObject.nextLine();
		System.out.print("Department:");
		String department=scannerObject.nextLine();
		System.out.print("Salary:");
		float salary=Float.parseFloat(scannerObject.nextLine());
		Employee.
		employee=new Employee(employeeID, name, address, department, salary);
		ManageEmployee.arrayListObject.add(employee);
	}
}
