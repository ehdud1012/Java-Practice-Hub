
import java.util.Random;
//반복 조건이 명확 : while, do-while[무조건 1번 반복하고 시작]
public class RSMain2 {
	public static void main(String[] args) {
		//랜덤한 정수
		Random r = new Random(); // 뽑을 준비
		int x = r.nextInt(10);
		System.out.println(x);
		
		while (x != 5) {  // 끝낼 조건 XX   계속할 조건 OO
			x = r.nextInt(10);
			System.out.println(x);
		}
		do {
			x = r.nextInt(10);
			System.out.println(x);			
		} while (x != 5); // 끝낼 조건 XX   계속할 조건 OO
	}
}
