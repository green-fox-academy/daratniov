import java.util.Scanner;

public class SubStr {

    public static int subStr(String input, String q) {
        int answer=-1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == q.charAt(0)) {
                answer = i;
                for (int j = 0; j < q.charAt(q.length()); j++) {
                    if (input.charAt(i) == q.charAt(j))

                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give me two strings: ");
        String first = input.nextLine();
        String second = input.nextLine();
        System.out.println(subStr(first, second));
    }
}