import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        System.out.println(ticTacResult("assets/win-x.txt"));
    }

    private static String ticTacResult(String filename) {
        Path path= Paths.get(filename);
        char[][] symbols=new char[3][3];
        String[] results=new String[8];
        try{
            List<String> lines= Files.readAllLines(path);
            for (int i = 0; i <3 ; i++) {
                for (int j = 0; j <3 ; j++) {
                    symbols[i][j]=lines.get(i).charAt(j);
                }
            }
            results[0]=String.valueOf(symbols[0][0])+String.valueOf(symbols[0][1])+String.valueOf(symbols[0][2]);
            results[1]=String.valueOf(symbols[1][0])+String.valueOf(symbols[1][1])+String.valueOf(symbols[1][2]);
            results[2]=String.valueOf(symbols[2][0])+String.valueOf(symbols[2][1])+String.valueOf(symbols[2][2]);
            results[3]=String.valueOf(symbols[0][0])+String.valueOf(symbols[1][0])+String.valueOf(symbols[2][0]);
            results[4]=String.valueOf(symbols[0][1])+String.valueOf(symbols[1][1])+String.valueOf(symbols[2][1]);
            results[5]=String.valueOf(symbols[0][2])+String.valueOf(symbols[1][2])+String.valueOf(symbols[2][2]);
            results[6]=String.valueOf(symbols[0][0])+String.valueOf(symbols[1][1])+String.valueOf(symbols[2][2]);
            results[7]=String.valueOf(symbols[2][2])+String.valueOf(symbols[1][1])+String.valueOf(symbols[0][0]);
            for (int i = 0; i <results.length ; i++) {
                if(results[i].equals("XXX")) return "X";
                if(results[i].equals("OOO")) return "O";
            }
        }catch (IOException e) {
            System.out.println("Could not open the file!");
        }
        return "Draw";
    }
}