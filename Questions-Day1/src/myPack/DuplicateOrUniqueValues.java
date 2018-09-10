package myPack;
import java.util.*;

public class DuplicateOrUniqueValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<array.length;i++)
		{
			System.out.print("Array["+(i+1)+"]:");
			array[i]=s.nextInt();
		}
		int dup[]=new int[5];
		int unique[]=new int[5];
		int flag;

		for(int i=0;i<array.length;i++)
		{
			flag=0;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					flag++;
				}
			}
			if(flag!=0)
				dup[i]=array[i];
			else
				unique[i]=array[i];
		}
		
		int c=0;
		System.out.println("Duplicate values:");
		for(int i=0;i<dup.length;i++)
		{
			if(dup[i]!=0)
			{
				System.out.print(dup[i]+",");
				c++;
			}
		}
		System.out.println();
		System.out.println("Unique values:");
		c=0;
		for(int i=0;i<unique.length;i++)
		{
			if(unique[i]!=0)
			{
				System.out.print(unique[i]+",");
				c++;
			}
		}
		s.close();
	}

}
