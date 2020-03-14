import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("978-1-60309-452-8", "A Letter to Jo");
        map.put("978-1-60309-459-7", "Lupus");
        map.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        map.put("978-1-60309-461-0", "The Lab");
        for (Map.Entry<String, String> item : map.entrySet()) {
            System.out.println(item.getValue() + " (ISBN: " + item.getKey());
        }
        map.remove("978-1-60309-444-3");
        for (Map.Entry<String, String> item : map.entrySet()) {
            if (item.getValue() == "The Lab") map.remove(item.getKey());
        }
        map.put("978-1-60309-450-4", "They Called Us Enemy");
        map.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(map.containsValue(map.get("478-0-61159-424-8")));
        System.out.println(map.get("978-1-60309-453-5"));
    }
}