package question5;

public class EmployeeException extends Exception{

	String string;
	public EmployeeException(String string) {
		// TODO Auto-generated constructor stub
		this.string=string;
	}
	@Override
	public String toString() {
		return "EmployeeException [string=" + string + "]";
	}
	
}
