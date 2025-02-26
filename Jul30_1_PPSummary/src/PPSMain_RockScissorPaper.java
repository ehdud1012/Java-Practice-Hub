
import java.util.Random;
import java.util.Scanner;
// 29 / Test02 정리

// 복습
// 한줄 한줄 ㄴ뭔지 알기
// 예제 지우고 다시 작성해보기
// 문제 내보기
public class PPSMain_RockScissorPaper {

	public static int input_hand() {
		Scanner oo = new Scanner(System.in);
		System.out.print("머 : ");
		int hand = oo.nextInt();
		return hand > 3 || hand < 1? input_hand() : hand;
	}
	public static int com_hand() {
		return new Random().nextInt(3) + 1; // 변수 필요없으면 만들지 말기
	}
	public static void printRule() {
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보"); 
		/* 굳이 안써도 됨 항목이 많지 않기 때문
		for (int i = 0; i < hand.length; i++) {
			if (i > 0) System.out.printf("%d. %s\n" , i, hand[i]);
		}*/
		System.out.println("-------------------------");
	}
	public static void printHand(String[] hand, int userhand, int c) {
		System.out.printf("나 : %s\n" , hand[userhand]);
		System.out.printf("컴 : %s\n" , hand[c]);
	}
	// 알고리즘
	//	1) 사람이 사고하는 과정 묘사
	//	2) 뭔가 효율적일 수 없을까
	//	3) 천재 ^__^
	// 가위바위보 알고리즘
	public static int judge(int userhand, int c) {
		int t = userhand - c;
		if (t == 0) {
			System.out.println("무승부");
			return 0;
		}
		else if (t == -1 || t == 2) {
			System.out.println("패");
			return 2568743;
			
		}else {
			System.out.println("승");
			return 1;
		}
	}
	public static void main(String[] args) {
		String[] hand = {null, "가위", "바위", "보"}; // null 이 공간 차지 안함
		printRule();
		int userhand;
		int c ;
		int count;
		int w = 0;
		while (true) {
			userhand = input_hand();
			c = com_hand();
			printHand(hand, userhand, c);
			count = judge(userhand, c);
			if (count == 2568743) {
				System.out.printf("%d연승", w);
				break;
			}
			w += count;
		}
	}

}
