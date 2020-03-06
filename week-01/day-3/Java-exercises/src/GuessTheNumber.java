import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number= 78;
        int guess;
        System.out.println("I thought a number. Figure out it with guesses!");
        do{
            guess=input.nextInt();
            if(guess<number) System.out.println("The stored number is higher");
            else if(guess>number) System.out.println("The stored number is lower");
        } while(number!=guess);
        System.out.println("You found the number: " + number);
    }
}
