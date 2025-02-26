// 상속을 언제? 
//		- 공통된거 묶어서 사용할 때
//		- 기존의 만들어진 기능에 추가하고 싶을 때 

import java.util.Random;
import java.util.Scanner;
// 실무 홀수만 나오기
public class OMain2 {
	public static void main(String[] args) {
		KimRandom kr = new KimRandom();
		System.out.println(kr.nextInt(10));
		
		// Scanner sc = new Scanner(System.in);
		
	}
}
