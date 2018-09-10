//Question-5

package myPack;

import java.util.Scanner;

public class TicketNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n = s.nextInt();
		if (n >= 100000 && n <= 999999) {
			int r = n % 10;
			n /= 10;
			int d = n % 7;
			if (d == r)
				System.out.println("True");
			else
				System.out.println("False");
		}
		s.close();
	}

}
