package sharpieset;

import java.util.ArrayList;
import sharpie.Sharpie;

public class Main {
  public static void main(String[] args) {
    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.sharpies = new ArrayList<>();
    sharpieSet.sharpies.add(new Sharpie("green", 10.23));
    sharpieSet.sharpies.add(new Sharpie("red", 34.3));
    sharpieSet.sharpies.add(new Sharpie("black", 2.1));
    sharpieSet.sharpies.add(new Sharpie("brown", 3.23));
    System.out.println(sharpieSet.countUsable());
    for (int i = 0; i < 100; i++) {
      sharpieSet.sharpies.get(1).use();
      sharpieSet.sharpies.get(2).use();
    }
    System.out.println(sharpieSet.countUsable());
    sharpieSet.removeTrash();
    System.out.println(sharpieSet.sharpies.size());
  }
}
