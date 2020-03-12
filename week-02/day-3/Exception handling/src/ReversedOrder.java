import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        reverser("assets/reversed-order.txt");

    }

    private static void reverser(String fileName) {
        Path path = Paths.get(fileName);
        List<String> reversedLines = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                reversedLines.add(lines.get(lines.size() - i - 1));
            }
            Files.write(path, reversedLines);
        } catch (IOException e) {
            System.out.println("Could not open the file!");
        }
    }
}