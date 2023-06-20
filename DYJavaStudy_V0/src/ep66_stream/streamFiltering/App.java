package ep66_stream.streamFiltering;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		System.out.println("===== Java =====");
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Paige", 20));
		list.add(new Person("James", 30));
		list.add(new Person("Smith", 40));
		list.add(new Person("Tom", 50));
		list.add(new Person("Victoria", 60));

		System.out.println("\n===== Stream.filter() =====");

		System.out.println("\n----- 1. -----");
		// 이름이 "James"
		list.stream()
			.filter(n -> n.getName().startsWith("J"))
			.filter(n -> n.getAge() == 30)
			.forEach(n -> System.out.println(n.getName() + "||" + n.getAge()));

		System.out.println("\n----- 2. -----");
		list.stream()
			.filter(n -> n.getAge() >= 30)
			.forEach(n-> System.out.println(n.getName() + "||" + n.getAge()));
		// 30세 이상

		System.out.println("\n----- 3. -----");
		list.stream()
			.filter(n -> n.getAge() < 60)
			.filter(n-> n.getName().contains("a"))
			.forEach(n-> System.out.println(n.getName() + "||" + n.getAge()));
		// 60세 미만이고, 이름에 "a" 포함

	}
}
