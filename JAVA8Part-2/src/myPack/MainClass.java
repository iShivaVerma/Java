package myPack;

public class MainClass {

	public static void main(String[] args) {
		ISalary iSalaryObject=(salary,bonus)->salary+bonus;
		System.out.println(iSalaryObject.calcualteSalary(1000, 500));
		iSalaryObject.print();
	}
}
