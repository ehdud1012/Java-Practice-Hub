
//class : object 만들 때 필요한거 : 붕어빵틀
//object/instance : class 로 만들어낸거 : 붕어빵

//Garbage Collection
//		heap 영역은 사용했으면 사람이 직접 지워야하는데
//		GC : heap 영역을 언어 자체적으로 지워주는 시스템
//* 면접
//==> GC란? steak 영역은 프로그램 종료 시 지워지는데, 
//			heap 영역은 사용하였으면 직접 지워야하기 때문에 
//			언어 자체적으로 자동으로 지워주는 시스템 입니다.
//		==> 언제 자동으로 지워주는데 ?
//			그 heap 영역에 더이상 접근할 방법이 없을 때 지워지게 됩니다. (파이썬에서 증명해줄겡 ~)
//			= c 언어는 #7 (번지값)으로 접근이 가능하지만, 
//			  java 는 그럴 수 없기에 번지값을 사용하는 변수가 사라지게 되면 GC가 실행됩니다.
	
//면접 요령 = 발표가 아니고, 말을 해라 / 내가 안다고 느끼도록 말하기
//java 의 특징적인 부분 :  **어떤 언어를 하든지 특징 꼭 생각해보기
//전 세계적으로 많이 사용
//개발자들끼리 자기 작업물 공유하는 문화		
public class OMain {

	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.name = "모나미153";
		pen1.color = "검정";
		pen1.price = 500;
		pen1.printInfo();
		System.out.println("-------------------------");
		
		Pen pen2 = new Pen();		
		pen2.name = "모나미153골드";
		pen2.color = "파랑";
		pen2.price = 5000;
		pen2.printInfo();
		System.out.println("-------------------------");

		// pen1과 똑같은 펜 하나 더 
		Pen pen3 = pen1; 
		pen3.printInfo();
		System.out.println("-------------------------");
		
		// pen3 가격을 100원으로
		pen3.price = 100;
		pen3.printInfo();
		System.out.println("-------------------------");
		
		pen1 = null; // 더이상 pen1 으로는 첫번째 펜에 접근 불가
					 // 하지만 pen3 이 있기에 heap 영역의 메모리에서 삭제 안됨
		pen3 = null; // ==> 이러면 GC 발동 = 첫번재 펜이 메모리에서 삭제
		
		pen2 = null;
		
		// 굳이 이렇게 안해도 프로그램 종료시 변수가 삭제되기 때문에 자동으로 삭제됨
		// 하지만 종료가 되기 전 할 일이 많이 있다면, 위의 작업이 중요함
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		
	}
}