import java.util.Scanner;

public class SubStr {
    public static int subStr(String input, String q) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == q.charAt(0)) {
                for (int j = i, k = 0; j < input.length() && k < q.length(); j++, k++) {
                    if (input.charAt(j) != q.charAt(k)) break;
                    if (k == q.length() - 1) return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give me two strings!");
        System.out.println("First string: ");
        String first = input.nextLine();
        System.out.println("Second string: ");
        String second = input.nextLine();
        System.out.println(subStr(first, second));
    }
}