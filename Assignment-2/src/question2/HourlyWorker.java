package question2;

public class HourlyWorker extends Worker{
	
	
	public HourlyWorker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyWorker(String name, float salaryRate) {
		super(name, salaryRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float computePay(int hours){
		float wage;
		if(hours<=40){
			wage=hours*getSalaryRate();
		}
		else{
			wage=(40F*getSalaryRate()+(hours-40)*getSalaryRate()*1.5F);
		}
		return wage;
	}
}
