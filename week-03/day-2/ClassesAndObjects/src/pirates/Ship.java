package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  Pirate captain;
  List<Pirate> crew;

  //Creates an empty ship
  public Ship() {
    crew = new ArrayList<>();
  }

  //Fill the ship with a captain, and a random number of pirates between 1 and 20
  public void fillShip() {
    captain = new Pirate(true);
    int numberOfPirates = (int) (Math.random() * 20 + 1);
    for (int i = 0; i < numberOfPirates; i++) {
      crew.add(new Pirate());
    }
  }

  //Kills everyone who is PASSED_OUT in both of the ships
  //Assign the winner and the loser ship with the given formula
  public boolean battle(Ship anotherShip) {
    for (Pirate pirate : this.crew) {
      if (pirate.status == Pirate.Status.PASSED_OUT) {
        pirate.status = Pirate.Status.DEAD;
      }
    }
    for (Pirate pirate : anotherShip.crew) {
      if (pirate.status == Pirate.Status.PASSED_OUT) {
        pirate.status = Pirate.Status.DEAD;
      }
    }
    if (this.alivePirateCounter() - this.captain.rumCounter > anotherShip.alivePirateCounter() - anotherShip.captain.rumCounter) {
      anotherShip.crewKiller();
      this.celebration();
      return true;
    } else {
      this.crewKiller();
      anotherShip.celebration();
      return false;
    }
  }

  //Counts the ALIVE pirates in the actual ship
  private int alivePirateCounter() {
    int alivePirate = 0;
    for (Pirate pirate : crew) {
      if (pirate.status == Pirate.Status.ALIVE) {
        alivePirate++;
      }
    }
    return alivePirate;
  }

  //Kills a random number of pirates between 1 and the number of ALIVE pirates in the loser ship
  private void crewKiller() {
    int numberOfDeaths = (int) (Math.random() * (alivePirateCounter() + 1));
    for (int i = 0; numberOfDeaths != 0; i++) {
      if (crew.get(i).status == Pirate.Status.ALIVE) {
        crew.get(i).status = Pirate.Status.DEAD;
        numberOfDeaths--;
      }
    }
  }

  //Everybody drinks a random number of rum between 1 and 4 in the winner ship
  private void celebration() {
    int numberOfRums = (int) (Math.random() * 4 + 1);
    for (int i = 0; i < numberOfRums; i++) {
      captain.drinkSomeRum();
    }
    for (Pirate pirate : crew) {
      numberOfRums = (int) (Math.random() * 4 + 1);
      for (int i = 0; i < numberOfRums; i++) {
        pirate.drinkSomeRum();
      }
    }
  }

  //Counts the PASSED_OUT pirates in the actual ship
  private int passedOutPirateCounter() {
    int passedOutPirate = 0;
    for (Pirate pirate : crew) {
      if (pirate.status == Pirate.Status.PASSED_OUT) {
        passedOutPirate++;
      }
    }
    return passedOutPirate;
  }

  //Counts the DEAD pirates in the actual ship
  private int deadPirateCounter() {
    int deadPirate = 0;
    for (Pirate pirate : crew) {
      if (pirate.status == Pirate.Status.DEAD) {
        deadPirate++;
      }
    }
    return deadPirate;
  }

  //Prints out the status of the captain
  public void stateOfTheCaptain() {
    System.out.println("The captain is " + captain.status + ".");
    System.out.println("Drank " + captain.rumCounter + " pint of rum.");
  }

  //Prints out the status of the ship
  public void stateOfTheShip() {
    System.out.println("ALIVE: " + alivePirateCounter() + ", PASSED OUT: " + passedOutPirateCounter()
        + ", DEAD: " + deadPirateCounter() + ", RUM: " + captain.rumCounter);
  }
}
