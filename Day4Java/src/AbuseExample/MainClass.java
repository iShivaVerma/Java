package AbuseExample;

import java.util.Scanner;

public class MainClass {

	String abusiveWords[]={"Dog","Idiot","Duffer"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MainClass mainClassObject=new MainClass();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String sentence=s.nextLine();
		mainClassObject.filterSentence(sentence);
		s.close();
	}
	public void filterSentence(String sentence){
		String words[];
		int flag;
		words=sentence.split(" ");
		for(int i=0;i<words.length;i++)
		{
			flag=0;
			for(int j=0;j<abusiveWords.length;j++)
			{
				
				if(words[i].equalsIgnoreCase(abusiveWords[j]))
				{
					for(int k=0;k<abusiveWords[j].length();k++)
					{
						System.out.print("#");
						flag++;
					}
					System.out.print(" ");
				}
			}
			if(flag==0)
				System.out.print(words[i]+" ");
		}
	}
}
