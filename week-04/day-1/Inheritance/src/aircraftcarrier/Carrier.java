package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  List<Aircraft> carrier;
  private int carrierAmmo;
  private int healthPoint;

  public Carrier(int carrierAmmo, int healthPoint) {
    this.carrier = new ArrayList<>();
    this.carrierAmmo = carrierAmmo;
    this.healthPoint = healthPoint;
  }

  public void add(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  public void fill() {
    if (carrierAmmo == 0) {
      throw new RuntimeException("Not enough ammo in the carrier!");
    } else {
      for (Aircraft aircraft : carrier) {
        if (aircraft.isPriority()) {
          carrierAmmo = aircraft.refill(carrierAmmo);
        }
      }
      for (Aircraft aircraft : carrier) {
        if (!aircraft.isPriority()) {
          carrierAmmo = aircraft.refill(carrierAmmo);
        }
      }
    }
  }

  public void fight(Carrier anotherCarrier) {
    anotherCarrier.healthPoint -= this.totalDamage();
    this.healthPoint -= anotherCarrier.totalDamage();
    if (anotherCarrier.healthPoint < 0) {
      anotherCarrier.healthPoint = 0;
    }
    if (this.healthPoint < 0) {
      this.healthPoint = 0;
    }
    for (Aircraft aircraft : this.carrier) {
      aircraft.fight();
    }
    for (Aircraft aircraft : anotherCarrier.carrier) {
      aircraft.fight();
    }
  }

  private int totalDamage() {
    int damage = 0;
    for (Aircraft aircraft : this.carrier) {
      damage += aircraft.ammunition * aircraft.baseDamage;
    }
    return damage;
  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public void getStatus() {
    if (healthPoint == 0) {
      System.out.println("It's dead Jim :(");
    } else {
      System.out.println("HP: " + healthPoint + ", Aircraft count: " + carrier.size() +
          ", Ammo Storage: " + carrierAmmo + ", Total damage: " + totalDamage());
      System.out.println("Aircrafts:");
      for (Aircraft aircraft : carrier) {
        aircraft.getStatus();
      }
    }
  }
}