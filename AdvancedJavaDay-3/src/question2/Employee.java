package question2;

public class Employee {

	private int employeeID;
	private String name;
	private String address;
	private String department;
	private float salary;
	
	public Employee() {
		super();
	}
	public Employee(int employeeID, String name, String address, String department, float salary) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.address = address;
		this.department = department;
		this.salary = salary;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", address=" + address + ", department="
				+ department + ", salary=" + salary + "]";
	}
	public boolean check(int employeeID){
		if(this.employeeID==employeeID)
			return false;
		else
			return true;
	}
}
