package com.skilldistillery.animalsanctuary;

public class Animal {
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

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

}
