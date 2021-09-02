package com.qa.oop.inheritance;

public class Runner {
	public static void main(String[] args) {
		Human Alice = new Human("Alice", 32);
		
		System.out.print(Alice.getName() + " is ");
		Alice.breastfeedYoung();
		Alice.doJava();
		
		Dog Sparkle = new Dog("Sparkle", 12);
		Sparkle.bark();
		System.out.print(Sparkle.getName() + " is ");
		Sparkle.breastfeedYoung();
	}
}
