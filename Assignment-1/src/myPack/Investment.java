//Question-7

package myPack;
import java.util.*;

public class Investment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Amount of Money to be Invested:");
		float investedMoney=Float.parseFloat(s.nextLine());
		float previousInvestment=0;
		float total;
		for(int i=1;i<=20;i++)
		{
			System.out.print("For "+i+" year:");
			total=investedMoney*1.05F+previousInvestment*1.02F;
			previousInvestment=total;
			System.out.println(total);
		}
		s.close();
	}

}
