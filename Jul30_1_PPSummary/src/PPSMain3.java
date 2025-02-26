
import java.util.Arrays;

public class PPSMain3 {
	// bubble sort : 버블 정렬 => 최악의 알고리즘 효율X
	// 두개씩 비교하여 정렬
	public static void bubbleSort(int[] ar) {
		int t;
		for (int turn = 0; turn < ar.length - 1 ; turn++) {
			// 이미 정렬된 부분을 안봐도 되니까 turn 빼주기 
			for (int i = 0; i < ar.length - 1 - turn; i++) { 
				if (ar[i] > ar[i+1]) {
					t = ar[i];
					ar[i] = ar[i+1];
					ar[i+1] = t;
				}
			}
		}
	}
	// 얘도 최악의 알고리즘 효율X 연습용ㅇㅇ
	public static void selectionSort(int [] ar) {
		int t;
		int min;
		int minIndex;
		for (int turn = 0; turn < ar.length - 1 ; turn++) {
			min = ar[turn];
			minIndex = turn;
			for (int i = turn + 1; i < ar.length; i++) {
				if(min > ar[i]) {
					min = ar[i];
					minIndex = i;
				}
			}
			t = ar[minIndex];
			ar[minIndex] = ar[turn];
			ar[turn] = t;
		}
	} 
	public static void main(String[] args) {

		int[] ar = {88, 1, 34, 9, 4};
		Arrays.sort(ar); // (작 -> 큰)배열 정리하는 명령어
		// bubbleSort(ar);
		// selectionSort(ar);
		
		for (int i : ar) {
			System.out.println(i);
		}
	}

}
