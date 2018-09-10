package myPack;

//Create a class

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Employee e[]=new Employee[2]; //Array of References
	System.out.println(e[0]);	//Points to Null Pointer
	e[0]=new Employee();	//Instantiation of reference
	System.out.println(e[0]);	//Points to some location
	}//end main

}//end MainClass
