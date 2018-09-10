package myPack;

abstract public class Employee implements IPrint{

	private int empID;
	private String name;
	
	public Employee() {
		super();
	}

	public Employee(int empID, String name) {
		super();
		this.empID = empID;
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + "]";
	}
	
}
