package question5;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employeeObjectLow=new Employee(100, 50);
		Employee employeeObjectMid=new Employee(101, 500);
		Employee employeeObjectHigh=new Employee(102, 6000);
		try{
			System.out.println("-----------Low------------");
			employeeObjectLow.check();
			System.out.println(employeeObjectLow);
		}
		catch(EmployeeException employeeExceptionObject){
			System.out.println(employeeExceptionObject);
		}
		try{
			System.out.println("------------Mid-------------");
			employeeObjectMid.check();
			System.out.println(employeeObjectMid);
		}
		catch(EmployeeException employeeExceptionObject){
			System.out.println(employeeExceptionObject);
		}
		try{
			System.out.println("---------------High---------------");
			employeeObjectHigh.check();
			System.out.println(employeeObjectHigh);
		}
		catch(EmployeeException employeeExceptionObject){
			System.out.println(employeeExceptionObject);
		}
	}

}
