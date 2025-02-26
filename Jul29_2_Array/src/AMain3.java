
public class AMain3 {

	// 함수명은 달라야하지만 파라메터 부분(자료형 / 갯수)이 다르면 같아도 됨 : 호출할 때 구분 가능
	// overloading : 일부러 함수명 같게 짓는 기술명 
	// 대표적으로 println => 자료형마다 전부 존재
	public static void plus_num(int a, int b) {
		System.out.println(a+b);
	}
	public static void plus_num(int a, int b, int c) {
		System.out.println("3개임");
		System.out.println(a+b+c);
	}
	//함수 파라메터 쓸 때 : 자료형 ...변수명 = 갯수 상관없이 작성 가능
	public static void printGob(int ...is) {
		// 함수 내부에서는 배열 취급
		int gob = 1;
		for (int i = 0; i < is.length; i++) {
			gob *= is[i];
		}
		System.out.println(gob);
	}
	
	public static void main(String[] args) {
		printGob(11,2,3);
		System.out.println(10);
		System.out.println(10+"");
		plus_num(3, 10);
		plus_num(3, 10, 33);
		
		
	}

}
