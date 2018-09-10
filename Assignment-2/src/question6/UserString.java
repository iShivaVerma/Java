package question6;

public class UserString {

	private char firstString[];
	private char secondString[];
	
	public UserString(String firstString, String secondString) {
		super();
		this.firstString = firstString.toCharArray();
		this.secondString = secondString.toCharArray();
	}

	
	public char[] getFirstString() {
		return firstString;
	}


	public void setFirstString(char[] firstString) {
		this.firstString = firstString;
	}


	public char[] getSecondString() {
		return secondString;
	}


	public void setSecondString(char[] secondString) {
		this.secondString = secondString;
	}


	public void reverseString(){
		char temp;
		for(int i=0,j=firstString.length;i<j;i++,j--){
			temp=firstString[i];
			firstString[i]=firstString[j];
			firstString[j]=temp;
		}
		for(int i=0,j=secondString.length;i<j;i++,j--){
			temp=secondString[i];
			secondString[i]=secondString[j];
			secondString[j]=temp;
		}
	}
	
	public void copyString(){
		for(int i=0;i<secondString.length;i++){
			firstString[i]=secondString[i];
		}
	}
	
	public void concatString(){
		char concatString[]=new char[firstString.length+secondString.length];
		for(int i=0;i<(firstString.length+secondString.length);i++){
			if(i<firstString.length)
				concatString[i]=firstString[i];
			else
				concatString[i]=secondString[i-firstString.length];
		}
		System.out.println("Concatenated String:");
		for(int i=0;i<concatString.length-1;i++)
			System.out.print(concatString[i]);
	}
	public void count(){
		int count=firstString.length+secondString.length;
		System.out.println("The number of Characters:"+count);
	}
}
