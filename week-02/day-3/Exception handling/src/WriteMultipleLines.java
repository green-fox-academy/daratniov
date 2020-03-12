import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        multiplicator("assets/my-file.txt", "apple", 12);
    }

    private static void multiplicator(String location, String word, int number) {
        Path path = Paths.get(location);
        List<String> lines = new ArrayList<>();
        try {
            for (int i = 0; i < number; i++) {
                lines.add(word);
            }
            Files.write(path, lines);
        } catch (Exception e){}
    }
}