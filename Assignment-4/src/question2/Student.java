package question2;

import java.io.Serializable;

public class Student implements Serializable{

	private int ID;
	private String firstName;
	private String lastName;
	private int numberOfCreditHoursCompleted;
	public Student() {
		super();
	}
	public Student(int iD, String firstName, String lastName, int numberOfCreditHoursCompleted) {
		super();
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberOfCreditHoursCompleted = numberOfCreditHoursCompleted;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNumberOfCreditHoursCompleted() {
		return numberOfCreditHoursCompleted;
	}
	public void setNumberOfCreditHoursCompleted(int numberOfCreditHoursCompleted) {
		this.numberOfCreditHoursCompleted = numberOfCreditHoursCompleted;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", numberOfCreditHoursCompleted=" + numberOfCreditHoursCompleted + "]";
	}
	
}
