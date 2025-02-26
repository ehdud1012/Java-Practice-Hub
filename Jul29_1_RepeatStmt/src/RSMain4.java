
import java.util.Scanner;

public class RSMain4 {

	public static void main(String[] args) {
		a: for (int i = 0; i < 5; i++) {
			bb: for (int j = 0; j < 5; j++) {
				cc: for (int j2 = 0; j2 < 5; j2++) {
					System.out.println(i);
					System.out.println(j);
					System.out.println(j2);		
					System.out.println("--------------------------");
					if (j2 == 2) {
						// break; 원래 가까운 곳이 주인 = j2
						break bb; // 이름 붙여주고 쓰면 그 이름이 주인 = bb
						// 자바에만 존재
					}
				}
			}
		}
		
		Scanner oo = new Scanner(System.in);
		int menu;
		ww : while (true) { 
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("10. 종료");
			System.out.println("--------------------------");
			System.out.print("메뉴 : ");
			menu = oo.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("등록 관련"); 
				break;
			case 2:
				System.out.println("수정 관련");
				break;
			case 10:
				break ww; // while 문 종료
			}
		}
	}

}
