package question2;

public class NonUniqueEmployee extends Exception{

	String string;

	public NonUniqueEmployee(String string) {
		super();
		this.string = string;
	}
	@Override
	public String toString() {
		return "NonUniqueEmployee [string=" + string + "]";
	}
}
