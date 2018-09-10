package question4;

public class SavingAccount extends Account{

	private float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public double compoundInterest(int time){
		double compundInterest = getBalance()*(Math.pow((1 + 8 / 100), time));
		return compundInterest;
	}
	
	public int withdraw(float amount){
		int flag=0;
		if((getBalance()-amount)>=0){
			setBalance(getBalance()-amount);
			flag=1;
		}
		return flag;
	}
	
	public void deposit(float amount){
		setBalance(getBalance()+amount);
	}
	
	public void setDetails(String name,long accountNumber,String accountType,float balance){
		setName(name);
		setAccountType(accountType);
		setAccountNumber(accountNumber);
		setBalance(balance);
	}
}
