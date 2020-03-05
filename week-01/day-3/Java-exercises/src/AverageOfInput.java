import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me 5 integers: ");
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum+=input.nextInt();
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double)sum/5);
    }
}
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4