package ep66_stream.arrayStream;

import java.sql.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamExample {

	public static void main(String[] args) {
		
		String[] strArray = {"홍길동", "싱요권", "김미나"};
		Stream<String> strStream = Arrays.stream(strArray);
		
		strStream.forEach(name-> System.out.print(name + ","));
		System.out.println();
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(num -> System.out.print(num + ","));
		System.out.println();

	}

}
