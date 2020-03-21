import static org.junit.Assert.*;

import countletters.CountLetters;
import java.util.HashMap;
import org.junit.Test;

public class CountLettersTest {

  CountLetters dictionary;
  HashMap<Character, Integer> letters;
  String string;

  @Test
  public void letterCounter_OneWord_ReturnsTrue() {
    dictionary = new CountLetters();
    string = "coffe";
    letters = new HashMap<>();
    letters.put('c', 1);
    letters.put('o', 1);
    letters.put('f', 2);
    letters.put('e', 1);
    assertTrue(letters.equals(dictionary.letterCounter(string)));
  }

  @Test
  public void letterCounter_OneWordWithCapitals_ReturnsTrue() {
    dictionary = new CountLetters();
    string = "CocOBean";
    letters = new HashMap<>();
    letters.put('c', 2);
    letters.put('o', 2);
    letters.put('b', 1);
    letters.put('e', 1);
    letters.put('a', 1);
    letters.put('n', 1);
    assertTrue(letters.equals(dictionary.letterCounter(string)));
  }

  @Test
  public void letterCounter_MoreWordWithSpacesAndCapitals_ReturnsTrue() {
    dictionary = new CountLetters();
    string = "Weird world";
    letters = new HashMap<>();
    letters.put('w', 2);
    letters.put('e', 1);
    letters.put('i', 1);
    letters.put('r', 2);
    letters.put('d', 2);
    letters.put('o', 1);
    letters.put('l', 1);
    assertTrue(letters.equals(dictionary.letterCounter(string)));
  }

  @Test
  public void letterCounter_WholeSentencesWithSpecialCharacters_ReturnsTrue() {
    dictionary = new CountLetters();
    string = "Word or world?!";
    letters = new HashMap<>();
    letters.put('w', 2);
    letters.put('o', 3);
    letters.put('r', 3);
    letters.put('l', 1);
    letters.put('d', 2);
    assertTrue(letters.equals(dictionary.letterCounter(string)));
  }

  @Test
  public void letterCounter_EmptyString_ReturnsTrue() {
    dictionary = new CountLetters();
    string = "";
    letters = new HashMap<>();
    assertTrue(letters.equals(dictionary.letterCounter(string)));
  }

  @Test
  public void letterCounter_NullString_ReturnsTrue() {
    dictionary = new CountLetters();
    letters = new HashMap<>();
    assertEquals(null, dictionary.letterCounter(string));
  }
}