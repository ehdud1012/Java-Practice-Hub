
//배열은 다 참조형
//배열 탐색 - for each

//배열 실전 XXX => 실전 데이터 다루는 용으로는 탈락
//		간단하게 데이터 몇개 표현할 때
//배열 만들때는 사이즈를 알아야함
//사이즈 변경 불가 (추가, 삭제 ..)
//자료형 섞기 불가
public class AMain {

	public static void main(String[] args) {
		
		int[] eng = new int[3];
		eng[0] = 90;
		eng[1] = 60;
		eng[2] = 80;
		
		int[] mat = new int [] { 50, 70, 20 };
		 
		// 최종 진화 ~
		int[] kor = {100,90,80}; // 안되는 부분도 있어서 두번째도 알아둬라
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		System.out.println(kor.length); // 배열 갯수
		
		for (int i = 0; i < kor.length; i++) {
			int t = kor[i];
			System.out.println(t);
		}
		for (int i : kor) {
			System.out.println(i);
		}
	}

}
