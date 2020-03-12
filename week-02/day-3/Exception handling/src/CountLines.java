import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

        System.out.println(lineCounter("assets/my-file.txt"));
    }

    private static int lineCounter(String filename) {
        Path path = Paths.get("assets/my-file.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            int counts = 0;
            for (String line : lines) {
                counts++;
            }
            return counts;
        } catch (IOException e) {
            return 0;
        }
    }
}
