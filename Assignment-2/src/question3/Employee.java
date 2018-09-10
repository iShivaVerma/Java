package question3;

public class Employee {

	private char gender;
	private String name;
	private double yearsOfExperiance;
	private String designation;
	private double basicSalary;
	private String status;
	
	//Fresher Constructor
	public Employee(char gender, String name) {
		super();
		this.gender = gender;
		this.name = name; 
		this.designation="ASE";
		this.basicSalary=10000;
		this.status="Active";
	}

	//Experienced Constructor
	public Employee(char gender, String name, double yearsOfExperiance) {
		super();
		this.gender = gender;
		this.name = name;
		this.yearsOfExperiance = yearsOfExperiance;
		if(yearsOfExperiance>=3){
			this.designation = "ITA";
			this.basicSalary = 15000;
		}
		else{
			this.designation = "ASE";
			this.basicSalary = 10000;	
		}
		this.status = "Active";
	}

	//Setters and Getters
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getYearsOfExperiance() {
		return yearsOfExperiance;
	}
	public void setYearsOfExperiance(double yearsOfExperiance) {
		this.yearsOfExperiance = yearsOfExperiance;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	//Member Functions
	public double promoteEmployee(){
		switch(getDesignation()){
		case "ASE":
			setDesignation("ITA");
			setBasicSalary(getBasicSalary()*1.05);
			break;
		case "ITA":
			setDesignation("AST");
			setBasicSalary(getBasicSalary()*1.08);
			break;
		case "AST":
			setDesignation("ASC");
			setBasicSalary(getBasicSalary()*1.1);
			break;
		case "ASC":System.out.println("Top Designation");
			break;
		}
		return getBasicSalary();
	}
	public void applyForLWP(){
		setStatus("Inactive");
		setBasicSalary(0.0);
	}
}
