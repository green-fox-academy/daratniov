import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        System.out.println("Give me a distance in miles: ");
        Scanner input = new Scanner(System.in);
        double distance = input.nextDouble();
        distance=distance*1.609344;
        System.out.println("That distance is " + distance + " km.");
    }
}