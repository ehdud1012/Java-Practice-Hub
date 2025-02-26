
import java.util.Arrays;
import java.util.Random;

public class PPSMain4_Lotto {

	public static int random_num(int[] lotto, int num, int i) {
		num = new Random().nextInt(45) + 1;
		for (int j = 0; j < i ; j++) {
			if (lotto[j] == num) return random_num(lotto, num, i);
		}
		return num;
	}
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int num = 0;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random_num(lotto, num, i);
		}
		Arrays.sort(lotto);
		for (int i : lotto) {
			System.out.println(i);
		}
	}

}
