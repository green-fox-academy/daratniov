import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        reverser("assets/reversed-lines.txt");

    }

    private static void reverser(String fileName) {
        Path path = Paths.get(fileName);
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                builder.delete(0, builder.length());
                for (int j = 0; j < lines.get(i).length(); j++) {
                        builder.append(lines.get(i).charAt(lines.get(i).length()-j-1));
                }
                lines.set(i, builder.toString());
            }
            Files.write(path, lines);
        } catch (IOException e) {
            System.out.println("Could not open the file!");
        }
    }
}