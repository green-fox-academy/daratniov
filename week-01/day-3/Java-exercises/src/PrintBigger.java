import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me two numbers: ");
        double number1= input.nextDouble();
        double number2= input.nextDouble();
        System.out.println("The bigger number is: ");
        if (number1>number2) System.out.println(number1);
        else if (number2>number1) System.out.println(number2);
    }
}