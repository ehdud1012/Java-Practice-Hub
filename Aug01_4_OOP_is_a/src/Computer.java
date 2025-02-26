
public class Computer extends Product{
	String cpu;
	int ram;
	int hdd;
	
	@Override
	public void print() {
		super.print();
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
}
