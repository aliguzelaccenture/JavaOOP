package com.qa.abstractinterfaces;

public class Runner {
	public static void main(String[] args) {
		Mammal primate = new Mammal("Primate");
		Reptile snake = new Reptile("Snake");
		
		primate.eat();
		snake.sleep();
		snake.eat();
	}
}
