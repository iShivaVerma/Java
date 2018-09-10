package myPack;

public class EmploeeRecords {

	Employee arr[]=new Employee[5];
	int counter=0;
	public void addEmployee(Employee e)
	{
		counter++;
		arr[counter]=e;
	}
	public void printEmployeeRecords()
	{
		for(int i=0;i<=counter;i++){
			System.out.println("Emp ID:"+arr[i].getId());
			System.out.println("Emp ID:"+arr[i].getName());
		}
	}
}
