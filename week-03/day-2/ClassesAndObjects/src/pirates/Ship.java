package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  Pirate captain;
  List<Pirate> crew;

  public Ship() {
    crew = new ArrayList<>();
  }

  public void fillShip() {
    int numberOfPirates = (int) (Math.random() * 100);
    captain = new Pirate();
    for (int i = 0; i < numberOfPirates; i++) {
      crew.add(new Pirate());
    }
  }

  public void stateOfTheShip() {
    if (captain.isAlive && captain.rumCounter < 5) {
      System.out.println("The Captain is alive!");
    } else if (captain.isAlive) {
      System.out.println("The Captain passed out!");
    } else {
      System.out.println("The Captain is dead!");
    }
    System.out.println("The Captain drank " + captain.rumCounter + " pint of rum!");
    System.out.println(alivePirateCounter() + " pirate is alive!");
  }

  private int alivePirateCounter() {
    int alivePirate = 0;
    for (Pirate pirate : crew) {
      if (pirate.isAlive) {
        alivePirate++;
      }
    }
    return alivePirate;
  }

  public boolean battle(Ship anotherShip) {

    int numberOfDeaths;
    if (this.alivePirateCounter() - this.captain.rumCounter > anotherShip.alivePirateCounter() - anotherShip.captain.rumCounter) {
      numberOfDeaths = (int) (Math.random() * anotherShip.alivePirateCounter());
      for (Pirate pirate : anotherShip.crew) {
        while (numberOfDeaths != 0) {
          if (pirate.isAlive) {
            pirate.die();
            numberOfDeaths--;
          }
        }
      }
      return true;
    } else {
      numberOfDeaths = (int) (Math.random() * this.alivePirateCounter());
      for (Pirate pirate : this.crew) {
        while (numberOfDeaths != 0) {
          if (pirate.isAlive) {
            pirate.die();
            numberOfDeaths--;
          }
        }
      }
      return false;
    }
  }
}
