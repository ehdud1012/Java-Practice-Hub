// 기본이 extends Object
public class Product extends Object{ 
			// 클래스 명 뒤에 아무것도 없으면 저게 숨어있는거임

	String name;
	int price;
	
	public Product() {
		System.out.println("상품 생성");
	}
	
	public Product(String name, int price) {
		super(); // 이건 머시여 그래서 오브젝트 부른거임
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
}
