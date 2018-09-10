package question1;

public class Employee {

	private String name;
	private String department;
	
	public Employee() {
	}
	public String getName() {
		return name;
	}
	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}
	
}