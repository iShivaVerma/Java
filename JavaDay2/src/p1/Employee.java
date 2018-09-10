package p1;

public class Employee {

	private int id;
	private String name;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmployeeDetails(int id,String name) {
		setId(id);
		setName(name);
	}
	public String getEmployeeDetails(){
		return "Employee ID:"+getId()+"\nEmployee Name:"+getName();
	}
}
