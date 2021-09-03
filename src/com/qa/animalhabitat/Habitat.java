package com.qa.animalhabitat;

import java.util.ArrayList;

public class Habitat {

	ArrayList<Gorilla> jungle = new ArrayList<>();
	
	
	public void addToJungle(Gorilla gorilla) {
		jungle.add(gorilla);
		System.out.println(gorilla.getName() + " has been added to the jungle!");
	}
	
	public void removeFromJungle() {
		jungle.clear();
		System.out.println("Jungle completely burned, habitat no longer can sustain wildlife");
	}
	

}
