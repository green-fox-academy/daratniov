import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) {
            System.out.println(copier("assets/my-file.txt","assets/your-file.txt"));
    }

    private static boolean copier(String fileName1,String fileName2) {
        Path path1= Paths.get(fileName1);
        Path path2= Paths.get(fileName2);
        try{
            Files.write(path2,Files.readAllLines(path1));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}