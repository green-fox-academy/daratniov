package exercise7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    char c = 'r';
    List<String> listOfCities = cities.stream()
        .filter(word -> word.startsWith(Character.toString(c).toUpperCase()))
        .collect(Collectors.toList());
    System.out.println(listOfCities);
  }
}
