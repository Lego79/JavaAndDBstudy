package ep65_Lambda.lambdaMethod;

public class App {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.action(Computer::staticMethod);
		
		Computer com = new Computer();
		
		person.action(com::instanceMethod);
		
	}

}
