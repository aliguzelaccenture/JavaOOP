package com.qa.oop.inheritance;

public abstract class Bipedal extends Mammal {
	
	private boolean tail;

	public boolean isTail() {
		return tail;
	}

	public void setTail(boolean tail) {
		this.tail = tail;
	}

	public Bipedal(boolean tail) {
		super(false, 2);
		this.tail = tail;
	}

	public abstract void breastfeedYoung();
	

}
