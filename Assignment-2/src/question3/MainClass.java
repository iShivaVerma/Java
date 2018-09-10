package question3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass mainClassObject=new MainClass();
		Employee fresherObject1=new Employee('M', "Thanos");
		Employee fresherObject2=new Employee('M', "Black Panther");
		Employee fresherObject3=new Employee('M', "The Flash");
		Employee experiencedObject1=new Employee('M', "Green Goblin",4);
		Employee experiencedObject2=new Employee('M', "Spider Man",10);
		Employee experiencedObject3=new Employee('M', "Iron Man",2);
		
		System.out.println("Information before Promotion");
		mainClassObject.display(fresherObject1);
		System.out.println("Information after Promotion");
		fresherObject1.promoteEmployee();
		mainClassObject.display(fresherObject1);
		System.out.println("Information before LWP");
		mainClassObject.display(fresherObject2);
		fresherObject2.applyForLWP();
		System.out.println("Information after LWP");
		mainClassObject.display(fresherObject2);
	}
	public void display(Employee employeeObject){
		System.out.println("------------------------------------");
		System.out.println("Employee Details:-");
		System.out.println("Name:"+employeeObject.getName());
		System.out.println("Gender:"+employeeObject.getGender());
		System.out.println("Designation:"+employeeObject.getDesignation());
		System.out.println("Status:"+employeeObject.getStatus());
		System.out.println("Years of Experience:"+employeeObject.getYearsOfExperiance());
		System.out.println("Basic Salary:"+employeeObject.getBasicSalary());
		System.out.println("------------------------------------");
	}

}
