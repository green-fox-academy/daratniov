import static org.junit.Assert.*;

import anagram.Anagram;
import org.junit.Test;

public class AnagramTest {

  String str1;
  String str2;
  Anagram anagram;

  @Test
  public void isAnagram_WithoutSpaces_Equals() {
    str1 = "ákos";
    str2 = "soká";
    anagram = new Anagram();
    assertEquals(true, anagram.isAnagram(str1, str2));
  }

  @Test
  public void isAnagram_WithoutSpaces_NotEquals() {
    str1 = "ákoska";
    str2 = "soká";
    anagram = new Anagram();
    assertEquals(false, anagram.isAnagram(str1, str2));
  }

  @Test
  public void isAnagram_WithSpaces_Equals() {
    str1 = "szabad lexikon";
    str2 = "szexbika danol";
    anagram = new Anagram();
    assertEquals(true, anagram.isAnagram(str1, str2));
  }


  @Test
  public void isAnagram_WithSpacesWithCapitalLetters_Equals() {
    str1 = "Szabad Lexikon";
    str2 = "Index Kaszabol";
    anagram = new Anagram();
    assertEquals(true, anagram.isAnagram(str1, str2));
  }


  @Test
  public void isAnagram_WithSpecialLetters_Equals() {
    str1 = "Szabad Lexikon!!!!!";
    str2 = "***Koliszex-banda***";
    anagram = new Anagram();
    assertEquals(true, anagram.isAnagram(str1, str2));
  }

  @Test
  public void isAnagram_WithOutLetters_Equals() {
    str1 = "";
    str2 = "";
    anagram = new Anagram();
    assertEquals(true, anagram.isAnagram(str1, str2));
  }

  @Test
  public void isAnagram_OneOfThemIsNull_Equals() {
    anagram = new Anagram();
    assertEquals(false, anagram.isAnagram(str1, str2));
  }
}