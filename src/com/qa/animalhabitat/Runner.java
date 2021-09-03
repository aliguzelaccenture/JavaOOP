package com.qa.animalhabitat;

public class Runner {
	public static void main(String[] args) {
		
		// Create habitat 'jungle'
		Habitat jungle = new Habitat();
		
		// Create some gorillas
		Gorilla g1 = new Gorilla("G1", "Silverback", 10, true);
		Gorilla g2 = new Gorilla("G2", "Mountain", 7, false);
		Gorilla g3 = new Gorilla("G3", "Silverback", 8, false);
		
		
		
		jungle.addToJungle(g1);
		jungle.addToJungle(g2);

		jungle.addToJungle(g3);
		
		jungle.listAll();
		
		jungle.silverBacksBeatChests();
		
		jungle.removeAllLeaders();
		
		jungle.listAll();
		
		jungle.addToJungle(g1);
		
		jungle.removeAllFollowers();

		jungle.listAll();
		
		jungle.addToJungle(g2);
		
		jungle.removeFromJungle();
		
	}
}
