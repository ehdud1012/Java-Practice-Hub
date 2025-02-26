import java.util.Random;

public class KimRandom extends Random {

	@Override
	public int nextInt(int bound) {
		// TODO Auto-generated method stub
		int num = super.nextInt(bound);
		return num % 2 == 0 ? nextInt(bound) : num;
	}
	
}
