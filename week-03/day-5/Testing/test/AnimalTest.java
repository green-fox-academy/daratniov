import static org.junit.Assert.*;

import animal.Animal;

import org.junit.Test;

public class AnimalTest {
  Animal animal = new Animal();

  @Test
  public void animalConstructor_Hunger_ReturnsEqual() {
    assertEquals(50, animal.hunger);
  }

  @Test
  public void animalConstructor_Thirst_ReturnsEqual() {
    assertEquals(50, animal.thirst);
  }

  @Test
  public void eat_EatOneTime_ReturnsEqual() {
    animal.eat();
    assertEquals(49, animal.hunger);
  }

  @Test
  public void eat_EatWhenHungerIsZero_ReturnsEqual() {
    animal.hunger = 0;
    animal.eat();
    assertEquals(0, animal.hunger);
  }

  @Test
  public void drink_DrinkOneTime_ReturnsEqual() {
    animal.drink();
    assertEquals(49, animal.thirst);
  }

  @Test
  public void drink_DrinkWhenThirstIsZero_ReturnsEqual() {
    animal.thirst = 0;
    animal.drink();
    assertEquals(0, animal.thirst);
  }

  @Test
  public void play_PlayOneTime_ReturnsEqual() {
    animal.play();
    assertEquals(51, animal.hunger);
    assertEquals(51, animal.thirst);
  }

  @Test
  public void play_PlayWhenHungerAndThirstIs100_ReturnsEqual() {
    animal.hunger = 100;
    animal.thirst = 100;
    animal.play();
    assertEquals(100, animal.hunger);
    assertEquals(100, animal.thirst);
  }
}