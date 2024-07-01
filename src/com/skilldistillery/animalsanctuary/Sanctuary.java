package com.skilldistillery.animalsanctuary;

public class Sanctuary {
	private Animal[] enclosures;
	private Attendant attendant;

	public Sanctuary(Attendant attendant) {
		this.enclosures = new Animal[5];
		this.attendant = attendant;
	}

	public void listAnimals() {
		System.out.println("Listing all animals in the sanctuary:");
		for (Animal animal : enclosures) {
			if (animal != null) {
				System.out.println(animal.getName() + " the " + animal.getSpecies());
			} else {
				System.out.println("Empty enclosure.");
			}
		}
	}

	public void addAnimal(Animal animal, int index) {
		if (index >= 0 && index < enclosures.length) {
			if (enclosures[index] == null) {
				enclosures[index] = animal;
				System.out.println(
						animal.getName() + " the " + animal.getSpecies() + " has been added to the sanctuary.");
			} else {
				System.out.println("Enclosure at index " + index + " is already occupied.");
			}
		} else {
			System.out.println("Invalid enclosure index.");
		}
	}

	public void startRounds() {
		attendant.makeRounds(enclosures);
	}
}
