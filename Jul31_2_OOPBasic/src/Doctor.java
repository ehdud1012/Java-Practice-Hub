// 지역 변수 : 함수 속에서 만든 변수
//		함수 진행하는 동안에만 쓰고 버릴 임시 데이터
//		기본값이 없어서, 초기화하고 사용해야 함

// 함수 인자 (parameter) 
//		그 함수 진행에 필요한 재료
//		기본값 개념 없이, 함수 호출할 때 넣어주는 값

// 멤버 변수 (member variable) 
//		객체의 속성
//		기본값이 있음 (참조형 : null / 기본형 : 0)

public class Doctor {
	
	public void start() { // 업무보기
		Guest guest = callGuest(); // 퇴근하면 또 따로 연락 X ==> 지역변수 맞음  
							   // 만약 발표 등으로 저장이 필요하다면 = 속성으로
		ask(guest);
		calculate(guest);
		tellResult(guest);
	}
	
	public Guest callGuest() {
		return new Guest();
	}
	
	public void ask(Guest guest) {
		System.out.print("이름 : ");
		guest.name = guest.tellName();
		
		System.out.print("키(m) : ");
		guest.height = guest.tellHeight_Weight();
		if (guest.height > 3) {
			guest.height /= 100;
		}
		
		System.out.print("몸무게(kg) : ");
		guest.weight = guest.tellHeight_Weight();
	}
	
	 public void calculate(Guest guest) { // guest 에 다 담겨 있어서
		 guest.bmi = guest.weight / (guest.height * guest.height);
		 guest.status = "저체중";
		 if (guest.bmi >= 25) guest.status = "비만";
		 else if (guest.bmi >= 23) guest.status = "과체중";
		 else if (guest.bmi >= 18.5) guest.status = "정상";
	}
	 
	 public void tellResult(Guest guest) {
		 System.out.println("--------------------------");
		 System.out.printf("BMI : %.2f\n", guest.bmi );
		 System.out.printf("%s님은 %s입니다.", guest.name, guest.status);
	}
}
