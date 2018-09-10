package question1;

public class MainClass extends Thread{

	public void run(){
		System.out.println("Thread:"+Thread.currentThread().getName());
		System.out.println("Priority:"+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass highPriorityMainClassObject=new MainClass();
		MainClass lowPriorityMainClassObject=new MainClass();
		highPriorityMainClassObject.setPriority(MAX_PRIORITY);
		lowPriorityMainClassObject.setPriority(MIN_PRIORITY);
		lowPriorityMainClassObject.start();
		highPriorityMainClassObject.start();
	}

}
