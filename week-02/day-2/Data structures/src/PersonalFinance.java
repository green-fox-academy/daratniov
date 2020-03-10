import java.util.ArrayList;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> listOfExpenses = new ArrayList<>();
        listOfExpenses.add(500);
        listOfExpenses.add(1000);
        listOfExpenses.add(1250);
        listOfExpenses.add(175);
        listOfExpenses.add(800);
        listOfExpenses.add(120);
        System.out.println(spend(listOfExpenses));
        System.out.println(greatestExpense(listOfExpenses));
        System.out.println(cheapestSpending(listOfExpenses));
        System.out.println(averageSpendings(listOfExpenses));
    }
    public static int spend(ArrayList<Integer> list) {
        int sum=0;
        for (Integer element :list) {
            sum+=element;
        }
        return sum;
    }
    public static int greatestExpense(ArrayList<Integer> list) {
        int greatest=list.get(0);
        for (int i = 0; i < list.size() ; i++) {
            if(greatest<list.get(i)) greatest=list.get(i);
        }
        return greatest;
    }
    public static int cheapestSpending(ArrayList<Integer> list) {
        int cheapest=list.get(0);
        for (int i = 0; i < list.size() ; i++) {
            if(cheapest>list.get(i)) cheapest=list.get(i);
        }
        return cheapest;
    }
    public static double averageSpendings(ArrayList list) {
        double sum=spend(list);
        return sum/list.size();
    }
}