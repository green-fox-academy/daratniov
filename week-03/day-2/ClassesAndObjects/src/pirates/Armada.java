package pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> fleet;

  //Creates an empty armada
  public Armada() {
    fleet = new ArrayList<>();
  }

  //Fills the armada with a random number of ships between 1 and 10, and fills the ships too
  public void fillArmada() {
    int numberOfShips = (int) (Math.random() * 10 + 1);

    for (int i = 0; i < numberOfShips; i++) {
      fleet.add(new Ship());
      fleet.get(i).fillShip();
    }

  }

  //Clash two armadas by the given formula
  public boolean war(Armada anotherArmada) {
    int i = 0;
    int j = 0;
    while (i != this.fleet.size() && j != anotherArmada.fleet.size()) {
      if (this.fleet.get(i).battle(anotherArmada.fleet.get(j))) {
        j++;
      } else {
        i++;
      }
    }
    return j == anotherArmada.fleet.size();
  }
}
