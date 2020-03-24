package gardenapplication;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.addPlant(new Flower("yellow"));
    garden.addPlant(new Flower("blue"));
    garden.addPlant(new Tree("purple"));
    garden.addPlant(new Tree("orange"));
    garden.printGarden();
    System.out.println("");
    garden.wateringTheGarden(40);
    garden.printGarden();
    System.out.println("");
    garden.wateringTheGarden(70);
    garden.printGarden();
  }
}
