// 객체간의 관계
//		A has a B
//		A is  a B

//		사람 has a 개 : 반려동물
//		개 has a 사람 : 주인
public class OMain {

	public static void main(String[] args) {
		Dog d = new Dog("후추", 3);
		d.print();
		System.out.println("-------------------------------");
		
		Human h = new Human("홍길동", 30);
		h.pet = d; // 내 펫은 후추 ^ㅁ^/
		h.print();
		System.out.println("-------------------------------");
		
		// h 의 이름만 단독 출력
		System.out.println(h.name);
		
		// h 의 반려동물의 이름
		System.out.println(h.pet.name);
		
		// h 의 반려동물의 모든 정보
		h.pet.print();
		System.out.println("-------------------------------");
	}
}
