package myPack;
@FunctionalInterface
public interface ISalary {

	int calcualteSalary(int salary,int bonus);
	default void print(){
		System.out.println("Print");
	}
}
