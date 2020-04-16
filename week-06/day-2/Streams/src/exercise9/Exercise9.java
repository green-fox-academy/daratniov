package exercise9;

import static java.util.stream.Collectors.*;


import java.util.Map;
import java.util.function.Function;

public class Exercise9 {
  public static void main(String[] args) {
    String string = "Write a Stream Expression to find the frequency of characters in a given string!";
    Map<Character, Long> frequencyOfCharacters = string.chars()
        .mapToObj(character -> (char) character)
        .filter(c -> !c.equals(' '))
        .map(c -> c.toString().toLowerCase().charAt(0))
        .collect(groupingBy(Function.identity(), counting()));
    System.out.println(frequencyOfCharacters.toString());
  }
}
