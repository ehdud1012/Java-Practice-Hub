package com.kdy.aug053os.human;

import com.kdy.aug053os.hero.Hero;

public class Human {
	private String name;
	private Hero hero;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void jjim (Hero h) {
		hero = h;
	}
	
	public void helpme() {
		hero.attack();
	}
}
