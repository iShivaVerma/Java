package newPack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello World!";
		String str2="Hello";
		String str3=new String("Hello");
		String str4=new String("Hello");
		if(str1==str2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

		if(str3==str4)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		if(str3.equals(str4))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	
		System.out.println(str1.substring(2,5));
	}
}
