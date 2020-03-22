package extension;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  public int add(int a, int b) {
    return a + b;
  }

  public int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > c) {
      return b;
    } else {
      return c;
    }
  }

  public double median(List<Integer> pool) {
    if (pool.size() == 0) {
      return 0;
    } else {
      int[] array = new int[pool.size()];

      for (int i = 0; i < pool.size(); i++) {
        array[i] = pool.get(i);
      }

      Arrays.sort(array);
      if (array.length % 2 != 0) {
        return array[(array.length - 1) / 2];
      } else {
        return (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
      }
    }
  }

  public boolean isVowel(char c) {
    String vowels = "aáeéiíoóöőuúüű";
    if (vowels.contains(Character.toString(c).toLowerCase())) {
      return true;
    } else {
      return false;
    }
  }

  public String translate(String hungarian) {
    if (hungarian.isEmpty()) {
      return null;
    } else {
      StringBuilder teve = new StringBuilder();
      teve.append(hungarian);
      int length = teve.length();

      for (int i = 0; i < length; i++) {
        char c = teve.charAt(i);
        if (isVowel(c)) {
          teve.replace(i, i + 1, Character.toString(c) + "v" + Character.toString(c).toLowerCase());
          i += 2;
          length += 2;
        }
      }

      return teve.toString();
    }
  }
}