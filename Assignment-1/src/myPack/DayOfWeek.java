//Question-3

package myPack;

import java.util.*;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int M, D, Y;
		int m;
		System.out.println("Enter Month:");
		M = s.nextInt();
		System.out.println("Enter Day:");
		D = s.nextInt();
		System.out.println("Enter Year:");
		Y = s.nextInt();
		if (M >= 1 && M <= 12 && D > 0 && D <= 31 && Y > 0) 
		{
			if (M >= 3)
				m = M - 2;
			else
				m = M + 10;

			int d = D;
			int y = Y;
			int c = (Y / 100);
			//System.out.println(c+","+y);

			int A = (13 * m - 1);
			int B = y / 4;
			int C = c / 4;
			D = A + B + C + d + y - (2 * c);
			int R = D % 7;

			//System.out.println(D+","+R);
			switch (R) 
			{
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			}
		}
		else
			System.out.println("Not a valid Input");
		s.close();
	}

}
