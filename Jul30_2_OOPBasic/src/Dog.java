// 지역 변수 : 함수 속에서 만든 변수
//		함수 진행하는 동안에만 쓰고 버릴 임시 데이터
//		기본값이 없어서, 초기화하고 사용해야 함

// 함수 인자 (parameter) 
//		그 함수 진행에 필요한 재료
//		기본값 개념 없이, 함수 호출할 때 넣어주는 값

// 멤버 변수 (member variable) 
//		객체의 속성
//		기본값이 있음 (참조형 : null / 기본형 : 0)

// java : perfect OOL = OOP 만을 위한 (객체지향언어 / 객체지향프로그램)
// Python : hybrid OOL = OOP 하든지 말든지
// 함수(function)vs 메소드 (method)
// 단순 기능 집합 vs 멤버함수(객체의 액션)

// 여기다 쓰면 함수 => 자바에는 여기다 쓸 수 없기에 함수가 없음 
public class Dog {
// 여기다 쓰면 메소드
	
	// 멤버 머시기
	// 속성 : 멤버 변수
	String name = "후추"; // 절대 쓰면 안됨 = 쓰레기 코드임
	int age;
	
	// 액션 (행동) / 프로그램상 필요한 기능 : 메소드 (method) 
	public void bark() {
		System.out.println("멍!");
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
