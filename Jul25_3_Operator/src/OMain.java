import java.util.Scanner;

public class OMain {
	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = oo.nextInt();
		
		System.out.print("y : ");
		int y = oo.nextInt();

		System.out.println("--------------------------");

		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
		
		System.out.println("--------------------------");
		
		String z = "ㅋ";
		System.out.println(x+z);  
		// (???+문자열) = 붙여서 문자열로 출력 / *는 불가능 
		
		System.out.println(10 / (double)3);
		System.out.println((double)10 / 3);
		System.out.println((double)(10 / 3));
		// /는 int-int => int / double-int => double / double-double => double
		
		System.out.println("--------------------------");
		x = x+3;
		System.out.println(x);
		
		y--;
		System.out.println(y);
	}
}
