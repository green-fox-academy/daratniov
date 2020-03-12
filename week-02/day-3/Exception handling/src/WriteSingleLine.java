import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteSingleLine {
    public static void main(String[] args) {
        manipulator("assets/my-file.txt");
    }

    private static void manipulator(String filename) {
        Path path = Paths.get(filename);
        try {
            Files.writeString(path, "Áron Esztergomi");

        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}