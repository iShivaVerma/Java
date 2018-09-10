import java.io.Serializable;

public class Laptop implements Serializable{

	private String name;
	private int cost;
	Camera cameraObject;
	public Laptop() {
		super();
	}
	
	public Laptop(String name, int cost, Camera cameraObject) {
		super();
		this.name = name;
		this.cost = cost;
		this.cameraObject = cameraObject;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", cost=" + cost + "]";
	}
}
