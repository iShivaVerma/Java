package question4;

public class CalculateSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IsSalary isSalaryObject= new IsSalary() {
			
			@Override
			public int calculateSalary(int days, int salPerDay) {
				// TODO Auto-generated method stub
				return days*salPerDay;
			}
		};
		System.out.println("Anonymous Interface Object:-");
		System.out.println(isSalaryObject.calculateSalary(10, 150));
		
		IsSalary isSalaryObjectLambda=(days,salPerDay)->days*salPerDay;
		System.out.println("Lambda Expression:-");
		System.out.println(isSalaryObjectLambda.calculateSalary(10, 150));
	}

}
