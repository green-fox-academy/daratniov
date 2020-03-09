import java.util.Arrays;

public class SortThatList {

    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        System.out.println(Arrays.toString(sorter(new int[] {34, 12, 24, 9, 5},false)));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(sorter(new int[] {34, 12, 24, 9, 5}, true)));
        //  should print [34, 24, 12, 9, 5]
    }
    public static int[] sorter(int[] numbers,boolean descending)
    {
        Arrays.sort(numbers);
        if(descending)
        {
            int[] descendedArray=new int[numbers.length];
            for (int i = 0; i <numbers.length ; i++) {
                descendedArray[i]=numbers[numbers.length-i-1];
            }
            return descendedArray;
        }
        else return numbers;
    }
}
