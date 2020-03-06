import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Give me two integers: ");
        int number1=input.nextInt();
        int number2=input.nextInt();
        if(number2<=number1) System.out.println("The second number should be bigger");
        else{
            for (int i = number1; i < number2; i++) System.out.println(i);
        }
    }
}