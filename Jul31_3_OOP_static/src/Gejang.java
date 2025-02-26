// 멤버변수에 값을 넣는걸 언제 하고 싶은가 
//		- 따로 입력 안하고 기본값을 주고 싶어서 -> 내일
//		- 모든 객체들의 공통속성일때 => static / 11줄

// static 멤버변수 - 이걸 잘써야 OOP 를 잘하는것
//		모든 객체들의 공통속성 
//		static 영역에 하나만 생겨서, 모든 객체가 공용으로
//		=> 메모리 절약
//		=> 객체를 만들지 않아도 쓸 수 있는 정보
// 영원히 김수미, 절대로 바끨일 없는 : static final 
//			상수화 / 수정 불가능 
//			변수명 다 대문자로

// static 메소드
//		=> 객체를 만들지 않아도 쓸 수 있는 메소드
//			static 메소드에서 static 아닌거 사용불가 (당연한 거임)
//		=> 메모리 절약
public class Gejang {
	String name;
	int price; // 이거 쓰레기라 없애야함 
	double weight;
	static String producer = "김수미";
	// static final String PRODUCER = "김수미"; 
	
	public static void test() {
		// System.out.println(name); 실제 게장이 없을 때 사용
		System.out.println(producer);
		System.out.println("zz");
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(weight);
		System.out.println(producer);
	}
}
