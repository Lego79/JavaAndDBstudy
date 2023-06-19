package ep65_Lambda.returnLambda;

public class App {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.action((x,y) -> {
			double result = x+y;
			return result;
		});
		
		
		person.action((x,y)-> sum(x,y));
		
		
		
	}
	public static double sum(double x, double y) {
		return x+y;
	}

}
