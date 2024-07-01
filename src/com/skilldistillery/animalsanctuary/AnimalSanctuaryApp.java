package com.skilldistillery.animalsanctuary;

import java.util.Scanner;

public class AnimalSanctuaryApp {
    private Sanctuary sanctuary;
    private Scanner scanner;

    public AnimalSanctuaryApp() {
        this.sanctuary = new Sanctuary();
        this.scanner = new Scanner(System.in);
        initializeSanctuary();
    }

    public static void main(String[] args) {
        AnimalSanctuaryApp app = new AnimalSanctuaryApp();
        app.launchApp();
    }

    private void initializeSanctuary() {
        sanctuary.addAnimal(new BluePoisonDartFrog("Bluey"), false);
        sanctuary.addAnimal(new PantherChameleon("Chamy"), false);
        sanctuary.addAnimal(new FireSalamander("Sal"), false);
        sanctuary.addAnimal(new Hellbender("Hellie"), false);
        sanctuary.addAnimal(new CaneToad("Cane"), false);
    }

    public void launchApp() {
        Attendant attendant = new Attendant();
        sanctuary.setAttendant(attendant);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. List Animals");
            System.out.println("2. Add a New Animal");
            System.out.println("3. Start Attendant's Rounds");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    sanctuary.listAnimals();
                    break;
                case 2:
                    addNewAnimal();
                    break;
                case 3:
                    sanctuary.startAttendantRounds();
                    break;
                case 4:
                    System.out.println("Thanks for visiting our Animal Sanctuary! We hope you had a wild time! See you next time!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addNewAnimal() {
        System.out.println("Choose an animal type to add:");
        System.out.println("1. Blue Poison Dart Frog");
        System.out.println("2. Panther Chameleon");
        System.out.println("3. Fire Salamander");
        System.out.println("4. Hellbender");
        System.out.println("5. Cane Toad");
        System.out.print("Enter your choice: ");
        int type = scanner.nextInt();
        scanner.nextLine(); 

        if (type < 1 || type > 5) {
            System.out.println("Invalid animal type. Returning to main menu.");
            return;
        }

        System.out.print("Enter the animal's name: ");
        String name = scanner.nextLine();

        Animal animal = null;
        switch (type) {
            case 1:
                animal = new BluePoisonDartFrog(name);
                break;
            case 2:
                animal = new PantherChameleon(name);
                break;
            case 3:
                animal = new FireSalamander(name);
                break;
            case 4:
                animal = new Hellbender(name);
                break;
            case 5:
                animal = new CaneToad(name);
                break;
        }

        sanctuary.addAnimal(animal);
    }
}
