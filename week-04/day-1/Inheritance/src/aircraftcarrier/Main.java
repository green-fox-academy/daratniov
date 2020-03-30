package aircraftcarrier;

public class Main {
  public static void main(String[] args) {
    Carrier carrier1 = new Carrier(2500, 5800);
    carrier1.add(new F35());
    carrier1.add(new F35());
    carrier1.add(new F35());
    carrier1.add(new F16());
    carrier1.add(new F16());

    Carrier carrier2 = new Carrier(2400, 4800);
    carrier2.add(new F35());
    carrier2.add(new F16());
    carrier2.add(new F16());
    carrier2.add(new F35());
    carrier2.add(new F16());

    System.out.println("-------------------------------------------------------------------------");
    System.out.println("Status before battle:");
    System.out.println("---------------------");
    carrier1.getStatus();
    System.out.println();
    carrier2.getStatus();
    System.out.println();
    System.out.println("-------------------------------------------------------------------------");

    while (carrier1.getHealthPoint() > 0 && carrier2.getHealthPoint() > 0) {
      carrier1.fill();
      carrier2.fill();
      carrier1.fight(carrier2);
    }

    System.out.println("Status after battle:");
    System.out.println("--------------------");
    carrier1.getStatus();
    System.out.println();
    carrier2.getStatus();
    System.out.println();
    System.out.println("-------------------------------------------------------------------------");

    if (carrier1.getHealthPoint() == carrier2.getHealthPoint()) {
      System.out.println("\n\t\t\t\t\tBOTH CARRIERS HAVE BEEN DESTROYED!");
    } else if (carrier1.getHealthPoint() > carrier2.getHealthPoint()) {
      System.out.println("\n\t\t\t\t\t\t1. CARRIER IS THE WINNER!");
    } else {
      System.out.println("\n\t\t\t\t\t\t2. CARRIER IS THE WINNER!");
    }
  }
}
