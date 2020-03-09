import java.util.ArrayList;
import java.util.List;

public class Unique {
    public static void main(String[] args) {

        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }
    public static List unique(int[] numbers)
    {
        List<Integer> list = new ArrayList<>();
        for (int element:numbers) {
            if (!list.contains(element)) list.add(element);
        }
        return list;
    }
}