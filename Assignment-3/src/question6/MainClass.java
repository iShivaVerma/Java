package question6;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentObject[]=new Student[5];
		for(int i=0;i<5;i++){
			studentObject[i]=new Student(100+i, 0);
		}
		Scanner s=new Scanner(System.in);
		int scores[]=new int[5];
		for(int i=0;i<5;i++){
			try{
				System.out.print("Enter Score for Student["+(i+1)+"]:");
				scores[i]=Integer.parseInt(s.nextLine());
				studentObject[i].insertScores(scores[i]);
				System.out.println(studentObject[i]);
			}
			catch (ScoreException scoreExceptionObject) {
				// TODO: handle exception
				System.out.println(scoreExceptionObject);
			}
		}
	}

}
