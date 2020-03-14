import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        Path path = Paths.get("assets/reversed-order.txt");
        List<String> reversedLines = new ArrayList<>();
        fileReader(reversedLines, path);
        fileWriter(reversedLines, path);
    }

    private static void fileReader(List reversedLines, Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                reversedLines.add(lines.get(lines.size() - i - 1));
            }
        } catch (IOException e) {
            System.out.println("Could not read the file!");
        }
    }

    private static void fileWriter(List reversedLines, Path path) {
        try {
            Files.write(path,reversedLines);
        } catch (
                IOException e) {
            System.out.println("Could not write the file!");
        }
    }
}

