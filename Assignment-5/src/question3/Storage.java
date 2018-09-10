package question3;

public class Storage {

	private int number;

	public Storage() {
		super();
	}

	public Storage(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Storage [number=" + number + "]";
	}
	
}
