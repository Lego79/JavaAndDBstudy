package ep65_Lambda.conversion;

public class App {

	public static void main(String[] args) {
		
		System.out.println("\n====== Java =======");
		Conversion c1 = new Conversion() {
			
			@Override
			public int stringToInt(String s) {
				return Integer.parseInt(s);
			}
		};
		
		int result1 = c1.stringToInt("10");
		System.out.println(result1);
		
		System.out.println("\n====== Lambda =======");		
		
		System.out.println("\n------ Lambda -------");		
		
		Conversion c2 = (s) -> (Integer.parseInt(s));
		System.out.println(c2.stringToInt("20"));
		
		};
		
}
