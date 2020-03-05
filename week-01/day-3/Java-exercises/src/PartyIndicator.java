import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many girls come to the party?");
        int girls= input.nextInt();
        System.out.println("How many boys come to the party?");
        int boys= input.nextInt();
        if(girls==0)
        {
            System.out.println("Sausage party");
        }
        else if(girls+boys>=20)
        {
            if (girls == boys)
            {
                System.out.println("The party is excellent!");
            }
            else {
                System.out.println("Quite cool party!");
            }
        }
        else {
            System.out.println("Average party...");
        }
    }
}