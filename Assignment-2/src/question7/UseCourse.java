package question7;

import java.util.Scanner;

public class UseCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UseCourse useCourseObject=new UseCourse();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Course Name:");
		String courseName=s.nextLine();
		switch(courseName){
			case "BIO":
				useCourseObject.createLabCourse(courseName);
				break;
			case "CHM":
				useCourseObject.createLabCourse(courseName);
				break;
			case "CIS":
				useCourseObject.createLabCourse(courseName);
				break;
			case "PHY":
				useCourseObject.createLabCourse(courseName);
				break;
				default:
					useCourseObject.createCollegeCourse(courseName);
		}
	s.close();	
	}
	public void createLabCourse(String courseName){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Course Number:");
		int courseNumber=Integer.parseInt(s.nextLine());
		System.out.println("Enter Course Credits:");
		int courseCredits=Integer.parseInt(s.nextLine());
		LabCourse labCourse=new LabCourse(courseName, courseNumber, courseCredits);
		labCourse.setCourseFee();		//TO Initialize the Fees
		labCourse.addCourseFee();
		labCourse.display();
		s.close();
	}
	public void createCollegeCourse(String courseName){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Course Number:");
		int courseNumber=Integer.parseInt(s.nextLine());
		System.out.println("Enter Course Credits:");
		int courseCredits=Integer.parseInt(s.nextLine());
		CollegeCourse collegeCourseObject=new CollegeCourse(courseName, courseNumber, courseCredits);
		collegeCourseObject.setCourseFee();		//TO Initialize the Fees
		collegeCourseObject.display();
		s.close();
	}

}
