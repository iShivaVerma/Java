package question1;

import java.io.*;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass mainClassObject=new MainClass();
		Scanner scannerObject=new Scanner(System.in);
		String path="src\\question1\\Employee.txt";
		System.out.print("Enter number of Employees:");
		int number=Integer.parseInt(scannerObject.nextLine());
		Employee employeeObject[]=new Employee[number];
		mainClassObject.insert(employeeObject, number);
		try{
			mainClassObject.writeEmployeeObject(employeeObject, path);
			mainClassObject.readEmployee(path,number);
		}
		catch(Exception exceptionObject)
		{
			exceptionObject.printStackTrace();
		}
		System.out.println("Enter Employee ID for which the Data is to be Updated:");
		int employeeId=Integer.parseInt(scannerObject.nextLine());
		mainClassObject.update(employeeObject,employeeId,number);
		
		try{
			mainClassObject.writeEmployeeObject(employeeObject, path);
			mainClassObject.readEmployee(path,number);
		}
		catch(Exception exceptionObject)
		{
			exceptionObject.printStackTrace();
		}
	}
	
	public void insert(Employee employeeObject[],int number){
		int employeeId;
		String name;
		int age;
		Scanner scannerObject=new Scanner(System.in);
		for(int i=0;i<number;i++){
			System.out.println("Enter Details for Employee["+(i+1)+"]:");
			System.out.print("ID:");
			employeeId=Integer.parseInt(scannerObject.nextLine());
			System.out.println("Name:");
			name=scannerObject.nextLine();
			System.out.println("Age:");
			age=Integer.parseInt(scannerObject.nextLine());
			employeeObject[i]=new Employee(employeeId, name, age);
			System.out.println("-----------------Inserted-------------");
		}
	}
	
	public void display(Employee employeeObject){
		System.out.println(employeeObject);
	}
	
	public void writeEmployeeObject(Employee employeeObject[],String path) throws Exception{
		
		FileOutputStream fileOutputStreamObject =new FileOutputStream(new File(path));
		ObjectOutputStream objectOutputStreamObject=new ObjectOutputStream(fileOutputStreamObject);
		objectOutputStreamObject.writeObject(employeeObject);
		System.out.println("---------------Object Written------------------");
	}
	public void readEmployee(String path,int number)throws Exception
	{
		MainClass mainClassObject=new MainClass();
		FileInputStream fileInputStreamObject=new FileInputStream(new File(path));
		ObjectInputStream objectInputStreamObject =new ObjectInputStream(fileInputStreamObject);
		Employee employeeObject[]=(Employee[])objectInputStreamObject.readObject();
		for(int i=0;i<number;i++){
			mainClassObject.display(employeeObject[i]);
		}
		objectInputStreamObject.close();
	}
	public void update(Employee employeeObject[],int employeeId,int number){
		String name;
		int age;
		Scanner scannerObject=new Scanner(System.in);
		for(int i=0;i<number;i++){
			if(employeeId==employeeObject[i].getEmpID()){
				System.out.println("Enter Details for Employee["+(i+1)+"]:");
				System.out.print("ID:");
				employeeId=Integer.parseInt(scannerObject.nextLine());
				System.out.println("Name:");
				name=scannerObject.nextLine();
				System.out.println("Age:");
				age=Integer.parseInt(scannerObject.nextLine());
				employeeObject[i]=new Employee(employeeId, name, age);
				System.out.println("-----------------Updated-------------");
			}
		}
	}

}
