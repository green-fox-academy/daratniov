package countletters;

import java.util.HashMap;

public class CountLetters {
  public HashMap<Character, Integer> letterCounter(String string) {
    if (string == null) {
      return null;
    }

    String ABC = "öüóqwertzuiopőúasdfghjkléáűíyxcvbnm";
    HashMap<Character, Integer> letters = new HashMap<>();
    string = string.toLowerCase();

    for (char character : string.toCharArray()) {
      if (ABC.contains(Character.toString(character))) {
        if (letters.containsKey(character)) {
          letters.replace(character, letters.get(character) + 1);
        } else {
          letters.put(character, 1);
        }
      }
    }

    return letters;
  }
}