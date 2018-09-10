package question2;

import java.util.Date;

public class Employee {

	private int empID;
	private String empName;
	private Date empDOB;
	
	public Employee() {
		super();
	}
	public Employee(int empID, String empName, Date empDOB) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empDOB = empDOB;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empDOB=" + empDOB + "]";
	}
}
