package question5;

public class Restaurant implements IRestaurant {

	static Dish dishObject[];
	
	static{
		dishObject=new Dish[4];
		for(int i=0;i<4;i++){
			dishObject[i]=new Dish();
		}
		dishObject[0].setDishDetails(100, "Pizza", 120.50F, 1);
		dishObject[1].setDishDetails(101, "Burger", 500.50F, 1);
		dishObject[2].setDishDetails(102, "French Fries", 50F, 2);
		dishObject[3].setDishDetails(103, "Popcorn", 40F, 1);
	}
	public Dish getDish(int dishId){
		for(int i=0;i<4;i++){
			if(dishObject[i].getDishId()==dishId)
				return dishObject[i];
		}
		return null;
	}
	@Override
	public String toString() {
		return "Restaurant []";
	}
	
}
