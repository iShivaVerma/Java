package question5;

public class Employee {

	private int idNum;
	private int hourlyWage;
	
	public Employee(int idNum, int hourlyWage){
		super();
		this.idNum = idNum;
		this.hourlyWage = hourlyWage;
	}
	
	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public void check() throws EmployeeException{
		if(getHourlyWage()>5000 || getHourlyWage()<60)
			throw new EmployeeException("ID Number:"+getIdNum()+",Hourly Wage:"+getHourlyWage());
	}

	@Override
	public String toString() {
		return "Employee [idNum=" + idNum + ", hourlyWage=" + hourlyWage + "]";
	}
	
}
	
