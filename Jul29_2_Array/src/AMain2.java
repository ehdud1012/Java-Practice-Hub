
//JVM이 main 을 부르며 시작

//원래 자바 프로그램 실행 : java -jar 파일명.jar
//java -jar 파일명 aaa bbb ccc -> aaa bbb ccc부분이 arg로 들어감

//BD/AI분야 들어가면 
//		java - jar 파일명 분석할대상 결과위치

public class AMain2 {

	public static void main(String[] args) throws InterruptedException { 
		// 클래식 for
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("------------------------");
		// 신형 for
		for (String string : args) {
			
		}

		Thread.sleep(3000);
	}

}
