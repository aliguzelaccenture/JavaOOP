package com.qa.oop.inheritance;

public class Human extends Bipedal {
	private String name;
	private int age;
	

	public Human(String name, int age) {
		super(false);
		this.name = name;
		this.age = age;
	}
	
	public void breastfeedYoung () {
		
		System.out.println("feeding baby... ");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public void doJava() {
		System.out.println("I'm a human that can code Java");
	}
	
	

}
