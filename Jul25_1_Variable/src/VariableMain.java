// CPU : 연산장치 -> 계산이 빠름 -> 속도에 영향
//		멀티코어 : 동시에 계산 여러개 가능
// RAM : 저장장치 - 변수형태로 임시저장
// SSD/HDD : 저장장치 - 파일형태로 영구저장

// 그래픽카드 : 그래픽처리용 CPU+RAM
//		BD/AI들어가면 본체의 CPU+RAM으로 부족해서
//		그래픽카드 CPU+RAM도 당겨 쓰고

// 변수 : 값을 저장하는 메모리상의 공간(데이터 담는 그릇)
//		언제 : 프로그램 진행하다가 발생하는 데이터
//			임시저장해야하면
//		- 데이터의 특징을 파악해서 적절한 자료형

// 자료형
//		기본형
// 			정수 : byte, short, int, long
//			실수 : float, double
//			글자하나 : char
//			논리형 : boolean
//			자리차지 : void
//		참조형
//			객체(String : 문자열 객체)
//			배열
// 조금이라도 메모리 덜 쓰는게 좋은거, 근데 요즘 컴 좋아져서
// 알고리즘의시대x, 유지보수의시대

// 변수명
//		숫자로 시작x
//		자바 문법x
//		특수문자x(_,$,정도 빼고)
//		문화
//			뜻 통하게
//			한글x
//			띄어쓰기가 안되니 -> 낙타체 	or 뱀체
//								tableCount		table_count
//			소문자로 시작

// 프로그래밍 언어마다 기본자료형이 다른데
//		아무처리도 안하고 데이터만 있을때
//		그 언어가 뭘로 인식하나
//			10 -> int
//			1.5 -> double(자바만)

// 기본형 vs 참조형
//		기본형 데이터들[크기 작고, 일정] stack영역에 저장
//		참조형 데이터들[크기 큼, 제멋대로] heap영역에 저장,
//			heap영역 번지값을 stack영역에 저장

// RAM : 재부팅하면 RAM에 있는 데이터 다 지워짐
//		RAM을 OS가 논리적으로 나눠서 사용
//		?
//		stack
//			밑에서부터 차곡차곡 배정
//			프로그램 종료되면 데이터 지워짐
//		heap
//			컴퓨터가 적당한 위치 골라서 배정
//			개발자가 직접 지워야
//				Garbage Collection은 heap영역 자동정리시스템
public class VariableMain {
public static void main(String[] args) {
// 한 식당 전체 테이블 수가 10 - 임시저장
// short aswdf = 10; // 정답인데
int tableCount = 10; // 개발자들의 문화
// 정수는 int, 근데 21억 넘을것같으면 long
// byte, short은 특수한 상황에나 볼수있을
// 식당 평점이 4.5 - 임시저장
// float point = (float) 4.5;  - // 자바만 1.5를 double 인식함 *float 쓰려면 뒤에 f 필수
// float point = 4.5f;
double point = 4.5;

	// 식당 이름이 김밥천국 - 임시저장
	String name = "김밥천국";
	// 식당 이름이 똥
	char name2 = '똥';
	// 여러글자면 한글자도 포함인데 굳이 char? -> 안쓰..
	String name3 = "똥";

	// 식당 휴무일인가 아님 - 임시저장
	boolean b = false;

	System.out.println("-----");
	// 출력
	System.out.println(tableCount);
	System.out.println(point);
	System.out.println(name);
	System.out.println(b);
}

}