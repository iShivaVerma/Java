package question2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import question1.Dish;
import question1.Menu;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		Company companyObject=new Company();
		
		Scanner scannerObject=new Scanner(System.in);
		while(true){
			System.out.println("----------Menu----------");
			System.out.println("1.Ascending Order");
			System.out.println("2.Descending Order");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.print("Enter the choice:");
			choice=Integer.parseInt(scannerObject.nextLine());
			switch (choice) {
			case 1:
				companyObject.ascendingSort();
				break;
			case 2:
				companyObject.descendingSort();
				break;
			case 3:companyObject.display();
				break;
			case 4:System.exit(0);
				break;
			default:
				System.out.println("Enter correct choice");
				break;
			}
		}
	}
	public void ascendingSort(){
		Collections.sort(ManageEmployee.employeeList,new AscendingDateComparator());
		System.out.println(ManageEmployee.employeeList);
	}
	public void descendingSort(){
		Collections.sort(ManageEmployee.employeeList,new DescendingDateComparator());
		System.out.println(ManageEmployee.employeeList);
	}
	public void display(){
		Iterator<Employee> iteratorObject=ManageEmployee.employeeList.iterator();
		while(iteratorObject.hasNext()){
			System.out.println(iteratorObject.next());
		}
	}

}
