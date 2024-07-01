package com.skilldistillery.animalsanctuary;

public class PantherChameleon extends Animal {
    private final String noise = "Hiss";

    public PantherChameleon(String name) {
        super(name, "Panther Chameleon", "Various");
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
        System.out.println(noise + " I love eating these " + amount + " crickets.");
    }
}
