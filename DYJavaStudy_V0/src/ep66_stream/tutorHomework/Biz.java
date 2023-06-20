package ep66_stream.tutorHomework;

import java.util.ArrayList;
import java.util.List;

public class Biz {
	
	
	
	
	
	static void viewMenu(List<Dish> menu) {
		
		menu.stream()
		.forEach(n-> n.printInfo());
		
	}
	
	static void viewHighCaloriesMenu(List<Dish> menu) {
		
		menu.stream()
		.filter(n1 -> n1.getCalory() >= 500)
		.forEach(n1 -> n1.printInfo());
		
	}
	
	static void viewLowColoriesMenu(List<Dish> menu) {
		
	}
	
	static void viewFishMenu(List<Dish> menu) {
		
	}
	
	static void viewMeatMenu(List<Dish> menu) {
		
	}
	
	static void viewVegetarianMenu(List<Dish> menu) {
		
	}

}
