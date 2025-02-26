// if 문 : 조건식 가능 / 가독성
//		언제? - 

// switch : 조건식 불가능 / 문법이 특이
//		언제? - 권한 설정하는 상황에는 쓰이지만 일반적으로 잘 안쓰임
//				
// - 기능적으로 if보다 구려 (조건식X)
// - 가독성도 이상해 
// - 권한설정할 때 유리
public class CSMain2 {
	public static void main(String[] args) {
		int score = 80;
		switch (score) {
		case 80:	
			System.out.println("80점");
			break;
		case 70:	
			System.out.println("70점");
			break;
		default:
			System.out.println("나머지");
			break;
		}
		System.out.println("--------------------------");
		String grade = "일병";
		switch (grade) {
		case "이병":
			System.out.println("눈치");
		case "일병":
			System.out.println("관등성명");
		case "상병":
			System.out.println("훈련");
		default:
			System.out.println("잠");
			break;
		}
		System.out.println("--------------------------");
		
		String role = "DBA";
		switch (role) {
		case "DBA":
			System.out.println("서버관리");
			System.out.println("백업/복구");
			System.out.println("계정관리");
		case "DBP":
			System.out.println("CRUD");
		default:
			System.out.println("서비스 이용");
			break;
		}
	}
}
