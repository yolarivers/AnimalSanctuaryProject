package com.skilldistillery.animalsanctuary;

public abstract class Animal {
    private String name;
    private String species;
    private String color;

    public Animal(String name, String species, String color) {
        this.name = name;
        this.species = species;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public abstract void makeSound();

    public void makeNoise() {
        System.out.println("Animal noise...");
    }

    public void eat(int amount) {
        System.out.println("I'm eating " + amount + " foods.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
