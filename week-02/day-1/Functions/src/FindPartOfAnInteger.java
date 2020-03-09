import java.util.Arrays;

public class FindPartOfAnInteger {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(subInt(9, new int[] {1, 11, 34, 52, 61})));
        //  should print: '[]'
    }
    public static int[] subInt(int number, int[] array)
    {
        int newArrayLength=0;
        for (int i = 0; i < array.length ; i++) {
            if(String.valueOf(array[i]).contains(String.valueOf(number)))
            {
                newArrayLength++;
            }
        }
        int[] indices=new int[newArrayLength];
        int j=0;
        for (int i = 0; i < array.length ; i++) {
            if(String.valueOf(array[i]).contains(String.valueOf(number)))
            {
                indices[j]=i;
                j++;
            }
        }
        return indices;
    }
}