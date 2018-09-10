package question1;

public class GoTooFar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={1,2,3,4,5};
		int count=-1;
		while(true){
			try{
				System.out.print(array[++count]+",");
			}
			catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsExceptionObject){
				System.out.println("\nNow you have gone TOO FAR!!!!!!");
				System.exit(0);
			}
		}
	}

}
