package introductionexercise;

public class Sponsor {
  String gender;
  String name;
  int age;
  String company;
  int hiredStudents;

  public Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    if (age >= 0) {
      this.age = age;
    }
    this.gender = gender;
    this.company = company;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +
        " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }
}
