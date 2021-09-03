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
	
	public void listAll() {
		for (Gorilla gorilla : jungle) {
			System.out.println(gorilla.getName());
		}
	}
	
	public void silverBacksBeatChests() {
		for (Gorilla gorilla : jungle) {
			if (gorilla.getType() == "Silverback") {
				gorilla.beatChest();
			}
		}
	}
	
	public void removeAllLeaders() {
		 for (int i=0; i < jungle.size(); i++) {
		     Gorilla gorilla = jungle.get(i);
		     if (gorilla.isLeader() == true) {
		        jungle.remove(gorilla);
		        i--;
		     }
		  }
	}
	
	public void removeAllFollowers() {
		 for (int i=0; i < jungle.size(); i++) {
		     Gorilla gorilla = jungle.get(i);
		     if (gorilla.isLeader() != true) {
		        jungle.remove(gorilla);
		        i--;//decrease the counter by one
		     }
		  }
	}

}
