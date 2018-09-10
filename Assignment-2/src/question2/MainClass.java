package question2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HourlyWorker hourlyWorkerObject=new HourlyWorker("MK",2000);
		SalariedWorker salaryWorkerObject=new SalariedWorker("MJ", 1500.50F);
		MainClass mainClassObject=new MainClass();
		mainClassObject.display(hourlyWorkerObject);
		mainClassObject.display(salaryWorkerObject);
	}
	public void display(Worker workerObject){
		if(workerObject instanceof HourlyWorker){
			HourlyWorker hourlyWorkerObject=(HourlyWorker)workerObject;
			System.out.println("Hourly Salary for "+hourlyWorkerObject.getName()+" is:"+hourlyWorkerObject.computePay(20));
		}
		if(workerObject instanceof SalariedWorker){
			SalariedWorker salariedWorkerObject=(SalariedWorker)workerObject;
			System.out.println("Salary for "+salariedWorkerObject.getName()+" is:"+salariedWorkerObject.computePay(20));
		}
	}

}
