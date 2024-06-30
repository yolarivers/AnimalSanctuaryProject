package com.skilldistillery.animalsanctuary;

public class BluePoisonDartFrog extends Animal {

	private static final String noise = "Ribbit";

	public BluePoisonDartFrog(String name) {
		super(name, "Blue Poison Dart Frog", "Blue");
	}

	@Override
	public void makeSound() {
		System.out.println(noise);
	}

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		System.out.println(noise + " I love eating these " + amount + " insects.");
	}

}
