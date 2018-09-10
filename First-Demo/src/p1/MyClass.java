package p1;
import java.util.*;

public class MyClass {

	int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World!");
		MyClass c=new MyClass();
		c.takeUserInput(new Scanner(System.in));
		  
//		int a[]=new int[6];
//		a[-1]=5;	//Exception
//		a[8]=56;	//Exception
		
		c.sum();
	}

	void takeUserInput(Scanner s)
	{
		x=s.nextInt();
		System.out.println(x);
	}
	
	public byte sum()
	{
		return 10;
	}
}
