package ep66_stream.maptoInt;

import java.util.ArrayList;
import java.util.List;



public class App {

	public static void main(String[] args) {
		
		List<Student> studentlist = new ArrayList<>();
		
		studentlist.add(new Student("홍길동",85));
		studentlist.add(new Student("홍길동",92));
		studentlist.add(new Student("홍길동",87));
		
		studentlist.stream()
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
		
		studentlist.stream()
			.filter(null)

	}

}
