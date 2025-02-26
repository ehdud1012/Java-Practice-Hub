// Product > Computer > Notebook
public class Notebook extends Computer {

	int weight;
	int battery;
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(weight);
		System.out.println(battery);
	}
}
