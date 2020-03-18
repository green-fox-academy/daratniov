package sharpieset;

import java.util.List;
import sharpie.Sharpie;

public class SharpieSet {
  List<Sharpie> sharpies;

  public int countUsable() {
    int counter = 0;
    for (Sharpie sharpie : this.sharpies) {
      if (sharpie.inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash() {
    for (int i = 0; i < this.sharpies.size(); i++) {
      if (this.sharpies.get(i).inkAmount == 0) {
        this.sharpies.remove(i);
        i--;
      }
    }
  }
}