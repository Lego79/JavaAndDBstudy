package ep17_inheritanceExtends.example02;

public class Phone {
	
	public String model;
	public String color;
	
	public Phone (String model, String color) {
		this.model= model;
		this.color = color;
		System.out.println("모델 컬러 생성자 실행");
	}

}
