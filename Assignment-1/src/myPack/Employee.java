//Question-6

package myPack;
import java.util.*;

public class Employee {

	float hrPay;
	int hrReg;
	int hrOver;
	float salary;
	public void getData(float hrPay,int hrReg,int hrOver)
	{
		this.hrPay=hrPay;
		this.hrReg=hrReg;
		this.hrOver=hrOver;
	}
	
	public void calculateSalary()
	{
		float normalSalary=this.hrReg*this.hrPay*7;
		float overtimeSalary=this.hrOver*this.hrPay*1.5F;
		this.salary=normalSalary+overtimeSalary;
	}
	public float display()
	{
		return this.salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float pay;
		int regHours,overtimeHours;
		Scanner s=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter the hrPay:");
		pay=s.nextFloat();
		System.out.println("Enter the hrReg:");
		regHours=s.nextInt();
		System.out.println("Enter the hrOver:");
		overtimeHours=s.nextInt();
		e.getData(pay,regHours,overtimeHours);
		e.calculateSalary();
		System.out.println("Weekly Salary:"+e.display());
		s.close();
	}

}
