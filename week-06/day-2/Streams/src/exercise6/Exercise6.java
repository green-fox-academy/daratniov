package exercise6;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
  public static void main(String[] args) {
    String string = "Write a Stream Expression to find the Uppercase characters in a string!";
    List<Character> uppercaseCharacters = string.chars()
        .filter(Character::isUpperCase)
        .mapToObj(character -> (char) character)
        .collect(Collectors.toList());
    System.out.println(uppercaseCharacters);
  }
}
