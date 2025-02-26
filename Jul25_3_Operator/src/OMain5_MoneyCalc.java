import java.util.Scanner;

public class OMain5_MoneyCalc {
	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);

		System.out.print("구매한 물건 가격 : ");
		int price = oo.nextInt();
		
		System.out.print("낸 돈 : ");
		int pay = oo.nextInt();
		
		int 거스름돈 = price - pay;
		
		int 오만원권 = 거스름돈 /50000;
		거스름돈 %= 50000;
		
		int 만원권 = 거스름돈 /10000;
		거스름돈 %= 10000;
		
		int 천원권 = 거스름돈 /1000;
		거스름돈 %= 1000;	
	}
}
