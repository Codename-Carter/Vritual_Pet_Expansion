package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        // Interact with a VirtualPet object in this method

        Scanner scanner = new Scanner(System.in);
        int userInput;

        VirtualPet rocky = new VirtualPet("Rocky");

        System.out.println("Welcome to Virtual Pet. Say Hello to " + rocky.getPetName());
        do {

            System.out.println("");
            System.out.println("Here is " + rocky.getPetName() + "s'" + " status");
            System.out.println("Hunger: " + rocky.getHungerPct());
            System.out.println("Thirst: " + rocky.getThirstPct());
            System.out.println("Boredom: " + rocky.getBoredomPct());

            System.out.println("");
            System.out.println("What do you want to do?");

            System.out.println("1. Feed " + rocky.getPetName());
            System.out.println("2. Get water for " + rocky.getPetName());
            System.out.println("3. Play with " + rocky.getPetName());
            System.out.println("4. Do nothing");
            System.out.println("5. Release " + rocky.getPetName() + " with the others!");

            userInput = scanner.nextInt();

            if (userInput == 1) {
                System.out.println("Thank you (:" + rocky.getPetName() + " is thirsty");
                rocky.feedPet();
                System.out.println("");

            } else if (userInput == 2) {
                rocky.getWater();
                System.out.println("");

            } else if (userInput == 3) {
                rocky.playWithPet();
                System.out.println("");

            } else if (userInput == 4) {
                rocky.doNothing();
                System.out.println("");

            } else if (userInput != 5) {
                System.out.println("");
                System.out.println("Figure out howdaaa use 1 through fiiieee");
            }

            rocky.tick();
        } while (userInput != 5 && rocky.getHungerPct() < 100 && rocky.getThirstPct() < 100
                && rocky.getBoredomPct() < 100);

        if (rocky.getHungerPct() >= 100) {

            System.out.println("HURRY! " + rocky.getPetName() + " is about to die of hunger!");
            System.out.println("            |\\");
            System.out.println("   \\`-. _.._| \\");
            System.out.println("    |_,'  __`. \\");
            System.out.println("    (.\\ _/.| _  |");
            System.out.println("   ,'      __ \\ |");
            System.out.println(" ,'     __/||\\  |");
            System.out.println("(Y8P  ,/|||||/  |");
            System.out.println("   `-'_----    /");
            System.out.println("      /`-._.-'/");
            System.out.println("      `-.__.-' RoCkY");

        } else if (rocky.getThirstPct() >= 100) {
            System.out.println("HURRY! " + rocky.getPetName() + " is about to die of thirst!");
            System.out.println("            |\\");
            System.out.println("   \\`-. _.._| \\");
            System.out.println("    |_,'  __`. \\");
            System.out.println("    (.\\ _/.| _  |");
            System.out.println("   ,'      __ \\ |");
            System.out.println(" ,'     __/||\\  |");
            System.out.println("(Y8P  ,/|||||/  |");
            System.out.println("   `-'_----    /");
            System.out.println("      /`-._.-'/");
            System.out.println("      `-.__.-' RoCkY");

        } else if (rocky.getBoredomPct() >= 100) {
            System.out.println("HURRY! " + rocky.getPetName() + " is about to die of boredom!");
            System.out.println("            |\\");
            System.out.println("   \\`-. _.._| \\");
            System.out.println("    |_,'  __`. \\");
            System.out.println("    (.\\ _/.| _  |");
            System.out.println("   ,'      __ \\ |");
            System.out.println(" ,'     __/||\\  |");
            System.out.println("(Y8P  ,/|||||/  |");
            System.out.println("   `-'_----    /");
            System.out.println("      /`-._.-'/");
            System.out.println("      `-.__.-' RoCkY");
        }

        scanner.close();
    }

}
