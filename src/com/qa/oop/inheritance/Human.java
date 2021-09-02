package com.qa.oop.inheritance;

public class Human extends Mammal {
	private String name;
	private int age;
	

	public Human(String name, int age,int legs, boolean laysEggs) {
		super(laysEggs, legs);
		this.name = name;
		this.age = age;
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
