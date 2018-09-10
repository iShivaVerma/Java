package question5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(100, "Thor"));
		empList.add(new Employee(101, "Black Panther"));
		empList.add(new Employee(102, "The Flash"));
		Consumer consumerObject=new Consumer() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				Iterator<Employee> iteratorObject=empList.iterator();
				while(iteratorObject.hasNext())
					System.out.println(iteratorObject.next());
			}
		};
		System.out.println("Using Anonymous Interface Object:-");
		consumerObject.display();
		
		Consumer consumerObject1=()->{
			Iterator<Employee> iteratorObject=empList.iterator();
			while(iteratorObject.hasNext())
				System.out.println(iteratorObject.next());
		};
		System.out.println("Using Lambda Expression:-");
		consumerObject1.display();
	}

}
