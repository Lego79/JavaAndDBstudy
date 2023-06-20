package ep66_stream.basicStream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamBasicExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("홍길동");
		set.add("신용권");
		set.add("김자바");
		
		Stream<String> stream = set.stream();
		
		stream.forEach(name -> System.out.print(" - " + name + " - "));

	}

}
