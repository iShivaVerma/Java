package question8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MainClass mainClassObject=new MainClass();
		mainClassObject.readFile();
	}
	public void readFile()throws Exception{
		File fileObject=new File("src\\question8\\MidTermScores.txt"); 
		FileInputStream fileInputStreamObject=new FileInputStream(fileObject);
		BufferedReader bufferedReaderObject=new BufferedReader(new InputStreamReader(fileInputStreamObject));
		String string;
		int number[]=new int[100];
		int i=0;
		while((string=bufferedReaderObject.readLine())!=null){
			number[i++]=Integer.parseInt(string);
		}
		categorize(number,i);
	}
	
	public void categorize(int numbers[],int size){
		int frequency[]=new int[30];
		for(int i=0;i<size;i++){
			switch(numbers[i]/10){
			case 0:frequency[0]++;
				break;
			case 1:frequency[1]++;
				break;
			case 2:frequency[2]++;
				break;
			case 3:frequency[3]++;
				break;
			case 4:frequency[4]++;
				break;
			case 5:frequency[5]++;
				break;
			case 6:frequency[6]++;
				break;
			case 7:frequency[7]++;
				break;
			case 8:frequency[8]++;
				break;
			case 9:frequency[9]++;
				break;
			case 10:frequency[10]++;
				break;
			}
		}
		
		for(int i=0;i<10;i++){
			System.out.print(i+"0-"+i+"9: ");
			for(int j=0;j<frequency[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("  100: ");
		for(int j=0;j<frequency[10];j++){
			System.out.print("*");
		}
		System.out.println();
	}

}
