package pirates;

public class Pirate {
  int rumCounter;
  boolean isAlive;
  Parrot parrot;

  public Pirate() {
    rumCounter = 0;
    isAlive = true;
  }

  public void drinkSomeRum() {
    if (isAlive) {
      rumCounter++;
    } else {
      System.out.println("He is dead.");
    }
  }

  public void howsItGoingMate() {
    if (isAlive && rumCounter > 4) {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      rumCounter = 0;
    } else if (isAlive) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("He is dead.");
    }
  }

  public void die() {
    isAlive = false;
  }

  public void brawl(Pirate anotherPirate) {
    if (isAlive && anotherPirate.isAlive) {
      int chance = (int) (Math.random() * 3);
      if (chance == 0) {
        this.die();
      } else if (chance == 1) {
        anotherPirate.die();
      } else {
        this.die();
        anotherPirate.die();
      }
    }
  }
}
