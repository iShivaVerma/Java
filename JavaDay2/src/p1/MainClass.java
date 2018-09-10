package p1;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee ID:");
		int id=Integer.parseInt(s.nextLine());
		System.out.println("Enter the Employee Name:");
		String name=s.nextLine();
		e.setEmployeeDetails(id, name);
		String details=e.getEmployeeDetails();
		System.out.println(details);
		s.close();
	}

}
