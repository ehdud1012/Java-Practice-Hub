import java.util.Scanner;

public class CSMain3_BMI {
	public static double get_H() {
		Scanner oo = new Scanner(System.in);
		System.out.print("키(m) : ");
		double h =  oo.nextDouble();
		return h > 3 ? get_H() : h;
	} 
	public static String get_N() {
		Scanner oo = new Scanner(System.in);
		System.out.print("이름 : ");
		return oo.next();
	}
	public static double get_W() {
		Scanner oo = new Scanner(System.in);
		System.out.print("몸무게(kg) : ");
		return oo.nextDouble();
	}
	public static double calculate_B(double h, double w) {
		return w / (h * h); 
	}
	public static void printResult(String name, double b) {
		System.out.println("--------------------------");
		System.out.printf("BMI : %.2f\n", b );
		String result = "저체중";
		if (b >= 25) result = "비만";
		else if (b >= 23) result = "과체중";
		else if (b >= 18.5) result = "정상";
		System.out.printf("%s님은 %s입니다.", name, result);
	}
	public static void main(String[] args) {
		String name = get_N();
		double h = get_H();
		double w = get_W();
		double b = calculate_B(h, w); 
		printResult(name, b);
	}
}
