// 생성자는 상속이 안됨 -> 각자 다 따로 만들어 사용
// 하위 객체를 만들면 -> 상위 클래스 기본 생성자를 자동 호출
public class Shoes extends Product {
	double size;
	
	public Shoes() {
		// TODO Auto-generated constructor stub
	}

	public Shoes(String name, int price, double size) {
		// 이게 없으면 기본생성자 호출
		super(name, price); // Product 의 생성자 불러오기
		// super(); 얘는 진짜 없어도 댐
		this.size = size;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(size);
	}
	
}
