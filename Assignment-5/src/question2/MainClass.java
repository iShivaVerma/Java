package question2;

public class MainClass extends Thread{

	public void run(){
		
		try {
			if(Thread.currentThread().getPriority()==MAX_PRIORITY)
				Thread.sleep(5000);
			System.out.println("Thread Name:"+Thread.currentThread().getName());
			System.out.println("Priority:"+Thread.currentThread().getPriority());
		} catch (InterruptedException interruptedExceptionObject) {
			// TODO Auto-generated catch block
			interruptedExceptionObject.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass highPriorityMainCLassObject=new MainClass();
		MainClass lowPriorityMainCLassObject=new MainClass();
		highPriorityMainCLassObject.setName("High Priority");
		lowPriorityMainCLassObject.setName("Low Priority");
		highPriorityMainCLassObject.setPriority(MAX_PRIORITY);
		lowPriorityMainCLassObject.setPriority(MIN_PRIORITY);
		lowPriorityMainCLassObject.start();
		highPriorityMainCLassObject.start();

	}

}
