package com.skilldistillery.animalsanctuary;

import java.util.Random;

public class Attendant {
    public void makeRounds(Animal[] animals) {
        Random random = new Random();

        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("Feeding " + animal.getName());
                int amount = random.nextInt(10) + 1; 
                animal.eat(amount);
            } else {
                System.out.println("The enclosure is empty.");
            }
        }

        System.out.println("Time for my break!");
    }
}
