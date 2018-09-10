package question1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass mainClassObject=new MainClass();
		Manager managerObject=new Manager("Manager","Manage the Projects");
		CEO ceoObject=new CEO("CEO","Manage the Company");
		mainClassObject.displayInfo(managerObject);
		mainClassObject.displayInfo(ceoObject);
	}
	public void displayInfo(Object object){
		if(object instanceof CEO){
			CEO ceoObject=(CEO)object;
			System.out.println("------------CEO-----------");
			System.out.println("Role:"+ceoObject.getRoleName()+"\nResponsibility:"+ceoObject.getResponsibility());
		}
		if(object instanceof Manager){
			Manager managerObject=(Manager)object;
			System.out.println("------------Manager-----------");
			System.out.println("Role:"+managerObject.getRoleName()+"\nResponsibility:"+managerObject.getResponsibility());
		}
	}

}
