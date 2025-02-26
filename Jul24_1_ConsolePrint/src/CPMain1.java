
public class CPMain1 {
	public static void main(String[] args) {
		System.out.println("ㅋ");  // syso + C + 스페이스 / 줄 바꿈 O
		System.out.print("ㅍ");  // 줄 바꿈 X

		System.out.println("김\r도영");
		System.out.println("김\n도영"); 
		System.out.println("김\t도영"); //  \t = 탭
		System.out.println("김\b도영"); //  \b = 백스페이스 / 1바이트 삭제 자바는 글씨 하나당 2바이트라서 깨짐
		System.out.printf("%.2f\n", 3.24566);  // 형식 지정하여 출력 / 소수점
		System.out.println("--------------"); 
		//  \n = new line 줄만 바꿈 
		//  \r = carriage return 커서를 맨앞으로
		//  \r\n = 제대로 줄바꿈
		
		int a = 10;
		System.out.printf("a는 %d\n", a);
		System.out.printf("b는 %05d\n", 5); // %05d : 5자리로 나오게 / 빈자리는 0으로 
		
		System.out.printf("c는 %f\n", 5.32457);
		System.out.printf("d는 %.2f\n", 5.32957); // %.2f: 소수점 2자리까지 (반올림)
		
		System.out.printf("e는 %s\n", "zzzz");
		System.out.printf("e는 %s, a는 %d이다\n", "zzzz", a);
		
		System.out.printf("습도 : %f%%\n", 65.3467);
		// %d 정수형 데이터 자리
		// %f 실수형 데이터 자리
		// %s 문자열 데이터 자리
		System.out.println("--------------");
	}
}
