
import java.util.Random;
import java.util.Scanner;

public class RSMain5_UpdownGame {
	public static int random_num() {
		Random r = new Random(); // 뽑을 준비
		return r.nextInt(10001);
	}
	public static int input_Num() {
		Scanner oo = new Scanner(System.in);
		System.out.print("머 : ");
		int num = oo.nextInt();
		return num > 10000 || num < 1? input_Num() : num;
	}
	public static boolean judge(int x, int num) {
		if (num < x ) System.out.println("UP");
		else if (num > x) System.out.println("DOWN");
		else return false;
		return true;
	}
	public static void main(String[] args) {
		int x = random_num();
		System.out.println(x);
		int num;
		for (int count = 1; true; count++) {
			num = input_Num();
			if (!judge(x, num)) {
				System.out.printf("%d번만에 정답", count);
				break;
			}
		}	
	}
}