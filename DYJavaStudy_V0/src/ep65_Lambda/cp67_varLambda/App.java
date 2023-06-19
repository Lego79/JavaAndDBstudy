package ep65_Lambda.cp67_varLambda;

public class App {

	public static void main(String[] args) {
		
		System.out.println("\n========= Java =========");
		Addable a1 = new Addable() {
			
			@Override
			public void add(int i, int j) {
				System.out.println("i + j = " + (i + j));
			}
		};
		a1.add(1, 2);
		
		System.out.println("\n========= Lambda =========");		
		System.out.println("\n--------- Type 1. ---------");		
		Addable a2 = (int i, int j) -> System.out.println("i + j = " + (i + j));
		a2.add(1, 2);
		
		
		System.out.println("\n--------- Type 2. ---------");	
		Addable a3 = (i, j) -> System.out.println("i + j = " + (i + j));
		a3.add(3, 4);
		
		
//		System.out.println("===== Java =====");
//		Sayable s = new Sayable() {
//			public void sayHello(String name) {
//				System.out.println("Hello");
//			}
//		};
//		s.sayHello("Victoria");
//
//		System.out.println("\n===== Lambda =====");
//
//		System.out.println("\n----- Type 1. -----");
//		// 매개변수 타입 사용
//
//		Sayable s1 = (String name) -> {
//			System.out.println("Hello," + name);
//			System.out.println("Welcome," + name);
//		};
//		s1.sayHello("Smith");
//
//		System.out.println("\n----- Type 2. -----");
//		// 매개변수 타입 사용 X
//
//		Sayable s2 = (name) -> {
//			System.out.println("Hello," + name);
//			System.out.println("Welcome," + name);
//		};
//		s2.sayHello("Paige");
//
//		System.out.println("\n----- Type 3. -----");
//		// 매개변수 타입 사용 X
//		// 실행문 1개일 경우, 실행문 중괄호 생략 가능
//
//		Sayable s3 = name -> System.out.println("Hello," + name);
//		s3.sayHello("James");
	}
			


	
		
	

}
