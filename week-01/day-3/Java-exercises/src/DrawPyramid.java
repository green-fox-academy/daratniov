import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Give me an integer: ");
        int number=input.nextInt();
        for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <=number-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=number-i ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}