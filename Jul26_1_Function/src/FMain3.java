
import java.util.Scanner;
// function recursive call
// 재귀적 계산은 : 원하는 데이터 나올때까지 반복할 때 사용

public class FMain3 {
	public static int getEven() {
		Scanner oo = new Scanner(System.in);
		System.out.print("짝수 : ");
		int n = oo.nextInt();
		System.out.println("--------------------------");
		return n % 2 == 0 ? n : getEven();
	}

	public static void main(String[] args) {
		int n = getEven();
		System.out.println(n);
	}
}
