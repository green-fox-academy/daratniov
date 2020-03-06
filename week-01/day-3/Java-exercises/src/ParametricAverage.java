import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("How many integers do you want to give me?");
        int num=input.nextInt();
        System.out.println("Give me " + num +" integers:");
        int sum=0;
        for (int i = 0; i <num ; i++) {
            sum+=input.nextInt();
        }
        if(num>0)  System.out.println("Sum: " + sum + ", Average: " + sum/num );
    }
}