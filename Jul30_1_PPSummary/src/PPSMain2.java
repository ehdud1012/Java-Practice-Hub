
//wifi = 1 << 0;
//time24 = 1 << 1;
//int park = 1 << 2;
//int dam = 1 << 3;
public class PPSMain2 {

	public static void main(String[] args) {
		int option = 9;
		/*
		if (option >= 8) {
			System.out.println("흡연실");
			option -= 8;
		}
		if (option >= 4) {
			System.out.println("주차장");
			option -= 4;
		}
		if (option >= 2) {
			System.out.println("24시간");
			option -= 2;
		}
		if (option >= 1) {
			System.out.println("와이파이");
			option -= 1;
		}
		*/
		String[] op = {"와이파이", "24시간", "주차장", "흡연실"};
		int a;
		for (int i = op.length - 1; i > -1; i--) {
			a = 1 << i;
			if (option >= a) {
				System.out.println(op[i]);
				option -= a;
			}
		}
		
	}

}
