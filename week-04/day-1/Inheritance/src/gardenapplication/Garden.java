package gardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  private int countPlantsToAddWater() {
    int counter = 0;
    for (Plant plant : plants) {
      if (plant.needsWater()) {
        counter++;
      }
    }
    return counter;
  }

  public void wateringTheGarden(int water) {
    System.out.println("Watering with " + water);
    double waterOfOnePlant = (double) water / countPlantsToAddWater();
    for (Plant plant : plants) {
      plant.watering(waterOfOnePlant);
    }
  }

  public void printGarden() {
    for (Plant plant : plants) {
      plant.print();
    }
  }
}
