package myPack;

import java.util.*;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the date:");
		date=s.nextInt();
		if(date>0 && date<=31 && !(date==11))
		{
				switch(date%10)
				{
				case 1:System.out.println(date+"st");
				break;
				case 2:System.out.println(date+"nd");
				break;
				case 3:System.out.println(date+"rd");
				break;
				default:System.out.println(date+"th");
				}
		}
		else if(date==11)
			System.out.println(date+"th");
		else
			System.out.println("Wrong Input for Date");
		s.close();
	}

}
