package com.qa.oop.inheritance;

public class Mammal {
	private boolean laysEggs;
	private int legs;
	public boolean isLaysEggs() {
		return laysEggs;
	}
	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void breastfeedYoung() {
		System.out.println("Feeding..");
	}
	public Mammal(boolean laysEggs, int legs) {
		super();
		this.laysEggs = laysEggs;
		this.legs = legs;
	}
	
	
	
}
