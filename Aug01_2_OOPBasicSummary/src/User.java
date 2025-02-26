import java.util.Scanner;

public class User {
	Scanner brain;
	int win; // 기본값있음 0
	
	public User() {
		brain = new Scanner(System.in);
	}
	
	public int submit() {
		return brain.nextInt();
	}
}
