import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        Path path = Paths.get("assets/log.txt");
        try {
            List<String> list = Files.readAllLines(path);
            for(String element:addresses(list))
            {
                System.out.println(element);
            }
        } catch (IOException e) {
            System.out.println("Could not open file!");
        }
    }

    private static String[] addresses(List list) throws IOException{
        String[] addressArray=new String[list.size()];
        String[] oneLine;
        for (int i = 0; i <addressArray.length ; i++) {
            oneLine=list.get(i).toString().split("  ");
            list.get(i).toString().
            addressArray[i]=oneLine[6];

        }
        return addressArray;
    }
}

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.