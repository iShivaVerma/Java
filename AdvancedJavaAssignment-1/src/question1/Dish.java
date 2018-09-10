package question1;

public class Dish {

	private int dishID;
	private String dishName;
	private int creationTime;
	
	public Dish() {
		super();
	}
	public Dish(int dishID, String dishName, int creationTime) {
		super();
		this.dishID = dishID;
		this.dishName = dishName;
		this.creationTime = creationTime;
	}
	public int getDishID() {
		return dishID;
	}
	public void setDishID(int dishID) {
		this.dishID = dishID;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(int creationTime) {
		this.creationTime = creationTime;
	}
	@Override
	public String toString() {
		return "Dish [dishID=" + dishID + ", dishName=" + dishName + ", creationTime=" + creationTime + "]";
	}
}
