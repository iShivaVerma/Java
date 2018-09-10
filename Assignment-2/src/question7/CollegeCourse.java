package question7;

public class CollegeCourse {

	private String departments;
	private int courseNumber;
	private int credits;
	private int courseFee;
	public CollegeCourse(String departments, int courseNumber, int credits) {
		super();
		this.departments = departments;
		this.courseNumber = courseNumber;
		this.credits = credits;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee() {
		this.courseFee = 120*this.credits;
	}
	public void setCourseFee(int fee) {
		this.courseFee +=fee;
	}
	public void display(){
		System.out.println("Department:"+getDepartments());
		System.out.println("Course Number:"+getCourseFee());
		System.out.println("Credits:"+getCredits());
		System.out.println("Course Fee:"+getCourseFee());
	}
}
