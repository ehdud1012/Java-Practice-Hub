import java.util.Scanner;

public class CSMain {
	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		
		System.out.print("중간고사 : ");
		double a = oo.nextDouble();
		
		System.out.print("기말고사 : ");
		double b = oo.nextDouble();
		
		System.out.println("--------------------------");
		
		double c =  (a + b) / 2;
		System.out.printf("평균점수 : %.2f\n", c);
		
		if (c >= 90) System.out.println("수");
		else if (c >= 80) System.out.println("우");
		else if (c >= 70) System.out.println("미");
		else if (c >= 60) System.out.println("양");
		else System.out.println("가");
	}
}
