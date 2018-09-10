package question1;

public class Employee implements Addressable{

	private String city;
	private String state;
	
	public Employee() {
	}

	public Employee(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return state;
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return city;
	}
	
	/*public String getFullAddress() {
		// TODO Auto-generated method stub
		return Addressable.super.getFullAddress();
	}*/

}
