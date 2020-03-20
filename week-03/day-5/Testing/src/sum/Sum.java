package sum;

import java.util.ArrayList;

public class Sum {
  int sum;

  public int sum(ArrayList<Integer> numbers) {
    if (numbers == null) {
      return 0;
    } else {
      for (int number : numbers) {
        sum += number;
      }
      return sum;
    }
  }
}
