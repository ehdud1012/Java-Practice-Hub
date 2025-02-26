import java.util.Scanner;

public class OMain4_Wheel {
	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);

		System.out.print("바퀴 둘레 : ");
		double wheel = oo.nextDouble();
		System.out.print("앞 기어 톱니 갯수 : ");
		double frontGear = oo.nextDouble();
		System.out.print("뒷 기어 톱니 갯수 : ");
		double backGear = oo.nextDouble();
		System.out.print("페달 구른 횟수 : ");
		double pedal = oo.nextDouble();
		
		System.out.println("--------------------------------");
		
		System.out.printf("이동거리 : %.2fcm", pedal * wheel * (frontGear / backGear));
	}
}
