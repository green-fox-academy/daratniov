package flyable;

public class Helicopter extends Vehicle implements Flyable {
  @Override
  public void land() {
    System.out.println("The rotor stops spinning.");
  }

  @Override
  public void fly() {
    System.out.println("Grrrrrrrrrrrr");
  }

  @Override
  public void takeOff() {
    System.out.println("The rotor starts spinning");
  }
}
