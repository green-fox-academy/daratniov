import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String,Integer> product=new HashMap<>();
        product.put("Eggs",200);
        product.put("Milk",200);
        product.put("Fish",400);
        product.put("Apples",150);
        product.put("Bread",50);
        product.put("Chicken",550);
        System.out.println(product.get("Fish"));
        String mostExpensive="Eggs";
        for (Map.Entry<String, Integer> item : product.entrySet()) {
            if(item.getValue()>product.get(mostExpensive)) mostExpensive=item.getKey();
        }
        System.out.println(mostExpensive);

}


        Create an application which solves the following problems.

        How much is the fish?
        What is the most expensive product?
        What is the average price?
        How many products' price is below 300?
        Is there anything we can buy for exactly 125?
        What is the cheapest product?
