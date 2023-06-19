package practice.arrayPractice.Lecture.personArray;

public class Person {
	
	private String name;
	private int age;
	

	
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
	
	public Person() {


	}


	public String getName() {
		return name;
	}





	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void printInfo() {
		
		
		System.out.println("이름=" + getName() + "|" + "나이=" + getAge());
		
		
	}
	

}
