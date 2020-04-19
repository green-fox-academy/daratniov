package exercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise11 {
  public static void main(String[] args) {
    List<String> linesOfFoxes = new ArrayList<>();
    try {
      linesOfFoxes = Files.readAllLines(Paths.get("assets/fox.txt"));
    } catch (IOException e) {
      System.out.println("Could not read the file!");
      System.exit(0);
    }

    linesOfFoxes.stream()
        .map(line -> Arrays.asList(line.split("[^a-zA-Z]+")))
        .flatMap(List::stream)
        .filter(s -> !s.equals(""))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(100)
        .forEach(element -> System.out.println(element.getKey() + ": " + element.getValue()));
  }
}

