package pirates;

public class BattleApp {
  public static void main(String[] args) {
    boolean winner;
    Ship ship1 = new Ship();
    Ship ship2 = new Ship();
    ship1.fillShip();
    ship2.fillShip();
    System.out.println("--------------");
    System.out.println("BEFORE BATTLE:");
    System.out.println("---------------------------------------------------------------------");

    System.out.print("\t1. ship state: ");
    ship1.stateOfTheShip();
    System.out.print("\t2. ship state: ");
    ship2.stateOfTheShip();
    System.out.println("---------------------------------------------------------------------\n\n\n");

    winner = ship1.battle(ship2);

    System.out.println("-------------");
    System.out.println("AFTER BATTLE:");
    System.out.println("---------------------------------------------------------------------");

    System.out.print("\t1. ship state: ");
    ship1.stateOfTheShip();
    System.out.print("\t2. ship state: ");
    ship2.stateOfTheShip();
    System.out.println("---------------------------------------------------------------------\n\n");

    if (winner) {
      System.out.println("\t\t\t\t\t\t1. SHIP IS THE WINNER!\n\n");
    } else {
      System.out.println("\t\t\t\t\t\t2. SHIP IS THE WINNER!\n\n");
    }
  }
}
