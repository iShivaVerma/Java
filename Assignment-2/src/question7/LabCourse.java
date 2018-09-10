package question7;

public class LabCourse extends CollegeCourse {
	
	public LabCourse(String departments, int courseNumber, int credits) {
		super(departments, courseNumber, credits);
		// TODO Auto-generated constructor stub
	}

	public void addCourseFee(){
		setCourseFee(getCourseFee()+50);
	}
	
	public void display(){
		System.out.println("Course:"+this.getClass());
		System.out.println("Department:"+getDepartments());
		System.out.println("Course Fee:"+getCourseFee());
		System.out.println("Course Number:"+getCourseNumber());
		System.out.println("Credits:"+getCredits());
	}
}
