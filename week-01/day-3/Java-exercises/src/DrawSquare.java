import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me an integer: ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            if(i==1 || i==number)
            {
                for (int j = 1; j <=number ; j++) System.out.print("%");
            }
            else
            {
                for (int j = 1; j <=number ; j++) {
                    if (j == 1 || j == number) System.out.print("%");
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
