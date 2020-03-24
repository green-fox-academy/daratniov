import extension.Extension;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testAdd_2and7is9() {
    assertEquals(9, extension.add(2, 7));
  }

  @Test
  void testMaxOfThree_FirstIsTheBiggestThirdIsTheSmallest() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_ThirdIsTheBiggestFirstIsTheSmallest() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMaxOfThree_FirstIsTheBiggestSecondIsTheSmallest() {
    assertEquals(5, extension.maxOfThree(5, 3, 4));
  }

  @Test
  void testMaxOfThree_ThirdIsTheBiggestSecondIsTheSmallest() {
    assertEquals(5, extension.maxOfThree(4, 3, 5));
  }

  @Test
  void testMaxOfThree_SecondIsTheBiggestFirstIsTheSmallest() {
    assertEquals(5, extension.maxOfThree(3, 5, 4));
  }

  @Test
  void testMaxOfThree_SecondIsTheBiggestThirdIsTheSmallest() {
    assertEquals(5, extension.maxOfThree(4, 5, 3));
  }

  @Test
  void testMedian_FourNumbers() {
    assertEquals(5, extension.median(Arrays.asList(7, 5, 3, 5)));
  }

  @Test
  void testMedian_FiveNumbers() {
    assertEquals(3, extension.median(Arrays.asList(1, 2, 3, 4, 5)));
  }

  @Test
  void testMedian_EightNumbersButNotSorted() {
    assertEquals(2.5, extension.median(Arrays.asList(5, 2, -7, 4, -9, 0, 3, 6)));
  }

  @Test
  void testMedian_NineNumbersButNotSorted() {
    assertEquals(4, extension.median(Arrays.asList(3, 8, -1, 5, 0, 4, 9, 4, -11)));
  }

  @Test
  void testMedian_TwoNumbers() {
    assertEquals(-1.5, extension.median(Arrays.asList(4, -7)));
  }

  @Test
  void testMedian_OneNumber() {
    assertEquals(2, extension.median(Arrays.asList(2)));
  }

  @Test
  void testMedian_ZeroNumber() {
    assertEquals(0, extension.median(Arrays.asList()));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testIsVowel_z() {
    assertFalse(extension.isVowel('z'));
  }

  @Test
  void testIsVowel_é() {
    assertTrue(extension.isVowel('é'));
  }

  @Test
  void testIsVowel_CapitalLetter() {
    assertTrue(extension.isVowel('É'));
  }

  @Test
  void testIsVowel_Space() {
    assertFalse(extension.isVowel(' '));
  }

  @Test
  void testIsVowel_SpecialCharacter() {
    assertFalse(extension.isVowel('!'));
  }

  @Test
  void testTranslate_Bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_Lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  void testTranslate_WithCapitalLetters() {
    assertEquals("Sziviavasztovok", extension.translate("Sziasztok"));
  }

  @Test
  void testTranslate_WithCapitalVowels() {
    assertEquals("Avalmava", extension.translate("Alma"));
  }

  @Test
  void testTranslate_OnlyOneLetter() {
    assertEquals("Ava", extension.translate("A"));
  }

  @Test
  void testTranslate_WithSpaces() {
    assertEquals("evegy kivis mavalavac", extension.translate("egy kis malac"));
  }

  @Test
  void testTranslate_WithSpecialLettersToo() {
    assertEquals("Teve tuvudsz ívígy beveszévélnivi?", extension.translate("Te tudsz így beszélni?"));
  }

  @Test
  void testTranslate_Null() {
    assertEquals(null, extension.translate(""));
  }
}