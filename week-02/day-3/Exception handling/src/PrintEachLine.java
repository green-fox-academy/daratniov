import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        try{
            printLines();
        }
        catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }

    private static void printLines()throws IOException {
        Path path=Paths.get("assets/my-file.txt");
        List<String> lines=Files.readAllLines(path);
        for (String line:lines) {
            System.out.println(line);
        }
    }
}