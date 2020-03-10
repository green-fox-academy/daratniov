import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        System.out.println("Number of elements of the list: " + names.size());
        names.add("William");
        System.out.println("The list is empty? " + names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println("Number of elements of the list: " + names.size());
        System.out.println("The third element of the list is: " + names.get(2));
        for (String name: names) {
            System.out.println(name);
        }
        for (int i=0;i<names.size();i++) {
            System.out.println((i+1) + ". " + names.get(i));
        }
        names.remove(1);
        for (int i=0;i<names.size();i++) {
            System.out.println(names.get(names.size()-i-1));
        }
        names.clear();
    }
}