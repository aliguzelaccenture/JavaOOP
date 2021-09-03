package com.qa.abstractinterfaces;

public class Mammal implements RunningInterface, SleepingInterface, EatingInterface {
	
	private String type;

	public void sleep() {
		System.out.println("Sleep");
		
	}

	public void eat() {
		System.out.println("Eat");
	}

	public void run() {
		System.out.println("Run");
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Mammal(String type) {
		super();
		this.type = type;
	}
	
	
}
