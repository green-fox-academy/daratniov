import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {
        Path path= Paths.get("assets/encoded-lines.txt");
        List<String> lines =new ArrayList<>();
        lines=fileReader(lines,path);
        encoder(lines);
        fileWriter(lines,path);
    }

    private static void encoder(List lines) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <lines.size(); i++) {
            builder.delete(0, builder.length());
            builder.append(lines.get(i));
            for (int j = 0; j <builder.length() ; j++) {
                if(builder.charAt(j)!=' ')
                builder.replace(j,j+1,Character.toString((char)((int)(builder.charAt(j))-1)));
            }
            lines.set(i,builder.toString());
        }
    }

    private static List fileReader(List lines, Path path) {
        try {
            lines=Files.readAllLines(path);
        } catch (
                IOException e) {
            System.out.println("Could not read the file!");
        }
        return lines;
    }

    private static void fileWriter(List lines, Path path) {
        try {
            Files.write(path,lines);
        } catch (
                IOException e) {
            System.out.println("Could not write the file!");
        }
    }
}