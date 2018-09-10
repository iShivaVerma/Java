package question6;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello! How are you?"; 
		String str2 ="Hi! I am fine.";
		UserString userStringObject=new UserString(str1,str2);
		UserString userString=new UserString("Hi", "MK");
		System.out.print("Count:");
		userStringObject.count();
		System.out.println("---------------------");
		System.out.print("FirstString:");
		System.out.println(userStringObject.getFirstString());
		System.out.print("SecondString:");
		System.out.println(userStringObject.getSecondString());
		userStringObject.concatString();
		System.out.println();
		System.out.println("---------------------");
		System.out.print("FirstString:");
		System.out.println(userString.getFirstString());
		System.out.print("SecondString:");
		System.out.println(userString.getSecondString());
		userString.copyString();
		System.out.println("---------------------");
		System.out.println("After Copy:-");
		System.out.print("FirstString:");
		System.out.println(userString.getFirstString());
		System.out.print("SecondString:");
		System.out.println(userString.getSecondString());
	}

}
