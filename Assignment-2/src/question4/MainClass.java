package question4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass mainClassObject =new MainClass();
		CurrentAccount currentAccountObject =new CurrentAccount();
		SavingAccount savingAccountObject=new SavingAccount();
		
		currentAccountObject.setDetails("Mohit", 101010100103L, "Current", 20000.0F);
		savingAccountObject.setDetails("Cobra", 120112010021L, "Saving", 3000.0F);
		mainClassObject.getDetails(currentAccountObject);
		System.out.println("After Deposit of 1200:");
		currentAccountObject.deposit(1200);
		mainClassObject.getDetails(currentAccountObject);
		System.out.println("After Withdrawl of 2000:");
		currentAccountObject.withdraw(2000);
		mainClassObject.getDetails(currentAccountObject);
		
		
		mainClassObject.getDetails(savingAccountObject);
		System.out.println("After Deposit of 1500:");
		savingAccountObject.deposit(1500);
		mainClassObject.getDetails(savingAccountObject);
		System.out.println("After Withdrawl of 2000:");
		savingAccountObject.withdraw(2000);
		mainClassObject.getDetails(savingAccountObject);
	}
	
	public void getDetails(Account accountObject){
		MainClass mainClassObject=new MainClass();
		if(accountObject instanceof CurrentAccount){
			CurrentAccount currentAccountObject=(CurrentAccount)accountObject;
			mainClassObject.currentAccountInfo(currentAccountObject);
		}
		if(accountObject instanceof SavingAccount){
			SavingAccount savingAccountObject=(SavingAccount)accountObject;
			mainClassObject.savingAccountInfo(savingAccountObject);
		}
		
	}
	public void currentAccountInfo(CurrentAccount currentAccountObject){
		System.out.println("---------------Current Account-------------");
		System.out.println("Account Number:"+currentAccountObject.getAccountNumber());
		System.out.println("Account Type:"+currentAccountObject.getAccountType());
		System.out.println("Balance:"+currentAccountObject.getBalance());
		System.out.println("Name:"+currentAccountObject.getName());
		System.out.println("-------------------------------------------");
	}
	public void savingAccountInfo(SavingAccount savingAccountObject){
		System.out.println("---------------Saving Account-------------");
		System.out.println("Account Number:"+savingAccountObject.getAccountNumber());
		System.out.println("Account Type:"+savingAccountObject.getAccountType());
		System.out.println("Balance:"+savingAccountObject.getBalance());
		System.out.println("Name:"+savingAccountObject.getName());
		System.out.println("-------------------------------------------");
	}

}
