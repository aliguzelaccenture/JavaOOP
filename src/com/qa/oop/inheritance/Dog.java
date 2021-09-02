package com.qa.oop.inheritance;

public class Dog extends Mammal {

	private String name;
	private int dogYears;
	
	public Dog(String name, int dogYears) {
		super(false, 4);
		this.name = name;
		this.dogYears = dogYears;
	}
	
	public void bark() {
		System.out.println("Woof woof!");
	}
	
public void breastfeedYoung () {
		
		System.out.println("feeding puppy... ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDogYears() {
		return dogYears;
	}

	public void setDogYears(int dogYears) {
		this.dogYears = dogYears;
	}
	
	
}
