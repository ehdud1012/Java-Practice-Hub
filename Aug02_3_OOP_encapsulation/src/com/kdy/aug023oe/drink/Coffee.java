package com.kdy.aug023oe.drink;

// main 쪽 실제 클래스는 다른 패키지일 수 밖에 없음

// 작업물 공유하는 문화
//		이 클래스를 실제로 사용하는 쪽은 다른 패키지
// 	==> 쓰려고 만들었는데 private? == 대부분 public
// 	아니래 ! public 은 위험해

// encapsulation (캡슐화) : 기본사항 
//		public 을 써서 외부에서 직접 건들게 해놓으면
//		잘못된 데이터가 입력될 수 있음

public class Coffee {
	// 캡슐화 방법
	
	// 1) 멤버변수를 외부에서 못건들게 = private
	private String name;
	private int price;
	
	// 2) 멤버변수를 건들 수 있는 통로 마련
	//			우클릭 -> 소스 -> getter, setter
	
	public int getPrice() {
		return price;
	}
	
	// 3) 그 통로에 안전 장치 붙이기
	public void setPrice(int price) {
		if (price < 0) price = -price;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
}
