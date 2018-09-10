package question7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WordCount wordCountObject=new WordCount();
		try{
			wordCountObject.readFile();
		}
		catch (Exception exceptionObject) {
			exceptionObject.printStackTrace();
		}
	}
	public void readFile()throws Exception{
		File fileObject=new File("src\\question7\\lear.txt");
		FileInputStream fileInputStreamObject=new FileInputStream(fileObject);
		BufferedReader bufferedReaderObject=new BufferedReader(new InputStreamReader(fileInputStreamObject));
		String string;
		int countLine=0;
		int countWord=0;
		int countCharacter=0;
		while((string=bufferedReaderObject.readLine())!=null){
			String word[]=string.split(" ");
			for (String words : word) {
				countCharacter+=words.length();
				countCharacter++;
				countWord++;
			}
			countLine++;
		}
		System.out.println("File Name:"+fileObject.getName());
		System.out.println("Number of Lines:"+countLine);
		System.out.println("Number of Words:"+countWord);
		System.out.println("Number of Characters:"+countCharacter);
	}

}
