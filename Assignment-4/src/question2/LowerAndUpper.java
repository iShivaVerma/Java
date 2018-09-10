package question2;

import java.io.*;
import java.util.Scanner;

public class LowerAndUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LowerAndUpper lowerAndUpperObject=new LowerAndUpper();
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter the number of Students:");
		int number=Integer.parseInt(scannerObject.nextLine());
		Student studentLowerClassObject[]=new Student[number];
		Student studentObject[]=new Student[number];
		Student studentUpperClassObject[]=new Student[number];
		String pathLowerClassMan="src\\question2\\LowerClassMan.txt";
		String pathUpperClassMan="src\\question2\\UpperClassMan.txt";
		//Insert Student Data
		lowerAndUpperObject.insert(studentObject, number);

		int k=0,j=0;
		for(int i=0;i<number;i++){
			if(studentObject[i].getNumberOfCreditHoursCompleted()<60){
				studentLowerClassObject[j++]=studentObject[i];
			}
			else if(studentObject[i].getNumberOfCreditHoursCompleted()>=60){
				studentUpperClassObject[k++]=studentObject[i];
			}
		}//end for
		
		//LowerClassObject Storage in LowerClassMan.txt
		try{
			lowerAndUpperObject.writeStudentObject(studentLowerClassObject, pathLowerClassMan);
		}
		catch(Exception exceptionObject){
			exceptionObject.printStackTrace();
		}
		
		//UpperClassObject Storage in UpperClassMan.txt
		try{
			
			lowerAndUpperObject.writeStudentObject(studentUpperClassObject, pathUpperClassMan);
		}
		catch(Exception exceptionObject){
			exceptionObject.printStackTrace();
		}
		
		//Details:-
		System.out.println("Lower Class Man Details:");
		try{
			lowerAndUpperObject.readStudentObject(pathLowerClassMan,j);
		}
		catch (Exception exceptionObject) {
			exceptionObject.printStackTrace();
		}
		System.out.println("Upper Class Man Details:");
		try{
			lowerAndUpperObject.readStudentObject(pathUpperClassMan,k);
		}
		catch (Exception exceptionObject) {
			exceptionObject.printStackTrace();
		}
		
	}//end main
	public void insert(Student students[],int number){
		int studentId;
		String firstName;
		String lastName;
		int credit;
		Scanner scannerObject=new Scanner(System.in);
		for(int i=0;i<number;i++){
			System.out.println("Enter Details for Student["+(i+1)+"]:");
			System.out.print("Student ID:");
			studentId=Integer.parseInt(scannerObject.nextLine());
			System.out.println("First Name:");
			firstName=scannerObject.nextLine();
			System.out.println("Last Name:");
			lastName=scannerObject.nextLine();
			System.out.println("Number of Credit Hours Completed:");
			credit=Integer.parseInt(scannerObject.nextLine());
			students[i]=new Student(studentId, firstName, lastName, credit);
			System.out.println("-----------------Inserted-------------");
		}
	}//end insert
	
	public void display(Student studentObject){
		System.out.println(studentObject);
	}//end display
	
	public void writeStudentObject(Student[] studentObject,String path) throws Exception{
		
		FileOutputStream fileOutputStreamObject =new FileOutputStream(new File(path),true);
		ObjectOutputStream objectOutputStreamObject=new ObjectOutputStream(fileOutputStreamObject);
		objectOutputStreamObject.writeObject(studentObject);
		System.out.println("---------------Object Written------------------");
	}//end writeStudentObject
	
	public void readStudentObject(String path,int number)throws Exception
	{
		LowerAndUpper lowerAndUpperObject=new LowerAndUpper();
		FileInputStream fileInputStreamObject=new FileInputStream(new File(path));
		ObjectInputStream objectInputStreamObject =new ObjectInputStream(fileInputStreamObject);
		Student studentObject[]=(Student[])objectInputStreamObject.readObject();
		for(int i=0;i<number;i++)
			lowerAndUpperObject.display(studentObject[i]);
	}//end readStudentObject

}
