
// 함수를 재귀적(recursive)으로 호출
//		: 계산문제를 반복문 안쓰고 굳이 함수로??? -> 느려짐

// 함수 
//		정의해놓고 호출해서 씀 : JUMP연산이 일어나므로 느려짐
//		요즘 컴 좋아서, 알고리즘보다는 유지보수에 용이한 프로그래밍을 원함
//		=> 함수정리 해놓으면 유지보수에 좋음 = main 짧게

public class FMain2 {
	// 1부터 넣은 숫자까지 다 더하는 함수
	public static int getSum(int i) {
		return (i == 1) ? 1 : (i + getSum(i - 1));
	}

	// 팩토리얼
	public static int getF(int i) {
		return (i == 1) ? 1 : (i * getF(i - 1));
	}

	// 피보나치
	public static int getP(int i) {
		return (i < 3) ? 1 : getP(i - 2) + getP(i - 1);
	}

	public static void main(String[] args) {
		System.out.println(getSum(4));
		System.out.println(getF(5));
		System.out.println(getP(7));
	}
}
