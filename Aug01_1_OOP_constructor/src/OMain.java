// 쇼핑몰 -> 찜
public class OMain {

	public static void main(String[] args) {
		
		// 객체 생성
		// 클래스명 변수명 = new 생성자;
		// 클래스명 변수명 = new 클래스명();
			// 자동으로 생성자가 호출되게 되어있음
		Book b = new Book();
		
		b.name = "혼자 공부하는 자바";
		// b.maker = "한밫미디어";
		b.price = 30000;
		
		b.printInfo();
		b.test("sgje");
		
		//제목이 파이썬이고, 가격이 4000인책
		Book b2 = new Book("파이썬", "이지스", 40000);
		b2.printInfo();
		
		Mouse m = new Mouse("로지텍1234", 20000);
		m.print();
		
	}
}
