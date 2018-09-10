package question6;

public class Employee {

	private int eid;
	private String name;
	private int age;
	
	public Employee() {
	}
	public Employee(int eid, String name, int age) {
		this.eid = eid;
		this.name = name;
		this.age = age;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + "]";
	}
}
