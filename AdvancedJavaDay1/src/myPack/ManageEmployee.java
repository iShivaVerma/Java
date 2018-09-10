package myPack;

public class ManageEmployee {

	static Employee employeeArray[]=new Employee[3];
	static{
		employeeArray[0]=new RegularEmployee(100,"King",10, 20000, "Regular");
		employeeArray[1]=new RegularEmployee(101,"Mike",9, 25000, "Regular");
		employeeArray[2]=new ContractEmployee(102,"Neo",8, 21000, "Contract");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<employeeArray.length;i++)
			employeeArray[i].print();
		System.out.println("\n");
		for (Employee employee : employeeArray) {
			employee.print();
		}
	}

}
