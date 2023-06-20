package ep66_stream.streamIntegerApp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntegerFilterApp {

	public static void main(String[] args) {

//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//		System.out.println("===== Stream.filter() =====");
//		list.stream()
//			.filter(n -> n%2 == 0)
//			.forEach(n -> System.out.print(n + " "));
		
		

		List<String> list1 = Arrays.asList("Paige", "James", "Smith", "Tom", "Victoria");
		
//		list1.stream()
//			.filter(item -> item.contains("a"))			
//			.forEach(item -> System.out.println(item));
		
		list1.stream()
			.filter(i -> i.startsWith("P") && i.endsWith("e") &&(i.length() > 4) && i.contains("a"))
			.forEach(i -> System.out.println(i));
		
		System.out.println();
		
		list1.stream()
			.filter(name -> name.startsWith("J") && name.endsWith("s") && name.length()	> 4 && name.contains("m"))
			.forEach(name -> System.out.println(name));


		// - "a" 가 포함되어 있는 문자열 출력



		// - 시작문자 : P, 종료문자 : e, 길이 : 5이상 문자열 출력
		// - 여러 조건은 && 로 연결
		

	}

}
