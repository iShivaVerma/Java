package question4;

public class CurrentAccount extends Account{

	private float balance;
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public float maintainMinBalance(){
		if(getBalance()<=1000){
			setBalance(getBalance()-50);
		}
		return getBalance();
	}
	
	public void deposit(float amount){
		setBalance(getBalance()+amount);
	}
	
	public int withdraw(float amount){
		int flag=0;
		float remainingAmount=this.maintainMinBalance();
		if(remainingAmount>=0){
			if((getBalance()-amount)>=0){
				setBalance(getBalance()-amount);
				flag=1;
			}
		}
		return flag;
	}
	public void setDetails(String name,long accountNumber,String accountType,float balance){
		setName(name);
		setAccountType(accountType);
		setAccountNumber(accountNumber);
		setBalance(balance);
	}
}
