import java.util.Scanner;

public class Guest {
	String name;
	double height;
	double weight;
	double bmi;
	String status;
	
	Scanner mouth = new Scanner(System.in); // 쓰레기이지만 진도가 안나감 (나중에)
	
	public String tellName() {
		return mouth.next();
	}
	public double tellHeight_Weight() {
		return mouth.nextDouble();
	}
}
