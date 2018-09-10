package question5;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Employee> vectorObject=new Vector<>();
		MainClass mainClassObject=new MainClass();
		Scanner scannerObject=new Scanner(System.in);
		while(true){
			System.out.println("----------MENU----------");
			System.out.println("1.Input");
			System.out.println("2.Display");
			System.out.println("3.Exit");
			System.out.println("Enter the Choice:");
			int choice=Integer.parseInt(scannerObject.nextLine());
			switch(choice){
			case 1:
				mainClassObject.addInput(vectorObject);
				break;
			case 2:
				mainClassObject.display(vectorObject);
				break;
			case 3:
				System.exit(0);
				break;
				default:System.out.println("Enter correct Choice");
			}
		}
		
	}
	public void addInput(Vector<Employee> vector){
		vector.addElement(new Employee(100, "Jack", "Bhutan"));
		vector.addElement(new Employee(101, "Mack", "London"));
		vector.addElement(new Employee(102, "Jerry", "New Jersey"));
	}
	public void display(Vector<Employee> vector){
		Enumeration<Employee> enumerationObject=vector.elements();
		while(enumerationObject.hasMoreElements())
			System.out.println(enumerationObject.nextElement());
	}

}
