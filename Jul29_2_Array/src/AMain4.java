// Call By Reference, Call By Value
// 면접 질문 : Call By Reference, Call By Value 을 설명해봐라
// 답 : 
public class AMain4 {
	public static void test(int a, int[] b, int[] c) {
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);
		a = 100; // 메인에 영향을 주고 싶으면 return 사용
		b[0] = 100;
		c = new int[] {100, 200}; // 주소 값이 다름
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int[] b = {10,20};
		int[] c = {10,20};
		System.out.println(a); 
		System.out.println(b[0]); 
		System.out.println(c[0]); 
		test(a,b,c); 
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);
	}

}
