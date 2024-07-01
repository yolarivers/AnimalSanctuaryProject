package com.skilldistillery.animalsanctuary;

public class Hellbender extends Animal {
    private final String noise = "Grunt";

    public Hellbender(String name) {
        super(name, "Hellbender", "Brown or Gray");
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
        System.out.println(noise + " I love eating these " + amount + " fish.");
    }
}
