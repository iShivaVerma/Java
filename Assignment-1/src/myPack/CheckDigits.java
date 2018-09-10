//Question-4

package myPack;
import java.util.*;

public class CheckDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=s.nextLong();
		int a[]=new int[9];
		int r;
		for (int i=8;i>=0;i--)
		{
			r=(int)(n%10);
			n/=10;
			a[i]=r;
		}
		for(int i=0;i<9;i++)
		{
			System.out.print(a[i]+",");
		}
		int sum[]=new int[9];
		System.out.println();
		for(int i=0;i<9;i++)
		{
			sum[i]=0;
			for (int j=0;j<9;j++)
			{
				if(i!=j)
					sum[i]=sum[i]+a[j];
			}
		}
		System.out.println();
		for(int i=0;i<9;i++)
			System.out.print(sum[i]+",");
		System.out.println();
		for(int i=0;i<9;i++)
		{
			if(a[i]==(sum[i]%10))
				System.out.println("Okay for:"+a[i]);
			else
				System.out.println("Not Okay for:"+a[i]);
		}
		s.close();
	}

}
