// java : 커피 이름임 (개발자가 만들고 커피숍감)

// DTO (Data Temp/Transfer Object)
// VO (Value Object)

// javaBean 
public class Mouse {
	
	// 배치 순서
		// 1. 멤버변수들
		// 2. 생성자들
		//	2-1. 기본생성자 (C + space)
		//	2-2. 오버로딩된 생성자 (C+S+a)
		// 3. 기타 메소드
	
	String name;
	int price;
	
	
	public Mouse(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println("-----------------------------");
	}
	
	
}
