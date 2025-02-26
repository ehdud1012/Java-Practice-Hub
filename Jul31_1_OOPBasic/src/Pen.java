// 프로젝트 소스 파일 - 아이디어가 들어있기에 잘 안받음
// Pen.java의 기능만 넘기면 됨

// java = .jar 들의 집합
// 실무에서 파일 공유할 때
// .java[영어] - compile -> .class -압축-> .jar
// .jar 제출
// 소스를 못보니 사용하는 사람이 잘못쓸 수 있음 => 설명서 제작

// 설명서 주석
/**
 * 이것은 볼펜
 */
public class Pen {
	// member variable, attribute, field
	String name;
	String color;
	int price;
	
	// method
	public void printInfo() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
	
	/**
	 * BMI 계산
	 * @param h 키, 미터
	 * @param w 몸무게
	 * @return 계산된 BMI
	 */
	public double calculate(double h, double w) {
		return 1;
	}
}
