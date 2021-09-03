package com.qa.abstractinterfaces;

public class Reptile implements RunningInterface, EatingInterface, SleepingInterface {

	private String type;
	
	public void sleep() {
		System.out.println("Body temps have dropped - time to hibernate");

	}

	public void eat() {
		System.out.println("Eat eat eat..");

	}

	public void run() {
		System.out.println("Run run run..");

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Reptile(String type) {
		super();
		this.type = type;
	}
	

}
