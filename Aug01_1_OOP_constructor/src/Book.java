// constructor (생성자)
//		객체가 생성될 때 작업할거 있으면
//		메소드, 클래스명과 이름 같은, 리턴이 아예 없는
//		생성자라는걸 전혀 건들지 안했으면 -> 컴파일때 자동으로 기본생성자를 만들어줌
//			=> 생성자를 만들면 자동으로 기본생성자를 안만들어줌
// 				아쉬운가? => ㄴㄴ 어차피 안씀
//				- spring 가면 개발자가 쓴 소스뿐만아니라 객체를 자동으로 생성(기본생성자로)
//				- 상속에서 기본생성자가 필요함
//				=> 기본생성자를 무조건 만드는 문화가 생겨버림

public class Book {
	
	String name;
	String maker;
	int price;


	// C + space
	// default constructor (기본 생성자)
	public Book() {
		System.out.println("책 입고");
		maker = "한빛출판사";  // 기본값을 주고 싶으면 생성자 안에다
		
		// 공통은 static / 기본값은 생성자 안에다가
	}
	
	// overloaded constructor (오버로딩된 생성자)
	// 원래 단축기 없지만, 알아서 설정 C+S+a
	// 원래 = 우클릭 -> 소스 -> 밑에서 3번째 (자동완성) // 쓰면 바보
	public Book(String name, String maker, int price) {
		super(); // 나중에  / 지워도 됨
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(maker);
		System.out.println(price);
		System.out.println("-----------------------------");
	}
	

	public void test(String maker) {
		// 멤버변수랑 파라메터 / 지역변수 이름이 같으면?
		//		파라메터 / 지역변수로 인식하는데, this. 붙으면 멤버변수로 인식 
		
		// this. : 지금 이 객체 / 생략 가능 
		System.out.println(this.name);
		System.out.println(maker);
		System.out.println("-----------------------------");
	}
}
