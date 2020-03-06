import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me an integer: ");
        int number = input.nextInt();
        for (int i = 0; i <= number; i++) {
            for (int j = 1; j <= Math.abs(number / 2 + 1 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= number - 2 * Math.abs(number / 2 + 1 - i); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= Math.abs(number / 2 + 1 - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
