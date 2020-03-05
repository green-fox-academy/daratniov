import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Hello, User!");
        System.out.println("What is your name?");
        Scanner input=  new Scanner(System.in);
        String name= input.nextLine();
        System.out.println("Your name is: " + name);
    }
}