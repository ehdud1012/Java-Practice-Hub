package com.kdy.aug024opp.car;

public class Carfactory {
	
	public static Car made(int num) {
		if (num == 1) {
			return new Truck();
		}else if (num == 2) {
			return new Sedan();
		}
		return new Bus();
	}

}
