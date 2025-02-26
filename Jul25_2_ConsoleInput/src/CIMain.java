import java.util.Scanner;

public class CIMain {
	public static void main(String[] args) {
		// 실전에서는 안씀 ********
		// 콘솔 입력받을 준비
		Scanner ci = new Scanner(System.in);
		
		System.out.print("식당 전체 테이블 수 : ");
		int table_num = ci.nextInt();
		
		System.out.print("식당 평점: ");
		float review = ci.nextFloat();
		
		System.out.print("식당 이름 : " );
		String name = ci.next();   // 띄어쓰기하면 안됨
		
		System.out.print("식당 휴무일 : ");
		Boolean rest = ci.nextBoolean();
		
		System.out.println("------------------------");
		System.out.println(table_num);
		System.out.println(review);
		System.out.println(name);
		System.out.println(rest);
	}
}
