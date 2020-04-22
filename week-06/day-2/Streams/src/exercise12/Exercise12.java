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

    List<StarWarsCharacter> listOfCharacters = convertToStarWarsCharacters(linesOfCharacters);
    System.out.println(getHeaviestCharacter(listOfCharacters));
    System.out.println(calculateAverageHeightBySpecificGender(listOfCharacters, "male"));
    System.out.println(calculateAverageHeightBySpecificGender(listOfCharacters, "female"));
    createMapOfGendersByAge(listOfCharacters).entrySet().forEach(System.out::println);
  }

  public static List<StarWarsCharacter> convertToStarWarsCharacters(List<String> linesOfCharacters) {
    return linesOfCharacters
        .stream()
        .skip(1)
        .map(line -> line.split(";"))
        .map(line -> new StarWarsCharacter(line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7]))
        .collect(toList());
  }

  public static String getHeaviestCharacter(List<StarWarsCharacter> listOfCharacters) {
    return listOfCharacters.stream()
        .filter(c -> isInteger(c.getMass()))
        .max(Comparator.comparing(c -> Integer.parseInt(c.getMass())))
        .orElseThrow(NoSuchElementException::new)
        .getName();
  }

  public static double calculateAverageHeightBySpecificGender(List<StarWarsCharacter> listOfCharacters, String gender) {
    return listOfCharacters.stream()
        .filter(c -> c.getGender().equals(gender))
        .filter(c -> isInteger(c.getHeight()))
        .map(StarWarsCharacter::getHeight)
        .mapToInt(Integer::parseInt)
        .summaryStatistics().getAverage();
  }

  public static Map<String, Map<String, Long>> createMapOfGendersByAge(List<StarWarsCharacter> listOfCharacters) {
    return listOfCharacters.stream()
        .collect(groupingBy(Exercise12::groupingByGender, groupingBy(Exercise12::groupingByAge, counting())));
  }

  private static String groupingByAge(StarWarsCharacter c) {
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

  private static String groupingByGender(StarWarsCharacter c) {
    if (!c.getGender().equals("male") && !c.getGender().equals(("female"))) {
      return "other";
    } else {
      return c.getGender();
    }
  }

  private static boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
