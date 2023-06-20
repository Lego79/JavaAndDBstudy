package ep66_stream.pipeLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("홍길동", 20),
				new Student("홍길동", 30));
		
		double avg = list.stream()
				.mapToInt(student -> student.getScore())		
				.average()
				.getAsDouble();
		
		System.out.println("평균점수: " + avg);
		
	}

}
