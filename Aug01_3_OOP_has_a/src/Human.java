// 사람 has a 개 : 반려동물
// 개 has a 사람 : 주인

public class Human {

	String name;
	int age;
	Dog pet; // 객체 가지기
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
		// System.out.println(pet.name);
		// System.out.println(pet.age);
		pet.print();
	}
}
