package com.skilldistillery.animalsanctuary;

public class Sanctuary {
    private Animal[] enclosures;
    private Attendant attendant;

    public Sanctuary() {
        this.enclosures = new Animal[7];
    }

    public void setAttendant(Attendant attendant) {
        this.attendant = attendant;
    }

    public void listAnimals() {
        System.out.println("Here are all the amazing animals in our sanctuary:");
        for (Animal animal : enclosures) {
            if (animal != null) {
                System.out.println(animal.getName() + " the " + animal.getSpecies());
            } else {
                System.out.println("This enclosure currently has no animals.");
            }
        }
    }

    public void addAnimal(Animal animal) {
        addAnimal(animal, true);
    }

    public void addAnimal(Animal animal, boolean showMessage) {
        boolean added = false;
        for (int i = 0; i < enclosures.length; i++) {
            if (enclosures[i] == null) {
                enclosures[i] = animal;
                if (showMessage) {
                    System.out.println(animal.getName() + " the " + animal.getSpecies() + " has been added to the sanctuary.");
                }
                added = true;
                break;
            }
        }
        if (!added && showMessage) {
            System.out.println("Sorry, but we've reached maximum animal capacity in the sanctuary!");
        }
    }

    public void startAttendantRounds() {
        if (attendant != null) {
            attendant.makeRounds(enclosures);
        } else {
            System.out.println("No attendant is assigned to the sanctuary.");
        }
    }
}
