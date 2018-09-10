package question1;

public class Manager implements Role{

	private String roleName;
	private String responsibility;
	public Manager() {
		super();
	}
	public Manager(String roleName, String responsibility) {
		super();
		this.roleName = roleName;
		this.responsibility = responsibility;
	}
	public void setRole(String roleName) {
		this.roleName = roleName;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	public String getRoleName(){	
		return roleName;
	}
}
