package pirates;

public class WarApp {
  public static void main(String[] args) {
    boolean winner;
    Armada jackSparrowsFleet = new Armada();
    Armada barbossasFleet = new Armada();
    jackSparrowsFleet.fillArmada();
    barbossasFleet.fillArmada();

    System.out.println("--------------");
    System.out.println("BEFORE BATTLE:");
    System.out.println("---------------------------------------------------------------------");

    System.out.println("\tJACK SPARROW'S FLEET:");
    for (int i = 0; i < jackSparrowsFleet.fleet.size(); i++) {
      System.out.print("\t\t" + (i + 1) + ". Ship: ");
      jackSparrowsFleet.fleet.get(i).stateOfTheShip();
    }
    System.out.println("---------------------------------------------------------------------");

    System.out.println("\tBARBOSSA'S FLEET:");
    for (int i = 0; i < barbossasFleet.fleet.size(); i++) {
      System.out.print("\t\t" + (i + 1) + ". Ship: ");
      barbossasFleet.fleet.get(i).stateOfTheShip();
    }
    System.out.println("---------------------------------------------------------------------\n\n\n");

    winner = jackSparrowsFleet.war(barbossasFleet);

    System.out.println("-------------");
    System.out.println("AFTER BATTLE:");
    System.out.println("---------------------------------------------------------------------");

    System.out.println("\tJACK SPARROW'S FLEET:");
    for (int i = 0; i < jackSparrowsFleet.fleet.size(); i++) {
      System.out.print("\t\t" + (i + 1) + ". Ship: ");
      jackSparrowsFleet.fleet.get(i).stateOfTheShip();
    }
    System.out.println("---------------------------------------------------------------------");

    System.out.println("\tBARBOSSA'S FLEET:");
    for (int i = 0; i < barbossasFleet.fleet.size(); i++) {
      System.out.print("\t\t" + (i + 1) + ". Ship: ");
      barbossasFleet.fleet.get(i).stateOfTheShip();
    }
    System.out.println("---------------------------------------------------------------------\n\n");

    if (winner) {
      System.out.println("\t\t\t\t JACK SPARROW'S FLEET IS THE WINNER!\n\n");
    } else {
      System.out.println("\t\t\t\t BARBOSSA'S FLEET IS THE WINNER!\n\n");
    }
  }
}
