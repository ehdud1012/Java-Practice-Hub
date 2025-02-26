// 솔데스크
//	강의실은 여러 개
//	프린터는 5층에 공용으로 한 대 (모든 강의실에서 공용)

// 컴
//	시스템이 여럿 (다양한 운영체제)
//	콘솔창은 그 시스템들이 공용으로 사용 (WORA)

/* System.out.println();
	public class System{
		static 콘솔창 out = ...;
}*/

public class OMain2 {
	public static void main(String[] args) {		
		// Classroom c2 = new Classroom("1013호", "10층");
		// c2.printer.print();
		
		Classroom.printer.print();
		System.out.println();
	}
}
