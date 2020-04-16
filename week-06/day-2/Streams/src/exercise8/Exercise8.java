package exercise8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
    List<Character> listOfCharacters = Arrays.asList('T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 's', 't', 'r', 'i', 'n', 'g', '!');
    String string = listOfCharacters.stream().map(String::valueOf).collect(Collectors.joining());
    System.out.println(string);
  }
}
