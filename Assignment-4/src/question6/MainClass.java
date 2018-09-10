package question6;

import java.io.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass mainClassObject=new MainClass();
		try{
			mainClassObject.readObject();
		}
		catch (Exception exceptionObject) {
			exceptionObject.printStackTrace();
		}
	}
	public void readObject()throws Exception{
		File file=new File("src\\question6\\input.txt");
		FileInputStream fileInputStreamObject=new FileInputStream(file);
		BufferedReader bufferedReaderObject=new BufferedReader(new InputStreamReader(fileInputStreamObject));
		String string;
		int number[]=new int[4];
		int k;
		while((string=bufferedReaderObject.readLine())!=null){
			String strings[]=string.split(" and ");
			for(int i=0;i<strings.length;i++){
				String words[]=strings[i].split("/");
				k=0;
				for(String j:words){
					try{
						number[k++]=Integer.parseInt(j);
					}
					catch(NumberFormatException n){
						System.out.println(n);
					}
					System.out.println(number[k]);
				}
				
				//System.out.println(words[i]+",");
				/*for(int j=0;j<words.length;j++){
					if(words[j].contains("[0-9]+")==false)
						System.out.println(Integer.parseInt(words[j]));
					else
						System.out.println(words[j]);
				}*/
			}
		}
		MainClass mainClassObject=new MainClass();
	}
	
	public void display(int numbers[][]){
		for (int[] number : numbers) {
			for (int i : number) {
				System.out.print(i+",");
			}
			System.out.println();
		}
	}
	
	public void add(){
		
	}

}
