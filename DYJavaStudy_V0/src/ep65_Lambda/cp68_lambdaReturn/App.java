package ep65_Lambda.cp68_lambdaReturn;

public class App {

	public static void main(String[] args) {
		System.out.println("\n==== Lambda ====");
		
		Drawable d2 = (c,t) -> c + t + "삼각형";
		
		
		System.out.println("\n------- 1. --------");
		System.out.println(d2.draw("검은색", "점선"));
		
		
		
		Drawable d3 = (c,t) -> c + t + "원";
		System.out.println("\n------- 2. --------");
		System.out.println(d3.draw("파란색", "실선"));

	}

}
