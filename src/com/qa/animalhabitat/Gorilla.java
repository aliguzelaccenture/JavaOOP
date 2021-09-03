package com.qa.animalhabitat;

public class Gorilla {
	private String name;
	private String type;
	private int strength;
	private boolean leader;
	
	public void beatChest() {
		System.out.println(this.name + ": " + "Oo Oo Oo Aa Aa");
	}
	
	public Gorilla(String name, String type, int strength, boolean leader) {
		super();
		this.name = name;
		this.type = type;
		this.strength = strength;
		this.leader = leader;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public boolean isLeader() {
		return leader;
	}

	public void setLeader(boolean leader) {
		this.leader = leader;
	}

}
