
public class Referee {
	
	static final String[] RULEBOOK = {null, "가위", "바위", "보"};
	
	public static User callBlueCorner() {
		return new User();
	}
	
	public static Enemy callRedCorner() {
		return new Enemy();
	}
	
	public static int getBluePaper(User user) {
		System.out.print("머 낼래 : ");
		int paper = user.submit();
		return paper < 1 || paper >3 ? getBluePaper(user) : paper;
	}
	public static int getRedPaper(Enemy enemy) {
		return enemy.submit();
	}
	public static int judge(int redPaper, int bluePaper) {
		int t = bluePaper - redPaper;
		if (t == 0) {
			System.out.println("무승부");
			return 0;
		}
		else if (t == -1 || t == 2) {
			System.out.println("패");
			return -1;
			
		}
		System.out.println("승");
		return 1;
		
	}
	public static void tellHand(int redPaper, int bluePaper) {
		System.out.printf("나 : %s\n" , RULEBOOK[bluePaper]);
		System.out.printf("컴 : %s\n" , RULEBOOK[redPaper]);
		System.out.println("--------------------------------");
	}
	public static void tellRule() {
		for (int i = 1; i < RULEBOOK.length; i++) {
			System.out.printf("%d. %s\n", i, RULEBOOK[i]);
		}
		System.out.println("--------------------------------");
	}
	public static void start() {
		Enemy red = callRedCorner();
		User blue = callBlueCorner();
		tellRule();
		
		int redPaper;
		int bluePaper;
		int result;
		while (true) {
			redPaper = getRedPaper(red);
			bluePaper = getBluePaper(blue);
			tellHand(redPaper, bluePaper);
			result = judge(redPaper, bluePaper);
			
			if (result == -1) {
				break;
			}
			blue.win += result;
		}
		tellWinCount(blue);
	}
	
	public static void tellWinCount(User user) {
		System.out.println(user.win + "연승");
	}
	
}
