public class SumAllElements {
    public static void main(String[] args) {
        int[] numbers={3,4,5,6,7};
        int sum=0;
        for (int element:numbers) {
            sum+=element;
        }
        System.out.println(sum);
    }
}