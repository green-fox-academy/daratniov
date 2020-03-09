import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - i - 1];
        }
        numbers = Arrays.copyOf(reversedNumbers, reversedNumbers.length);
        for (int element : numbers) {
            System.out.println(element);
        }
    }
}