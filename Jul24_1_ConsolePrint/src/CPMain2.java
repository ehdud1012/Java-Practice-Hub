
public class CPMain2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* 이름    \t김도영\t\t*");
		System.out.println("*********************************");
		System.out.println("* H.p   \t010-3069-2452\t*");
		System.out.println("* 생년월일 \t04.10.12\t*");
		System.out.printf("* 주소    \t%s\t\t*\n", "화성시 동탄");
		System.out.printf("* 학교    \t%s\t*\n", "명지전문대학");
		System.out.printf("* 키     \t%.1f\t\t*\n", 156.321);
		System.out.println("*********************************");
		
		//콘솔기반이기 때문에 바로 창 닫는걸 막는 코드
		//Thread.sleep(5000);
	}
}
