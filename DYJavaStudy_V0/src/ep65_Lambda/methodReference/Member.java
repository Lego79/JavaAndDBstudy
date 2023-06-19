package ep65_Lambda.methodReference;

public class Member {
	
	private String id;
	private String name;
	
	public Member(String id) {
		this.id = id;
		System.out.println("Member(String id)");
	}
	
	public Member(String id, String name) {
		
		this.id = id;
		this.name = name;
		System.out.println("Member(String id, String name)");
		
	}
	
	@Override
	public String toString() {
		
		String info = "{id: "+ id + ", name: " + name + "}";
		return info;
		
	}
	
	
}
