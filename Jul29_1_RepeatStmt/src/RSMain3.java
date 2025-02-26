
//break : 반복문 종료
//continue : 턴 종료

import java.util.Scanner;

public class RSMain3 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 2) {
				// break;
				continue;  // 아래로 내려가지 않고 만난 즉시 위로 올라감 ==> 2빼고 모두 출력
			}
			System.out.println(i);
		}
		
		Scanner oo = new Scanner(System.in);
		int menu;
		// 주로 while 문 쓰는 법 (조건식 쓰지 않고 하기)
		// 1) while 문 구조상 조건식 쓰기 까다로움
		while (true) { // 2) 냅다 무한루프 (true)
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("10. 종료");
			System.out.println("--------------------------");
			System.out.print("메뉴 : ");
			menu = oo.nextInt();
			
			if (menu == 1) System.out.println("등록 관련"); // 3) 무언가 처리중
			else if (menu == 2) System.out.println("수정 관련");
			else if (menu == 10) break; // 4) 거기에 종료 조건 추가
		}
	}
}
