package question1;

import java.util.ArrayList;

public class Menu {

	static ArrayList<Dish> menuList=new ArrayList<>();
	static{
		menuList.add(new Dish(100, "Pizza", 1));
		menuList.add(new Dish(101, "Pasta", 2));
		menuList.add(new Dish(102, "Macaroni", 1));
	}
}
