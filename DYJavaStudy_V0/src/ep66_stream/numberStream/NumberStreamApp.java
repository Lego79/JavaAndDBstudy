package ep66_stream.numberStream;

import java.util.stream.IntStream;

public class NumberStreamApp {
	
	private static int sum;

	public static void main(String[] args) {
		
		
		
		IntStream stream = IntStream.rangeClosed(1, 100);
		
		stream.forEach(a -> sum += a);
		
		System.out.println("총합: " + sum);

	}

}
