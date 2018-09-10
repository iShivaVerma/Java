package question8;

abstract public class Child {

	private String name;
	private String gender;
	private int age;
	
	public Child(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public abstract void setAge(int age);
	public abstract void display();
}
