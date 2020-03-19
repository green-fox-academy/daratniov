package pirates;

public class Pirate {
  enum Status {ALIVE, DEAD, PASSED_OUT}

  Status status;
  int rumCounter;
  boolean parrot;

  //Creates an ALIVE pirate without parrot, with a random number of drunkenness between 0 and 4
  public Pirate() {
    rumCounter = (int) (Math.random() * 5);
    status = Status.ALIVE;
    parrot = false;
  }

  //The same as above but with parrot
  public Pirate(boolean parrot) {
    this();
    this.parrot = parrot;
  }

  //Drink one pint rum
  //If reaches 4,drink another pint rum, become PASSED_OUT, and drank rum become 0
  //If PASSED_OUT, drink a pint rum and become ALIVE
  public void drinkSomeRum() {
    if (status == Status.PASSED_OUT) {
      status = Status.ALIVE;
      rumCounter++;
    } else if (status == Status.ALIVE) {
      rumCounter++;
      if (rumCounter > 4) {
        status = Status.PASSED_OUT;
        rumCounter = 0;
      }
    }
  }

  //Asks a pirate, "How is it going?"
  public void howsItGoingMate() {
    if (status == Status.DEAD) {
      System.out.println("He is dead.");
    } else if (rumCounter == 4) {
      drinkSomeRum();
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    } else {
      drinkSomeRum();
      System.out.println("Pour me anudder!");
    }
  }

  //Kill the pirate
  public void die() {
    status = Status.DEAD;
  }

  //If one is ALIVE, but the other is DEAD or PASSED_OUT, the ALIVE pirate win automatically
  //If both of them are ALIVE, the result is 1-0 ,0-1 or 0-0 with 1/3 chance
  public void brawl(Pirate anotherPirate) {
    if (this.status == Status.ALIVE && anotherPirate.status == Status.ALIVE) {
      int chance = (int) (Math.random() * 3);
      if (chance == 0) {
        this.die();
      } else if (chance == 1) {
        anotherPirate.die();
      } else {
        this.die();
        anotherPirate.die();
      }
    } else if (this.status == Status.ALIVE) {
      anotherPirate.die();
    } else if (anotherPirate.status == Status.ALIVE) {
      this.die();
    }
  }

  //Prints out the state of a pirate
  public void stateOfAPirate() {
    System.out.println("status: " + status + ", rum: " + rumCounter);
  }
}