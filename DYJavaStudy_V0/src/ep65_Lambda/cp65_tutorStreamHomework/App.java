package ep65_Lambda.cp65_tutorStreamHomework;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(
				new Apple(200, Color.GREEN),
				new Apple(180, Color.RED),
				new Apple(120, Color.RED),
				new Apple(80, Color.GREEN),
				new Apple(155, Color.GREEN)				
				);
		
//		System.out.println("===== 녹색사과(정렬 : 무게) =====");		
//		inventory.stream()
//			.filter(n -> n.getColor().equals(Color.GREEN))
//			.sorted((n1, n2) -> Integer.compare(n1.getWeight(), n2.getWeight()))
//			.forEach(n -> System.out.println("컬러=" + n.getColor() + " | " + "무게= " + n.getWeight() ));
//		
//		System.out.println("\n===== 무거운사과(정렬 : 무게) =====");
//		System.out.println("기준 : 무게가 150이상");
//		inventory.stream()
//			.filter(n -> n.getWeight() > 150)
//			.sorted((n1, n2) -> Integer.compare(n1.getWeight(), n2.getWeight()))
//			.forEach(n -> System.out.println("컬러=" + n.getColor() + " | " + "무게= " + n.getWeight() ));
		
		System.out.println("\n===== 무거운 빨간 사과 =====");
		List<Apple> redApples = null;
		
		redApples = inventory.stream()
		.filter(n -> n.getColor().equals(Color.RED) && n.getWeight() >= 150)
		.collect(Collectors.toList());
		
		for (Apple apple : redApples) {
			apple.printInfo();
		}
		
//		
//	      System.out.println("\n=====무거운 빨간 사과 =====");
//	      List<Apple> redApples = null;
//
//	      redApples = inventory.stream()
//	            .filter(element -> element.getColor().equals(Color.RED)
//	                  && element.getWeight() >= 150)
//	            .collect(Collectors.toList());
//
//	      for (Apple apple : redApples) {
//	         apple.printInfo();
//	      }

		
			

	}

}
