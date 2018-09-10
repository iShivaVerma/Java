package question2;

public class SalariedWorker extends Worker{

	
	public SalariedWorker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedWorker(String name, float salaryRate) {
		super(name, salaryRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float computePay(int hours){
		float wage=0.0F;
		if((hours>=40 || hours<40) && hours>0){
			wage=40F*getSalaryRate();

		}
		return wage;
	}
}
