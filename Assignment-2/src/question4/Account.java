package question4;

abstract public class Account {

	private String name;
	private long accountNumber;
	private String accountType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public abstract void deposit(float amount);
	public abstract int withdraw(float amount);
	
}
