package cloneable;

public class Person {
  protected String gender;
  protected String name;
  protected int age;

  public Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    if (age >= 0) {
      this.age = age;
    }
    this.gender = gender;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}