package ep65_Lambda.cp65_tutorStreamHomework;



public class Apple {
	
	private int weight;
	private Color color;
	
	public Apple(int weight, Color color) {

		this.weight = weight;
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void printInfo() {
		
		System.out.println("컬러 = " + getColor() + " | " + "무게= " + getWeight());
		
	}
	

	

	

	
	
	
	
	

	
	
	

	
	
	
	

}
