import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        Path path = Paths.get("assets/log.txt");
        try {
            List<String> list = Files.readAllLines(path);
            for(String IPAddress:addresses(list))
            {
                System.out.println(IPAddress);
            }
            System.out.println("GET/POST ratio is: " + ratio(list));
        } catch (IOException e) {
            System.out.println("Could not open file!");
        }
    }

    private static String[] addresses(List list){
        String[] addressArray=new String[list.size()];
        String[] oneLine;
        for (int i = 0; i <addressArray.length ; i++) {
            oneLine=list.get(i).toString().split("   ");
            addressArray[i]=oneLine[1];
        }
        return addressArray;
    }
    private static double ratio(List list){
        String oneLine=new String();
        double numberOfGET=0;
        double numberOfPOST=0;
        for (int i = 0; i <list.size() ; i++) {
            oneLine=list.get(i).toString();
            if(oneLine.contains("GET")) numberOfGET++;
            if(oneLine.contains("POST")) numberOfPOST++;
        }
        return numberOfGET/numberOfPOST;
    }
}