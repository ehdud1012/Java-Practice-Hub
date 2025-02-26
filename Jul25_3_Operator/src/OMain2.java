import java.util.Scanner;

public class OMain2 {
	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = oo.next();
		
		System.out.print("키 : ");
		double h = oo.nextDouble();
		
		System.out.print("나이 : ");
		int n = oo.nextInt();

		System.out.println("--------------------------");

		System.out.printf("키는 %.1fcm, 나이는 %d살\n", h, n);
		
		boolean a = h >= 150;
		System.out.println(a);
		
		boolean b = n < 20;
		System.out.println(b);
		
	 	boolean c = (n % 2 == 1);
		System.out.println(c); 
		
		boolean d = (name == "홍길동");  
		System.out.println(d);
		// ** 연산자 : stack 영역 저장
		// ** name 에는 저장된 번지값으로 되어있기 때문에 false 가 나올 수 밖에 없음
		boolean e = name.equals("홍길동"); // ** 내용 비교하려먼 이렇게 사용
		
		boolean f =  h > 200 && n >= 10 ;  // 중간에 스킵 가능 / & = 스킵 불가
		System.out.println(f);
											// **** 웬만하면 스킵 가능하도록 배치
		boolean g = n >= 10 || h > 200; // 중간에 스킵 가능 |  = 스킵 불가
		System.out.println(g);
		
		boolean i = h > 200 ^ n >= 10; // XOR(^) : 배타적 OR / 두 개가 다를 경우만 true
		System.out.println(i);
		
		boolean j = !i;
		System.out.println(j);
		
		String comment = n >= 20 ? "어서오세요" : "나가";
		// 3항 연산자 조건식 ? 참일때 값 : 거짓일 때 값
		
		System.out.println(comment);
		
	}
}
