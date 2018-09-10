package question5;

public class Dish {
	private int dishId;
	private String dishName;
	private float dishPrice;
	private int dishMakeTime;
	
	
	public Dish() {
		super();
	}

	public Dish(int dishId, String dishName, float dishPrice, int dishMakeTime) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishPrice = dishPrice;
		this.dishMakeTime = dishMakeTime;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public float getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(float dishPrice) {
		this.dishPrice = dishPrice;
	}

	public int getDishMakeTime() {
		return dishMakeTime;
	}

	public void setDishMakeTime(int dishMakeTime) {
		this.dishMakeTime = dishMakeTime;
	}
	
	public void setDishDetails(int dishId,String dishName,float dishPrice,int dishMakeTime){
		this.dishId=dishId;
		this.dishName=dishName;
		this.dishPrice=dishPrice;
		this.dishMakeTime=dishMakeTime;
	}

	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", dishPrice=" + dishPrice + ", dishMakeTime="
				+ dishMakeTime + "]";
	}

}
