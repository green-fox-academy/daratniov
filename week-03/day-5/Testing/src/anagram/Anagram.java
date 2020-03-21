package anagram;

import java.util.Arrays;

public class Anagram {

  //ANAGRAMMADAFAKA 1.8.2 BETA
  public boolean isAnagram(String str1, String str2) {
    if (str1 == null || str2 == null) {
      return false;
    }

    String ABC = " öüóqwertzuiopőúasdfghjkléáűíyxcvbnm";
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    for (int i = 0; i < str1.length(); i++) {
      if (!ABC.contains(Character.toString(str1.charAt(i)))) {
        str1 = str1.replace(str1.charAt(i), ' ');
      }
    }
    for (int i = 0; i < str2.length(); i++) {
      if (!ABC.contains(Character.toString(str2.charAt(i)))) {
        str2 = str2.replace(str2.charAt(i), ' ');
      }
    }

    str1 = str1.replaceAll(" ", "");
    str2 = str2.replaceAll(" ", "");

    char[] word1 = str1.toCharArray();
    char[] word2 = str2.toCharArray();

    Arrays.sort(word1);
    Arrays.sort(word2);

    return Arrays.equals(word1, word2);
  }
}