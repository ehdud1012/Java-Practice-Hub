
//C + f11 : 실행
//f11 : 디버그
//		f6 : 한줄씩 실행

//for 반복문 
//반복 횟수가 명확
//반복문 안에 변수 생성 자제
public class RSMain {

	public static void main(String[] args) {
		/*
		for (int i = 1; i < 10; i++) {
			System.out.printf("2 X %d = %d\n", i , i * 2);
		}
		System.out.println("--------------------------");
		
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.printf("10까지의 합 : %d\n", sum);
		System.out.println("--------------------------");
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d X %d = %d\t", j , i, i * j);
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("ㅋ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		
		for (int i = 5; i > 0; i--) { // for (int i = 0; i < 5; i++)
			for (int j = 0; j < i; j++) { // for (int j = 0; j < (5-i); j++)
				System.out.print("ㅋ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("ㅋ");
		}
		System.out.println("--------------------------");
		
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print(i % 2 != 0 ? "ㅋ" : "ㅎ");
			}
			System.out.println();
		}
		System.out.println("========================>");
		String s;
		for (int i = 1; i < 6; i++) {
			s = i % 2 != 0 ? "ㅋ" : "ㅎ";
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}

}