package com.skilldistillery.animalsanctuary;

public class CaneToad extends Animal {
	private static final String noise = "Croak";

	public CaneToad(String name) {
		super(name, "Cane Toad", "Brown");
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
		System.out.println(noise + " I love eating these " + amount + " bugs.");
	}
}
