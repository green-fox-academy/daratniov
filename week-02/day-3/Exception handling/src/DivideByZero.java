import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        divider();
    }
    private static void divider() {
        System.out.print("Give me a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        try {
            System.out.println(10 / number);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}