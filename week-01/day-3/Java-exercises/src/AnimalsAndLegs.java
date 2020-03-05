import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of your chickens: ");
        int numberOfChickens = input.nextInt();
        System.out.println("Number of your pigs: ");
        int numberOfPigs = input.nextInt();
        System.out.println("They have " + (numberOfChickens*2+numberOfPigs*4) + " legs summary.");
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}