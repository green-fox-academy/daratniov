package exercise12;

import static java.util.stream.Collectors.*;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Exercise12 {
  public static void main(String[] args) {
    List<String> linesOfCharacters = new ArrayList<>();
    try {
      linesOfCharacters = Files.readAllLines(Paths.get("assets/swcharacters.csv"));
    } catch (IOException e) {
      System.out.println("Could not read the file!");
      System.exit(0);
    }

    List<Character> listOfCharacters = linesOfCharacters
        .stream()
        .skip(1)
        .map(line -> line.split(";"))
        .map(line -> new Character(line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7]))
        .collect(toList());

    System.out.println(listOfCharacters.stream()
        .map(c -> new Character(c.getName(), c.getHeight(), c.getMass().replace(",", ""), c.getHairColor(), c.getSkinColor(), c.getEyeColor(), c.getBirthYear(), c.getGender()))
        .filter(c -> isInteger(c.getMass()))
        .max(Comparator.comparing(c -> Integer.parseInt(c.getMass())))
        .orElseThrow(NoSuchElementException::new)
        .getName());

    System.out.println(listOfCharacters.stream()
        .filter(c -> c.getGender().equals("male"))
        .filter(c -> isInteger(c.getHeight()))
        .map(Character::getHeight)
        .mapToInt(Integer::parseInt)
        .summaryStatistics().getAverage());

    System.out.println(listOfCharacters.stream()
        .filter(c -> c.getGender().equals("female"))
        .filter(c -> isInteger(c.getHeight()))
        .map(Character::getHeight)
        .mapToInt(Integer::parseInt)
        .summaryStatistics().getAverage());

    Map<String, Map<String, Long>> mapOfGendersByAge = listOfCharacters.stream()
        .collect(groupingBy(Exercise12::groupingByGender, groupingBy(Exercise12::groupingByAge, counting())));

    mapOfGendersByAge.entrySet().forEach(System.out::println);
  }

  public static String groupingByAge(Character c) {
    String birthYear = c.getBirthYear().replace("BBY", "");
    if (birthYear.equals("unknown")) {
      return birthYear;
    } else {
      double year = Double.parseDouble(birthYear);
      if (year < 21) {
        return "below 21";
      } else if (year > 40) {
        return "above 40";
      } else {
        return "between 21 and 40";
      }
    }
  }

  public static String groupingByGender(Character c) {
    if (!c.getGender().equals("male") && !c.getGender().equals(("female"))) {
      return "other";
    } else {
      return c.getGender();
    }
  }

  public static boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
