package newPack;

public class Test1 {

	public static void main(String[] args) {
		
		String s=new String("Hello How Are YOU?");
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}                        
}
