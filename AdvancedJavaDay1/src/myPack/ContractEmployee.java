package myPack;

public class ContractEmployee extends Employee {

	private int workHours;
	private int salary;
	private String type;
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(int empID,String name,int workHours, int salary, String type) {
		super(empID,name);
		this.workHours = workHours;
		this.salary = salary;
		this.type = type;
	}
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ContractEmployee [workHours=" + workHours + ", salary=" + salary + ", type=" + type + "]";
	}
	
	public void print(){
		System.out.println("--------------------");
		System.out.println("Employee Information:-");
		System.out.println("ID:"+getEmpID());
		System.out.println("Name:"+getName());
		System.out.println("Working Hours:"+getWorkHours());
		System.out.println("Salary:"+getSalary());
		System.out.println("Type:"+getType());
		System.out.println("--------------------");
	}
}
