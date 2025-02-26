import java.util.Scanner;
// 주석 단축기
// ctrl + shift + /(numpad)
// ctrl + shift + *(numpad)

//함수명 짓는 조건 == 변수명 짓는 조건
//변수명 : 명사형
//함수명 : 동사형

//기능별로
//	deleteData
//	printEmotion
//	printData
//	printWeather
//	updateEmotion

//주제별로
//	dataDelete
//	dataPrint
//	emotionPrint
//	emotionUpdate
//	weatherPrint

//저게 장점???
//100% WORA가 되지 않음
//요즘 나오는 언어들 다 저런데
//느려

//WORA(Write Once, Run Anywhere)
//1) JRE가 자동으로 JVM(Java Virtual Machine)을 만들어서 OS위에 올리고
//2) JVM위에서 자바프로그램이 실행
//3) JVM이 main함수를 자동으로 불러서

public class FMain {
//  함수
//	public static 리턴타입 함수명 (자료형 변수명 ...){
//	내용
//	return;
//  }	
	public static void weatherPrint() {
		System.out.println("찜기 안에 있는 만두가 된 느낌");
	}
	
	// 기온을 넣으면, 더운지 추운지 출력하는 함수
	// 30도 넘으면 더움 출력, 아니면 추움 출력
	public static void Temperature() {
		Scanner oo = new Scanner(System.in);
		System.out.print("오늘 기온 : ");
		double temp = oo.nextDouble();
		String comment = temp >= 30 ? "더움" : "추움";
		
		System.out.println(comment);
	}
	// 정수 2개 넣으면, 더 큰 수를 구하는 함수
	public static int sizeComparise(int a, int b) {
		return (a > b) ? a : b;
		
	}
	// main 은 맨 마지막에 !! 
	public static void main(String[] args) {
		weatherPrint();
		Temperature(); 
		int aaa = sizeComparise(5, 60);
		System.out.println(aaa);
	}
}