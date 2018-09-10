package question1;

public class CEO implements Role {

	private String roleName;
	private String responsibility;
	
	public CEO() {
		super();
	}
	
	public CEO(String role, String responsibility) {
		super();
		this.roleName = role;
		this.responsibility = responsibility;
	}
	
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getResponsibility(){
		return responsibility;
	}
}
