package question5;

import java.io.*;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass mainClassObject=new MainClass();
		try{
			mainClassObject.readFile();
		}
		catch(Exception exceptionObject){
			exceptionObject.printStackTrace();
		}
		
	}
	public void readFile()throws Exception{
		File fileObject=new File("D:\\demo\\player.txt");
		FileInputStream fileInputStreamObject=new FileInputStream(fileObject);
		BufferedReader bufferedReaderObject=new BufferedReader(new InputStreamReader(fileInputStreamObject));
		String string;
		int count=0;
		while((string=bufferedReaderObject.readLine())!=null){
			count++;
		}
		System.out.println("Number of Lines in File:"+count);
		System.out.println("Absolute File Path:"+fileObject.getAbsolutePath());
		System.out.println("File Size:"+((float)fileObject.length()/1024)+"kB");
		System.out.println("Last Modified Time:"+new Date(fileObject.lastModified()));
	}

}
