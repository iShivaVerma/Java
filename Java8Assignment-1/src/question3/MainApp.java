package question3;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface myInterfaceObject= new MyInterface() {
			
			@Override
			public void myTest() {
				// TODO Auto-generated method stub
				System.out.println("myTest() method of Anonymous Interface Object");
			}
		};
		
		MyInterface myInterfaceObject1=()->System.out.println("myTest() method of Lambda Expression");
		
		myInterfaceObject.myTest();
		myInterfaceObject1.myTest();
		
		MyInterfaceImplementation myInterfaceImplementationObject=new MyInterfaceImplementation();
		myInterfaceImplementationObject.myTest();
	}

}
