import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        Path path = Paths.get("assets/lottery.csv");
        List<String> lines = new ArrayList<>();
        lines = fileReader(lines, path);
        System.out.println(Arrays.toString(numberSearcher(lines)));
    }

    private static int[] numberSearcher(List lines) {
        String[] oneLine;
        int[] numbers = new int[5];
        HashMap<Integer, Integer> lotteryNumbers = new HashMap<>();
        int biggestKey = 0;
        int biggestValue;
        for (int i = 0; i < lines.size(); i++) {
            oneLine = lines.get(i).toString().split(";");
            for (int j = 0, k = oneLine.length - 5; k < oneLine.length; j++, k++) {
                numbers[j] = Integer.parseInt(oneLine[k]);
            }
            for (int j = 0; j < 5; j++) {
                if (lotteryNumbers.containsKey(numbers[j])) {
                    lotteryNumbers.replace(numbers[j], lotteryNumbers.get(numbers[j]) + 1);
                } else {
                    lotteryNumbers.put(numbers[j], 1);
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            biggestValue = 0;
            for (Map.Entry<Integer, Integer> item : lotteryNumbers.entrySet()) {
                if (item.getValue() > biggestValue) {
                    biggestValue = item.getValue();
                    biggestKey = item.getKey();
                }
            }
            numbers[i] = biggestKey;
            lotteryNumbers.remove(biggestKey);
        }
        return numbers;
    }

    private static List fileReader(List lines, Path path) {
        try {
            lines = Files.readAllLines(path);
        } catch (
                IOException e) {
            System.out.println("Could not read the file!");
        }
        return lines;
    }
}