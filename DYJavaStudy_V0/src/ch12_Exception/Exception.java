package ch12_Exception;

public class Exception {

	public static void printLength(String data) {
		
		try {
			
			int result = data.length();
			System.out.println("문자 수=" + result);
			
		} catch(NullPointerException e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("[마무리실행]\n");
		}
		
	}
	
	public static void math(int num) {
		
		try {
			
	
			
			
		} catch(NullPointerException e) {
			
	
		} finally {
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("[프로그램시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("프로그램종료");

	}

}
