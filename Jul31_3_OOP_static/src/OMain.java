// 한국어로 설계 -coding-> .java[영어] - compile -> .class - 실행

// 1) JVM이 OS환경에 맞게 구성되서 OS 위에 올라감
// 2) 기계어 상태의 프로그램 소스가 stack 영역에 
// 3) static 멤버 변수가 static 영역에 만들어짐
// 4) JVM이 OMain.main() 메서드 호출
public class OMain {
	public static void main(String[] args) {
		// 아직 게장 없
		// static 일 경우
		System.out.println(Gejang.producer); // 클래스명.멤버변수명
		Gejang.test(); // static 메소드 사용  
		System.out.println("------------------------");
		
		Gejang g = new Gejang();
		g.name = "추석특선세트"; // 객체변수명.멤버변수명
		g.price = 59900;
		g.weight = 5;
		// g.producer = "김수미";
		g.printInfo();
		System.out.println("------------------------");
		
		Gejang g2 = new Gejang();
		g2.name = "양념게장세트";
		g2.price = 39900;
		g2.weight = 5;
		// g2.producer = "김수미";
		g2.printInfo();
		System.out.println("------------------------");
		
		
	}
}

