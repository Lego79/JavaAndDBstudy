package ep66_stream.tutorHomework;

public class Dish {
	
	private String foodName;
	private boolean vegan;
	private int calory;
	private Type type;
	
	
	public Dish(String foodName, boolean vegan, int calory, Type type) {
		this.foodName = foodName;
		this.vegan = vegan;
		this.calory = calory;
		this.type = type;
	}


	public String getFoodName() {
		return foodName;
	}


	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}


	public boolean isVegan() {
		return vegan;
	}


	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}


	public int getCalory() {
		return calory;
	}


	public void setCalory(int calory) {
		this.calory = calory;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}
	
	public void printInfo() {
		
		System.out.println(
				"음식 =" + getFoodName() + " | "+
				"채식 =" + isVegan() + " | "+
				"열량 =" + getCalory() + " | "+
				getType() + " | ");	
	}

}
