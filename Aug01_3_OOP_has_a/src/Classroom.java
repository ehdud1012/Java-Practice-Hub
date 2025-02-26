// 강의실 has a 프린터
public class Classroom {

	static Printer printer = new Printer("캐논123", 500000);
 
	String name;
	String location;
	
	public Classroom() {
		
	}

	public Classroom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	
}
