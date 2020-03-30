package aircraftcarrier;

public class Aircraft {
  protected int ammunition;
  protected int maxAmmo;
  protected int baseDamage;
  protected String type;

  public Aircraft() {
    this.ammunition = 0;
    this.maxAmmo = 0;
    this.baseDamage = 0;
    this.type = "Not defined";
  }

  public int fight() {
    ammunition = 0;
    return baseDamage * ammunition;
  }

  public int refill(int ammoToFill) {
    if (ammunition + ammoToFill <= maxAmmo) {
      ammunition += ammoToFill;
      ammoToFill = 0;
    } else {
      ammoToFill += ammunition - maxAmmo;
      ammunition = maxAmmo;
    }
    return ammoToFill;
  }

  public String getType() {
    return type;
  }

  public void getStatus() {
    System.out.println("Type: " + type + ", Ammo: " + ammunition +
        ", Base Damage: " + baseDamage + ", All Damage: " + ammunition * baseDamage);
  }

  public boolean isPriority() {
    return false;
  }
}
