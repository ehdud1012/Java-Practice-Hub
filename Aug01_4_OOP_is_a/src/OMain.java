// 객체간의 관계
//		A has a B
//		A is  a B

//		택시 is a 자동차 : 상속관계 

public class OMain {
	public static void main(String[] args) {
		Pen pen = new Pen();
		pen.name = "모나미153";
		pen.price = 500;
		pen.color = "검정";
		pen.print();
		System.out.println("--------------------------");
		
		Computer c = new Computer();
		c.name = "조립식1322";
		c.price = 800000;
		c.cpu = "i7-1234";
		c.ram = 16;
		c.hdd = 500;
		c.print();
		System.out.println("--------------------------");
		
		Notebook n = new Notebook();
		n.name = "그램1234";
		n.price = 2000000;
		n.cpu = "i5-4412";
		n.ram = 32;
		n.hdd = 250;
		n.weight = 5;
		n.battery = 8;
		n.print();
		System.out.println("--------------------------");

		Shoes s = new Shoes("에어", 110000, 230);
		s.print();
		
		System.out.println("--------------------------");
		
		Monitor m = new Monitor("삼성123", 500000);
		m.print();
	}
}
