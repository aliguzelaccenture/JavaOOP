package com.qa.animalhabitat;

public class Runner {
	public static void main(String[] args) {
		
		// Create habitat 'jungle'
		Habitat jungle = new Habitat();
		
		// Create some gorillas
		Gorilla g1 = new Gorilla("G1", "Silverback", 10, true);
		Gorilla g2 = new Gorilla("G2", "Mountain", 7, false);
		
		
		jungle.addToJungle(g1);
		jungle.addToJungle(g2);
		
		jungle.removeFromJungle();
		
	}
}
