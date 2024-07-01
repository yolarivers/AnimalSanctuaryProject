package com.skilldistillery.animalsanctuary;

public class FireSalamander extends Animal {
    private final String noise = "Croak";

    public FireSalamander(String name) {
        super(name, "Fire Salamander", "Black and Yellow");
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
        System.out.println(noise + " I love eating these " + amount + " spiders.");
    }
}
