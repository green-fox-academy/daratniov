package greenfoxorganization;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public Sponsor() {
    super();
    company = "Google";
    hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +
        " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }
}
