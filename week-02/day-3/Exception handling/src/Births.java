import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Births {

    public static void main(String[] args) {
        System.out.println(yearOfMostBirths("assets/births.csv"));
    }

    private static int yearOfMostBirths(String filename) {
        Path path = Paths.get(filename);
        String[] oneLine;
        String[] date;
        int year=0;
        try {
            List<String> list = Files.readAllLines(path);
            HashMap<Integer, Integer> years = new HashMap<>();
            for (int i = 0; i < list.size(); i++) {
                oneLine = list.get(i).toString().split(";");
                date = oneLine[1].split("-");
                year = Integer.parseInt(date[0]);
                if (years.containsKey(year)) years.replace(year, years.get(year) + 1);
                else {
                    years.put(year, 0);
                }
            }
            for (Integer key : years.keySet()) {
                if(years.get(key)>years.get(year)) year=key;
            }
        } catch (IOException e) {
            System.out.println("Could not open the file!");
        }
        return year;
    }
}