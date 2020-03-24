package introductionexercise;

public class Mentor {
  String level;
  String gender;
  String name;
  int age;

  public Mentor() {
    name = "Jane Doe";
    age = 30;
    gender = "male";
    level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    if (age >= 0) {
      this.age = age;
    }
    this.gender = gender;
    this.level = level;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age +
        " year old " + gender + " " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }
}
