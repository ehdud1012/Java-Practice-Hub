// Pen is a Product : 상속 = 확장

// 상속 : inheritance
// 확장하다 : extend

// Product : 부모/상위/super 클래스
// Pen : 자식/하위 클래스

// overriding vs overloading
public class Pen extends Product { // 상속 관계 맺기 
	// Product 에 있는 멤버변수와 메소드 등 모든 것 사용 가능
	String color;
	
	// @XXX : annotation
	//		XXX에 뭐있냐어 따라 다 다름
	//		대부분 = 자동으로
	
	// @Override : 없어도 되는데 
	//				바로 밑에 overriding 된 메소드가 들어가야 => 가독성 UP
	// overriding : 물려받은 메소드 기능을 바꾸자 (재정의)
	//		완전 재정의가 아닌 기존 기능의 추가로 많이 쓰임
	// 		원래 a 라는 기능 -> a+b 로 재정의 (원래 기능에 추가)
	@Override  // 없어도 됨
	public void print() {
		super.print(); // Product 의 print 를 호출
		
		System.out.println(color);
	}
}
